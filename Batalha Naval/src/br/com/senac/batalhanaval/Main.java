package br.com.senac.batalhanaval;

import java.util.Scanner;

public class Main {


    static Scanner ENTRADA = new Scanner(System.in);


    public static void logoJogo() {
        System.out.println("BBBBBBBBBBBBBBBBB                             tttt                            lllllllhhhhhhh                                    NNNNNNNN        NNNNNNNN                                                        lllllll");
        System.out.println("B::::::::::::::::B                         ttt:::t                            l:::::lh:::::h                                    N:::::::N       N::::::N                                                        l:::::l");
        System.out.println("B::::::BBBBBB:::::B                        t:::::t                            l:::::lh:::::h                                    N::::::::N      N::::::N                                                        l:::::l");
        System.out.println("BB:::::B     B:::::B                       t:::::t                            l:::::lh:::::h                                    N:::::::::N     N::::::N                                                        l:::::l");
        System.out.println("  B::::B     B:::::B  aaaaaaaaaaaaa  ttttttt:::::ttttttt      aaaaaaaaaaaaa    l::::l h::::h hhhhh         aaaaaaaaaaaaa        N::::::::::N    N::::::N  aaaaaaaaaaaaavvvvvvv           vvvvvvvaaaaaaaaaaaaa    l::::l");
        System.out.println("  B::::B     B:::::B  a::::::::::::a t:::::::::::::::::t      a::::::::::::a   l::::l h::::hh:::::hhh      a::::::::::::a       N:::::::::::N   N::::::N  a::::::::::::av:::::v         v:::::v a::::::::::::a   l::::l");
        System.out.println("  B::::BBBBBB:::::B   aaaaaaaaa:::::at:::::::::::::::::t      aaaaaaaaa:::::a  l::::l h::::::::::::::hh    aaaaaaaaa:::::a      N:::::::N::::N  N::::::N  aaaaaaaaa:::::av:::::v       v:::::v  aaaaaaaaa:::::a  l::::l");
        System.out.println("  B:::::::::::::BB             a::::atttttt:::::::tttttt               a::::a  l::::l h:::::::hhh::::::h            a::::a      N::::::N N::::N N::::::N           a::::a v:::::v     v:::::v            a::::a  l::::l");
        System.out.println("  B::::BBBBBB:::::B     aaaaaaa:::::a      t:::::t              aaaaaaa:::::a  l::::l h::::::h   h::::::h    aaaaaaa:::::a      N::::::N  N::::N:::::::N    aaaaaaa:::::a  v:::::v   v:::::v      aaaaaaa:::::a  l::::l");
        System.out.println("  B::::B     B:::::B  aa::::::::::::a      t:::::t            aa::::::::::::a  l::::l h:::::h     h:::::h  aa::::::::::::a      N::::::N   N:::::::::::N  aa::::::::::::a   v:::::v v:::::v     aa::::::::::::a  l::::l");
        System.out.println("  B::::B     B:::::B a::::aaaa::::::a      t:::::t           a::::aaaa::::::a  l::::l h:::::h     h:::::h a::::aaaa::::::a      N::::::N    N::::::::::N a::::aaaa::::::a    v:::::v:::::v     a::::aaaa::::::a  l::::l");
        System.out.println("  B::::B     B:::::Ba::::a    a:::::a      t:::::t    tttttta::::a    a:::::a  l::::l h:::::h     h:::::ha::::a    a:::::a      N::::::N     N:::::::::Na::::a    a:::::a     v:::::::::v     a::::a    a:::::a  l::::l");
        System.out.println("BB:::::BBBBBB::::::Ba::::a    a:::::a      t::::::tttt:::::ta::::a    a:::::a l::::::lh:::::h     h:::::ha::::a    a:::::a      N::::::N      N::::::::Na::::a    a:::::a      v:::::::v      a::::a    a:::::a l::::::l");
        System.out.println("B:::::::::::::::::B a:::::aaaa::::::a      tt::::::::::::::ta:::::aaaa::::::a l::::::lh:::::h     h:::::ha:::::aaaa::::::a      N::::::N       N:::::::Na:::::aaaa::::::a       v:::::v       a:::::aaaa::::::a l::::::l");
        System.out.println("B::::::::::::::::B   a::::::::::aa:::a       tt:::::::::::tt a::::::::::aa:::al::::::lh:::::h     h:::::h a::::::::::aa:::a     N::::::N        N::::::N a::::::::::aa:::a       v:::v         a::::::::::aa:::al::::::l");
        System.out.println("BBBBBBBBBBBBBBBBB     aaaaaaaaaa  aaaa         ttttttttttt    aaaaaaaaaa  aaaallllllllhhhhhhh     hhhhhhh  aaaaaaaaaa  aaaa     NNNNNNNN         NNNNNNN  aaaaaaaaaa  aaaa        vvv           aaaaaaaaaa  aaaallllllll");
    }

