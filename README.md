# ⚓ Batalha Naval em Java (Console)

Um jogo clássico de **Batalha Naval** desenvolvido em Java para rodar diretamente no terminal. O projeto conta com suporte a partidas locais entre dois jogadores ou contra o computador, apresentando uma inteligência artificial com dois níveis de dificuldade.

Projeto desenvolvido como parte do ecossistema educacional do **Senac**.

---

## 🚀 Funcionalidades

* **Modo PvP (Player vs Player):** Dois jogadores podem jogar localmente no mesmo computador, alternando os turnos no terminal.
* **Modo PvE (Player vs Machine):** Enfrente a máquina em dois níveis estratégicos:
    * **Normal:** A máquina erra os primeiros 5 tiros propositalmente para dar uma colher de chá, depois ativa a precisão de ataque.
    * **Difícil:** A máquina alterna entre 4 padrões de varredura geométrica baseados no turno, com uma taxa de acerto equilibrada e desafiadora.
* **Mecanismo "Plano B":** Caso os padrões preditivos da máquina não encontrem alvos, ela entra em modo de busca dinâmica na primeira área de água disponível.
* **Gerenciamento Dinâmico de Frotas:** Sistema que impede o posicionamento de navios sobrepostos ou para fora dos limites do tabuleiro.

---

## 🎮 Como Jogar

O jogo é ambientado em um tabuleiro de **10x10** posições úteis (linhas de 1 a 10 e colunas de A a J).

### 🛠️ Legenda do Tabuleiro

| Símbolo | Significado |
| :---: | :--- |
| `~` | **Água:** Posição ainda não atacada ou desconhecida pelo adversário. |
| `N` | **Navio:** Suas embarcações posicionadas (ocultas para o inimigo). |
| `*` | **Fogo!** Navio atingido com sucesso. |
| `X` | **Água:** O tiro errou o alvo e atingiu o oceano. |

### 🚢 Frota Disponível (Por Jogador)

Cada jogador possui um total de **5 navios** para posicionar estrategicamente na horizontal ou vertical:

| ID | Tipo de Navio | Espaço Ocupado | Qtd. Máxima |
| :---: | :--- | :---: | :---: |
| **1** | Porta-aviões | 5 células | 1 |
| **2** | Navio-tanque | 4 células | 1 |
| **3** | Destroyer | 3 células | 2 |
| **4** | Cruzador | 2 células | 1 |

---

## 📦 Como Executar o Projeto

### Pré-requisitos
* Ter o **Java JDK 11** (ou superior) instalado em sua máquina.

### Passo a Passo no Terminal

1. **Clone o repositório ou baixe o arquivo fonte:**
   ```bash
   git clone [https://github.com/seu-usuario/batalha-naval.git](https://github.com/seu-usuario/batalha-naval.git)

2. **Navegue até a pasta do projeto:
   ```bash
   cd batalha-naval
   
3. **Compile o código fonte:
   ```bash
   javac br/com/senac/batalhanaval/Main.java

4. **Execute o jogo:
   ```bash
   java br.com.senac.batalhanaval.Main

##🛠️ Estrutura Estrutural do Código

O código foi modularizado utilizando funções estáticas para garantir legibilidade e manutenção. As principais divisões de responsabilidade são:

* ´criarTabuleiro()´ e ´exibirTabuleiro()´ Responsáveis pela renderização e lógica visual da matriz de strings.
* ´faseDePositionamento()´ Controla o fluxo onde o jogador escolhe as coordenadas e a orientação dos navios, aplicando regras de colisão.
* ´realizarAtaque()´ Valida se o tiro foi repetido, se acertou a água ou se causou dano a uma embarcação.
* ´inteligenciaMaquina()´ Concentra as regras algorítmicas de tomada de decisão do computador com base na dificuldade escolhida.
