# Batalha Naval em Java

Este projeto é uma implementação completa do clássico jogo Batalha Naval, desenvolvido em Java para execução diretamente no terminal/console. O sistema foi projetado de forma modular, com foco em legibilidade e separação de responsabilidades, oferecendo suporte para partidas locais e contra uma Inteligência Artificial estruturada.

---

## Modos de Jogo

### 1. Jogador vs Jogador (Multiplayer Local - PvP)
Neste modo, dois jogadores compartilham o mesmo terminal para disputar a partida. O fluxo é dividido em duas etapas:
* **Fase de Posicionamento:** Cada jogador define a coordenada e a orientação de suas embarcações de maneira oculta.
* **Fase de Ataque:** Os turnos são alternados. O sistema limpa o console dinamicamente a cada transição para evitar que um competidor veja o mapa do outro.

### 2. Jogador vs Máquina (Solo - PvE)
O jogador enfrenta o computador, que opera sob regras algorítmicas de tomada de decisão baseadas na dificuldade selecionada:

* **Dificuldade Normal:** A máquina simula um comportamento de aprendizado, errando obrigatoriamente os primeiros 5 tiros para balancear o jogo antes de ativar sua precisão de ataque.
* **Dificuldade Difícil:** A IA utiliza uma lógica rotativa baseada em 4 padrões geométricos de varredura indexados pelo número de turnos, alternando entre disparos de dispersão espacial e disparos focados.

> **Mecanismo de Segurança (Plano B):** Caso os padrões preditivos da IA falhem em encontrar células válidas em turnos avançados, o código executa uma busca sequencial reversa para garantir um disparo válido em águas não descobertas.

---

## Mecânica do Tabuleiro e Símbolos

O campo de batalha é representado por uma matriz bidimensional de **11x11** strings. A linha `0` e a coluna `0` são reservadas para os identificadores de eixos (Letras de A a J e números de 1 a 10).

Os estados de cada célula do tabuleiro são definidos pelos seguintes caracteres:

| Símbolo | Significado | Visibilidade no Jogo |
| :---: | :--- | :--- |
| `~` | Água limpa / Célula não atacada | Visível para ambos os jogadores |
| `N` | Posição ocupada por um navio intacto | Oculto para o oponente |
| `*` | Fogo (Navio atingido por um disparo) | Visível para ambos os jogadores |
| `X` | Tiro na água (Disparo que errou o alvo) | Visível para ambos os jogadores |

---

## Frota de Embarcações

Cada jogador possui um inventário de **5 navios** para posicionar estrategicamente no início da partida:

| ID | Tipo de Navio | Tamanho (Células) | Quantidade Limite |
| :---: | :--- | :---: | :---: |
| **1** | Porta-aviões | 5 | 1 |
| **2** | Navio-tanque | 4 | 1 |
| **3** | Destroyer | 3 | 2 |
| **4** | Cruzador | 2 | 1 |

---

## Estrutura do Código e Métodos

O arquivo `Main.java` concentra toda a lógica do sistema. Abaixo está a documentação das funções divididas por escopo de atuação:

### Funções de Interface e Utilidades
* **`logoJogo()`**: Renderiza o título do jogo em formato de arte ASCII no início da aplicação.
* **`espacamento()`**: Insere 5 quebras de linha consecutivas para organizar a visualização dos menus.
* **`limparPagina()`**: Insere 50 quebras de linha para simular a limpeza do console, ocultando o tabuleiro do jogador anterior.
* **`menu()`**: Exibe as opções principais do sistema (Iniciar PvP, Iniciar PvE ou Encerrar).
* **`entradaMenu()`**: Captura e retorna a opção numérica digitada pelo usuário no menu principal.
* **`menuPve()`**: Apresenta as opções de dificuldade para o combate contra a máquina.

### Funções de Manipulação do Tabuleiro
* **`criarTabuleiro()`**: Instancia a matriz 11x11, preenche os cabeçalhos de coordenadas e define o restante como água (`~`).
* **`exibirTabuleiro(tabuleiro)`**: Varre e imprime a matriz na tela exibindo todos os elementos reais (usado para ver o próprio mapa).
* **`exibirTabuleiroInimigo(tabuleiro)`**: Exibe a matriz omitindo os caracteres `N` (substituindo-os por `~`), permitindo visualizar apenas o histórico de ataques.
* **`letraParaColuna(letra)`**: Converte a string de entrada (A a J) no índice numérico correspondente da matriz (1 a 10). Retorna -1 para entradas inválidas.
* **`contarNaviosRestantes(tabuleiroReal)`**: Percorre a matriz em busca do caractere `N`. É o método responsável por validar as condições de vitória ou fim de jogo.

### Funções de Lógica de Posicionamento
* **`menuDirecaoNavio(contador, limite)`**: Exibe o estoque restante de navios e solicita a orientação (Horizontal ou Vertical).
* **`entradaDirecao()`**: Valida se a escolha de orientação do usuário é estritamente 1 ou 2.
* **`navioUsado(limiteNavios)`**: Controla o estoque de embarcações, decrementando o inventário caso a escolha seja válida e retornando o tamanho do navio correspondente.
* **`posicionarNavio(tabuleiro, tamanho, direcao)`**: Solicita as coordenadas, valida se o navio ultrapassa os limites da matriz (10x10) e checa se há sobreposição com navios existentes. Se válido, aplica o caractere `N`.
* **`faseDePositionamento(tabReal, nomeJogador)`**: Gerencia o loop sequencial até que o jogador posicione com sucesso todas as suas 5 embarcações.

### Funções de Combate e Inteligência Artificial
* **`realizarAtaque(tabRealAdversario, tabVisivelAtacante)`**: Lê a célula alvo informada. Aplica a penalidade de perda de turno caso o usuário atire em um local repetido (`X` ou `*`) e atualiza os mapas com o resultado do disparo.
* **`inteligenciaMaquina(tabuleiroJogador, dificuldade, contadorTiros)`**: Concentra as lógicas de varredura do computador para as dificuldades Normal e Difícil, gerenciando os acertos e erros programados.
* **`posicaoNaviosMaquina(tabuleiroMaquina, dificuldade)`**: Configura frotas estáticas para a máquina com base na dificuldade (bordas do mapa no modo normal e posições centrais no modo difícil).

### Funções de Controle de Fluxo
* **`loopAtaquePvP(...)`**: Centraliza o laço de repetição das rodadas entre os dois jogadores humanos até a eliminação completa de uma das frotas.
* **`loopAtaquePve(...)`**: Controla as rodadas alternadas entre o jogador humano e as jogadas calculadas pela máquina.
* **`main(args)`**: Ponto de entrada do programa. Controla o menu global e garante a persistência do software até que a opção de encerramento seja acionada.

---

## Como Compilar e Executar o Projeto

Certifique-se de possuir o Java Development Kit (JDK 11 ou superior) instalado em seu ambiente de desenvolvimento.

1. Abra o terminal do sistema operacional na pasta raiz do projeto.
2. Compile o código fonte respeitando a estrutura do pacote:
   ```bash
   javac br/com/senac/batalhanaval/Main.java