    public static void espacamento() {
        for (int i = 0; i < 5; i++) System.out.println();
    }

    public static void limparPagina() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static void menu() {
        System.out.println("                                                                                                  ===========MENU===========");
        System.out.println("                                                                                                        1.Iniciar PvP.");
        System.out.println("                                                                                                        2.Iniciar PvE.");
        System.out.println("                                                                                                        3.Encerrar.");
    }

    public static int entradaMenu() {
        System.out.print("                                                                                                        Qual opção: ");
        return ENTRADA.nextInt();
    }

    // TABULEIRO

    public static String[][] criarTabuleiro() {
        String[][] tabuleiro = new String[11][11];
        tabuleiro[0][0] = " X";
        tabuleiro[0][1]  = "A"; 
        tabuleiro[0][2]  = "B"; 
        tabuleiro[0][3]  = "C"; 
        tabuleiro[0][4]  = "D";
        tabuleiro[0][5]  = "E"; 
        tabuleiro[0][6]  = "F"; 
        tabuleiro[0][7]  = "G"; 
        tabuleiro[0][8]  = "H";
        tabuleiro[0][9]  = "I"; 
        tabuleiro[0][10] = "J";
        tabuleiro[1][0]  = " 1"; 
        tabuleiro[2][0]  = " 2"; 
        tabuleiro[3][0]  = " 3"; 
        tabuleiro[4][0]  = " 4";
        tabuleiro[5][0]  = " 5"; 
        tabuleiro[6][0]  = " 6"; 
        tabuleiro[7][0]  = " 7"; 
        tabuleiro[8][0]  = " 8";
        tabuleiro[9][0]  = " 9"; 
        tabuleiro[10][0] = "10";
        for (int i = 1; i < 11; i++)
            for (int j = 1; j < 11; j++)
                tabuleiro[i][j] = "~";
        return tabuleiro;
    }

    public static void exibirTabuleiro(String[][] tabuleiro) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++)
                System.out.print(" " + tabuleiro[i][j] + "  ");
            System.out.println();
        }
    }

    // Exibe o tabuleiro da máquina ocultando os "N" (navios não atingidos)
    public static void exibirTabuleiroInimigo(String[][] tabuleiro) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                String celula = tabuleiro[i][j];
                // Oculta "N" (navio intacto), exibe o restante normalmente
                System.out.print(" " + (celula.equals("N") ? "~" : celula) + "  ");
            }
            System.out.println();
        }
    }


    // MENUS DE POSICIONAMENTO


    public static void menuDirecaoNavio(int contadorNavios, int[] limiteNavios) {
        System.out.println("========= Lista de Navios Disponíveis: =========");
        System.out.println("1 -> " + limiteNavios[1] + " Porta-aviões (ocupa 5 espaços)");
        System.out.println("2 -> " + limiteNavios[2] + " Navio-tanque (ocupa 4 espaços)");
        System.out.println("3 -> " + limiteNavios[3] + " Destroyer    (ocupa 3 espaços)");
        System.out.println("4 -> " + limiteNavios[4] + " Cruzador     (ocupa 2 espaços)\n");
        System.out.println("========= Escolha em qual direção será posicionado o " + contadorNavios + "° navio =========\n");
        System.out.println("1. HORIZONTAL.");
        System.out.println("2. VERTICAL.\n");
    }

    public static int entradaDirecao() {
        int direcao = 0;
        do {
            System.out.print("Qual opção: ");
            direcao = ENTRADA.nextInt();
            if (direcao < 1 || direcao > 2)
                System.out.println("Opção inválida, tente novamente.\n");
        } while (direcao < 1 || direcao > 2);
        return direcao;
    }

    public static int navioUsado(int[] limiteNavios) {
        int tamanho = 0;
        boolean escolhaValida = false;
        while (!escolhaValida) {
            System.out.print("Qual navio posicionará agora (1 a 4)? ");
            int opcao = ENTRADA.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                if (limiteNavios[opcao] > 0) {
                    limiteNavios[opcao]--;
                    escolhaValida = true;
                    if      (opcao == 1) tamanho = 5;
                    else if (opcao == 2) tamanho = 4;
                    else if (opcao == 3) tamanho = 3;
                    else                tamanho = 2;
                } else {
                    System.out.println("Erro: Você já usou todos os navios desse tipo! Escolha outro.\n");
                }
            } else {
                System.out.println("Opção inválida! Escolha um número de 1 a 4.\n");
            }
        }
        return tamanho;
    }

    public static int letraParaColuna(String letra) {
        switch (letra.toUpperCase()) {
            case "A": return 1; 
            case "B": return 2; 
            case "C": return 3;
            case "D": return 4; 
            case "E": return 5; 
            case "F": return 6;
            case "G": return 7; 
            case "H": return 8; 
            case "I": return 9;
            case "J": return 10; 
            default: return -1;
        }
    }

    // Conta células "N" restantes — usado para detectar fim de jogo
    public static int contarNaviosRestantes(String[][] tabuleiroReal) {
        int count = 0;
        for (int i = 1; i < 11; i++)
            for (int j = 1; j < 11; j++)
                if (tabuleiroReal[i][j].equals("N")) count++;
        return count;
    }

    // =========================================================
    // POSICIONAMENTO
    // =========================================================

    public static String[][] posicionarNavio(String[][] tabuleiro, int tamanho, int direcao) {
        int linha = 0, coluna = 0;
        boolean posicaoFinalizada = false;

        while (!posicaoFinalizada) {
            coluna = -1;
            while (coluna == -1) {
                System.out.print("Digite a Coluna (A-J): ");
                coluna = letraParaColuna(ENTRADA.next());
                if (coluna == -1) System.out.println("Coluna inválida! Tente novamente.");
            }

            linha = 0;
            while (linha < 1 || linha > 10) {
                System.out.print("Digite a Linha (1-10): ");
                linha = ENTRADA.nextInt();
                if (linha < 1 || linha > 10) System.out.println("Linha inválida! Tente novamente.");
            }

            boolean cabeEtaLivre = true;
            if (direcao == 1) {
                if (coluna + tamanho - 1 > 10) {
                    System.out.println("Erro: O navio não cabe nessa posição na horizontal!");
                    cabeEtaLivre = false;
                } else {
                    for (int j = coluna; j < coluna + tamanho; j++) {
                        if (tabuleiro[linha][j].equals("N")) {
                            System.out.println("Erro: Posição já ocupada por outro navio!");
                            cabeEtaLivre = false; break;
                        }
                    }
                }
            } else {
                if (linha + tamanho - 1 > 10) {
                    System.out.println("Erro: O navio não cabe nessa posição na vertical!");
                    cabeEtaLivre = false;
                } else {
                    for (int j = linha; j < linha + tamanho; j++) {
                        if (tabuleiro[j][coluna].equals("N")) {
                            System.out.println("Erro: Posição já ocupada por outro navio!");
                            cabeEtaLivre = false; break;
                        }
                    }
                }
            }

            if (cabeEtaLivre) {
                posicaoFinalizada = true;
                if (direcao == 1) {
                    for (int j = coluna; j < coluna + tamanho; j++){ 
                        tabuleiro[linha][j] = "N";
                        }
                }else {             
                    for (int j = linha;  j < linha  + tamanho; j++) {
                        tabuleiro[j][coluna] = "N";
                }
            } else {
                System.out.println("Por favor, escolha novas coordenadas.\n");
            }
        }

        espacamento();
        exibirTabuleiro(tabuleiro);
        espacamento();
        return tabuleiro;
    }

    public static String[][] faseDePositionamento(String[][] tabReal, String nomeJogador) {
        int contadorNavios = 0;
        int[] limiteNavios = {0, 1, 1, 2, 1};

        limparPagina();
        System.out.println("========= " + nomeJogador + " — Posicione seus navios! =========\n");
        exibirTabuleiro(tabReal);
        espacamento();

        do {
            limparPagina();
            exibirTabuleiro(tabReal);
            espacamento();
            menuDirecaoNavio(contadorNavios + 1, limiteNavios);
            int direcao = entradaDirecao();
            int tamanho = navioUsado(limiteNavios);
            tabReal = posicionarNavio(tabReal, tamanho, direcao);
            contadorNavios++;
        } while (contadorNavios != 5);

        return tabReal;
    }


   
    public static boolean realizarAtaque(String[][] tabRealAdversario, String[][] tabVisivelAtacante) {
        int coluna = -1, linha = 0;

        while (coluna == -1) {
            System.out.print("Digite a Coluna para atacar (A-J): ");
            coluna = letraParaColuna(ENTRADA.next());
            if (coluna == -1) {
                System.out.println("Coluna inválida! Tente novamente.");
            }
        }

        while (linha < 1 || linha > 10) {
            System.out.print("Digite a Linha para atacar (1-10): ");
            linha = ENTRADA.nextInt();
            if (linha < 1 || linha > 10) {
                System.out.println("Linha inválida! Tente novamente.");
            }
        }

        String posicao = tabVisivelAtacante[linha][coluna];
        if (posicao.equals("X") || posicao.equals("O") || posicao.equals("*")) {
            System.out.println("Você já atacou essa posição! Turno perdido.\n");
            return false;
        }

        if (tabRealAdversario[linha][coluna].equals("N")) {
            tabRealAdversario[linha][coluna] = "*";
            tabVisivelAtacante[linha][coluna] = "*";
            System.out.println("\n>>> BOOM! Navio atingido! <<<\n");
            return true;
        } else {
            tabVisivelAtacante[linha][coluna] = "X";
            System.out.println("\n>>> Splash! Água! <<<\n");
            return false;
        }
    }

    // =========================================================
    // INTELIGÊNCIA DA MÁQUINA (PvE) — do Caleb, corrigida
    // =========================================================

    /*
     * Normal (dificuldade 1): erra os primeiros 5 tiros, depois acerta.
     * Difícil (dificuldade 2): alterna 4 padrões de busca via módulo do contador.
     * Plano B: se o padrão não encontrar nada, atira na primeira água disponível.
     */
    public static void inteligenciaMaquina(String[][] tabuleiroJogador, int dificuldade, int contadorTiros) {
        switch (dificuldade) {
            case 1: // NORMAL — erra nos primeiros 5 tiros, depois acerta
                if (contadorTiros <= 5) {
                    for (int i = 10; i >= 1; i--) {
                        for (int j = 10; j >= 1; j--) {
                            if (tabuleiroJogador[i][j].equals("~")) {
                                tabuleiroJogador[i][j] = "X";
                                System.out.println("O inimigo errou o tiro!");
                                return;
                            }
                        }
                    }
                } else {
                    for (int i = 10; i >= 1; i--) {
                        for (int j = 1; j < 11; j++) {
                            if (tabuleiroJogador[i][j].equals("N")) {
                                tabuleiroJogador[i][j] = "*";
                                System.out.println("Seu barco foi atingido!");
                                return;
                            }
                        }
                    }
                }
                break;

            case 2: // DIFÍCIL — 4 padrões alternados, ~25% acerto por ciclo
                int padrao = contadorTiros % 4;
                switch (padrao) {
                    case 0: // busca água da esquerda para direita
                        for (int i = 1; i < 11; i++) {
                            for (int j = 1; j < 11; j++) {
                                if (tabuleiroJogador[i][j].equals("~")) {
                                    tabuleiroJogador[i][j] = "X";
                                    System.out.println("O inimigo errou o tiro!");
                                    return;
                                }
                            }
                        }
                        break;
                    case 1: // busca água da direita para esquerda
                        for (int i = 10; i >= 1; i--) {
                            for (int j = 10; j >= 1; j--) {
                                if (tabuleiroJogador[i][j].equals("~")) {
                                    tabuleiroJogador[i][j] = "X";
                                    System.out.println("O inimigo errou o tiro!");
                                    return;
                                }
                            }
                        }
                        break;
                    case 2: // busca navio por coluna
                        for (int j = 1; j < 11; j++) {
                            for (int i = 1; i < 11; i++) {
                                if (tabuleiroJogador[i][j].equals("N")) {
                                    tabuleiroJogador[i][j] = "*";
                                    System.out.println("Seu barco foi atingido!");
                                    return;
                                }
                            }
                        }
                        break;
                    case 3: // busca água invertida (erra de propósito para manter ~25%)
                        for (int i = 10; i >= 1; i--) {
                            for (int j = 10; j >= 1; j--) {
                                if (tabuleiroJogador[i][j].equals("~")) {
                                    tabuleiroJogador[i][j] = "X";
                                    System.out.println("O inimigo errou o tiro!");
                                    return;
                                }
                            }
                        }
                        break;
                }
                break;
        }

        // Plano B: caso todos os padrões falhem, atira na primeira água disponível
        for (int i = 1; i < 11; i++) {
            for (int j = 10; j >= 1; j--) {
                if (tabuleiroJogador[i][j].equals("~")) {
                    tabuleiroJogador[i][j] = "X";
                    System.out.println("O inimigo atirou torcendo pra acertar!");
                    return;
                }
            }
        }
    }


    // POSICIONAMENTO DA MÁQUINA (PvE) — do Caleb


    public static String[][] posicaoNaviosMaquina(String[][] tabuleiroMaquina, int dificuldade) {
        switch (dificuldade) {
            case 1: // Normal — navios espalhados nas bordas
                tabuleiroMaquina[1][2]  = "N"; tabuleiroMaquina[1][3]  = "N"; tabuleiroMaquina[1][4]  = "N";
                tabuleiroMaquina[1][5]  = "N"; tabuleiroMaquina[1][6]  = "N"; // Porta-aviões (5)
                tabuleiroMaquina[4][10] = "N"; tabuleiroMaquina[5][10] = "N";
                tabuleiroMaquina[6][10] = "N"; tabuleiroMaquina[7][10] = "N"; // Navio-tanque (4)
                tabuleiroMaquina[10][1] = "N"; tabuleiroMaquina[10][2] = "N"; tabuleiroMaquina[10][3] = "N"; // Destroyer (3)
                tabuleiroMaquina[5][5]  = "N"; tabuleiroMaquina[5][6]  = "N"; // Cruzador 1 (2)
                tabuleiroMaquina[5][1]  = "N"; tabuleiroMaquina[6][1]  = "N"; tabuleiroMaquina[7][1]  = "N"; // Destroyer 2 (3)
                break;
            case 2: // Difícil — navios no centro, mais difíceis de evitar
                tabuleiroMaquina[6][3]  = "N"; tabuleiroMaquina[6][4]  = "N"; tabuleiroMaquina[6][5]  = "N";
                tabuleiroMaquina[6][6]  = "N"; tabuleiroMaquina[6][7]  = "N"; // Porta-aviões (5)
                tabuleiroMaquina[7][3]  = "N"; tabuleiroMaquina[7][4]  = "N";
                tabuleiroMaquina[7][5]  = "N"; tabuleiroMaquina[7][6]  = "N"; // Navio-tanque (4)
                tabuleiroMaquina[2][8]  = "N"; tabuleiroMaquina[2][9]  = "N"; tabuleiroMaquina[2][10] = "N"; // Destroyer (3)
                tabuleiroMaquina[1][2]  = "N"; tabuleiroMaquina[2][2]  = "N"; tabuleiroMaquina[3][2]  = "N"; // Destroyer 2 (3)
                tabuleiroMaquina[10][9] = "N"; tabuleiroMaquina[10][10]= "N"; // Cruzador (2)
                break;
        }
        return tabuleiroMaquina;
    }

    // Menu de dificuldade PvE
    public static int menuPve() {
        System.out.println("=== Escolha a dificuldade ===\n");
        System.out.println("1. Normal.");
        System.out.println("2. Difícil.");
        System.out.println("3. Voltar ao menu.\n");
        System.out.print("Qual opção: ");
        return ENTRADA.nextInt();
    }

    // =========================================================
    // LOOP DE ATAQUE PvP
    // =========================================================

    public static void loopAtaquePvP(
            String[][] tabRealJ1, String[][] tabVisivelJ1,
            String[][] tabRealJ2, String[][] tabVisivelJ2) {

        boolean jogoAtivo = true;
        int turno = 1;

        while (jogoAtivo) {
            limparPagina();

            if (turno == 1) {
                System.out.println("========= VEZ DO JOGADOR 1 =========");
                System.out.println("Seu mapa de ataques no J2  (* = acerto | X = água | ~ = não atacado):\n");
                exibirTabuleiro(tabVisivelJ2);
                espacamento();

                System.out.println("Escolha onde atacar:\n");
                realizarAtaque(tabRealJ2, tabVisivelJ2);

                if (contarNaviosRestantes(tabRealJ2) == 0) {
                    limparPagina();
                    System.out.println("========================================");
                    System.out.println("  JOGADOR 1 VENCEU! Todos os navios do");
                    System.out.println("  Jogador 2 foram destruídos!");
                    System.out.println("========================================");
                    jogoAtivo = false;
                } else {
                    espacamento();
                    System.out.println("Turno do J1 encerrado. Passe o controle para o JOGADOR 2.");
                    System.out.print("Pressione ENTER para continuar...");
                    ENTRADA.nextLine(); ENTRADA.nextLine();
                    limparPagina();
                    turno = 2;
                }

            } else {
                System.out.println("========= VEZ DO JOGADOR 2 =========");
                System.out.println("Seu mapa de ataques no J1  (* = acerto | X = água | ~ = não atacado):\n");
                exibirTabuleiro(tabVisivelJ1);
                espacamento();

                System.out.println("Escolha onde atacar:\n");
                realizarAtaque(tabRealJ1, tabVisivelJ1);

                if (contarNaviosRestantes(tabRealJ1) == 0) {
                    limparPagina();
                    System.out.println("========================================");
                    System.out.println("  JOGADOR 2 VENCEU! Todos os navios do");
                    System.out.println("  Jogador 1 foram destruídos!");
                    System.out.println("========================================");
                    jogoAtivo = false;
                } else {
                    espacamento();
                    System.out.println("Turno do J2 encerrado. Passe o controle para o JOGADOR 1.");
                    System.out.print("Pressione ENTER para continuar...");
                    ENTRADA.nextLine(); ENTRADA.nextLine();
                    limparPagina();
                    turno = 1;
                }
            }
        }
    }

    // =========================================================
    // LOOP DE ATAQUE PvE
    // =========================================================

    public static void loopAtaquePve(
            String[][] tabRealJogador,
            String[][] tabRealMaquina,
            String[][] tabAtaquesJogador, // o que o jogador vê dos seus ataques na máquina
            int dificuldade) {

        boolean jogoAtivo = true;
        int tirosDaMaquina = 0;

        while (jogoAtivo) {
            limparPagina();

            // --- Turno do Jogador ---
            System.out.println("========= SEU TURNO =========");
            System.out.println("Seus ataques (* = acerto | X = água | ~ = não atacado):\n");
            exibirTabuleiroInimigo(tabAtaquesJogador); // exibe o que o jogador já descobriu
            espacamento();

            System.out.println("Escolha onde atacar:\n");
            realizarAtaque(tabRealMaquina, tabAtaquesJogador);

            // Verifica se o jogador venceu
            if (contarNaviosRestantes(tabRealMaquina) == 0) {
                limparPagina();
                System.out.println("========================================");
                System.out.println("  VOCÊ VENCEU! Todos os navios inimigos");
                System.out.println("  foram destruídos!");
                System.out.println("========================================");
                jogoAtivo = false;
                break;
            }

            // --- Turno da Máquina ---
            espacamento();
            System.out.println("========= TURNO DO INIMIGO =========");
            tirosDaMaquina++;
            inteligenciaMaquina(tabRealJogador, dificuldade, tirosDaMaquina);

            // Exibe tabuleiro do jogador após ataque da máquina
            espacamento();
            System.out.println("Seu tabuleiro após o ataque inimigo (* = atingido | X = água):\n");
            exibirTabuleiro(tabRealJogador);
            espacamento();

            // Verifica se a máquina venceu
            if (contarNaviosRestantes(tabRealJogador) == 0) {
                limparPagina();
                System.out.println("========================================");
                System.out.println("  GAME OVER! O inimigo destruiu todos");
                System.out.println("  os seus navios.");
                System.out.println("========================================");
                jogoAtivo = false;
                break;
            }

            System.out.print("Pressione ENTER para continuar...");
            ENTRADA.nextLine(); ENTRADA.nextLine();
        }
    }

    public static void main(String[] args) {

        int op1 = 0;

        do {
            espacamento();
            logoJogo();
            espacamento();
            menu();
            int opcao = entradaMenu();

            switch (opcao) {

                // ===== PvP =====
                case 1:
                    limparPagina();

                    String[][] tabRealJ1    = criarTabuleiro();
                    String[][] tabVisivelJ1 = criarTabuleiro();
                    String[][] tabRealJ2    = criarTabuleiro();
                    String[][] tabVisivelJ2 = criarTabuleiro();

                    tabRealJ1 = faseDePositionamento(tabRealJ1, "JOGADOR 1");

                    limparPagina();
                    System.out.println("Posicionamento do J1 concluído!");
                    System.out.println("Passe o controle para o JOGADOR 2.");
                    System.out.print("Pressione ENTER para continuar...");
                    ENTRADA.nextLine(); ENTRADA.nextLine();

                    tabRealJ2 = faseDePositionamento(tabRealJ2, "JOGADOR 2");

                    limparPagina();
                    System.out.println("Posicionamento concluído! O jogo vai começar.");
                    System.out.println("Passe o controle para o JOGADOR 1.");
                    System.out.print("Pressione ENTER para continuar...");
                    ENTRADA.nextLine(); ENTRADA.nextLine();

                    loopAtaquePvP(tabRealJ1, tabVisivelJ1, tabRealJ2, tabVisivelJ2);

                    System.out.print("\nPressione ENTER para voltar ao menu...");
                    ENTRADA.nextLine(); ENTRADA.nextLine();
                    break;

                // ===== PvE =====
                case 2:
                    limparPagina();

                    int dificuldade = menuPve();

                    if (dificuldade == 3) {
                        limparPagina();
                        break;
                    }

                    if (dificuldade < 1 || dificuldade > 2) {
                        System.out.println("Opção inválida! Voltando ao menu.\n");
                        break;
                    }

                    // Posiciona navios da máquina (oculto ao jogador)
                    String[][] tabRealMaquina   = criarTabuleiro();
                    tabRealMaquina = posicaoNaviosMaquina(tabRealMaquina, dificuldade);

                    String[][] tabAtaquesJogador = criarTabuleiro();

                    // Posicionamento do jogador
                    String[][] tabRealJogador = criarTabuleiro();
                    tabRealJogador = faseDePositionamento(tabRealJogador, "JOGADOR");

                    limparPagina();
                    System.out.println("=== TODOS OS NAVIOS POSICIONADOS ===");
                    System.out.println("Prepare-se... O combate vai começar!");
                    espacamento();
                    System.out.print("Pressione ENTER para continuar...");
                    ENTRADA.nextLine(); ENTRADA.nextLine();

                    loopAtaquePve(tabRealJogador, tabRealMaquina, tabAtaquesJogador, dificuldade);

                    System.out.print("\nPressione ENTER para voltar ao menu...");
                    ENTRADA.nextLine(); ENTRADA.nextLine();
                    break;

                // ===== Encerrar =====
                case 3:
                    limparPagina();
                    op1 = 3;
                    System.out.println("Encerrando o jogo. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha 1, 2 ou 3.\n");
                    break;
            }

        } while (op1 != 3);
    }
}
