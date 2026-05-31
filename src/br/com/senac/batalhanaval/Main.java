package br.com.senac.batalhanaval;

import java.util.Scanner;

public class Main {

    public static void logoJogo(){

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

    public static void espacamento(){

        for(int i = 0; i < 5; i++){
            System.out.println();
        }

    }

    public static void menu(){
        System.out.println("                                                                                                  ===========MENU===========");
        System.out.println("                                                                                                        1.Iniciar PvP.");
        System.out.println("                                                                                                        2.Iniciar PvO.");
        System.out.println("                                                                                                        3.Encerrar.");
    }

    public static int entradaMenu(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("                                                                                                        Qual opção: ");
        return entrada.nextInt();
    }

    public static void limparPagina(){

        for(int i = 0; i<50;++i){

            System.out.println();

        }

    }

    public static String[][] criarTabuleiro(){

        String[][] tabuleiro = new String[11][11];

        tabuleiro[0][0] = " X";

        tabuleiro[0][1] = "A"; tabuleiro[0][2] = "B";
        tabuleiro[0][3] = "C"; tabuleiro[0][4] = "D";
        tabuleiro[0][5] = "E"; tabuleiro[0][6] = "F";
        tabuleiro[0][7] = "G"; tabuleiro[0][8] = "H";
        tabuleiro[0][9] = "I"; tabuleiro[0][10] = "J";

        tabuleiro[1][0] = " 1"; tabuleiro[2][0] = " 2";
        tabuleiro[3][0] = " 3"; tabuleiro[4][0] = " 4";
        tabuleiro[5][0] = " 5"; tabuleiro[6][0] = " 6";
        tabuleiro[7][0] = " 7"; tabuleiro[8][0] = " 8";
        tabuleiro[9][0] = " 9"; tabuleiro[10][0] = "10";

        for(int i = 1; i < 11; i++){

            for(int j = 1; j < 11; j++){

                tabuleiro[i][j] = "~";

            }

        }

        return tabuleiro;
    }

    public static void exibirTabuleiro(String[][] alimentarTabuleiro){

        for(int i = 0; i < 11; i++){

            for(int j = 0; j < 11; j++){

                System.out.print(" " + alimentarTabuleiro[i][j]);
                System.out.print("  ");

            }

            System.out.println();

        }

    }

    public static void menuPosicaoNavio(int contadorNavios, int[] limiteNavios){

        System.out.println("========= Lista de Navios Disponíveis: =========");
        System.out.println("1 -> " + limiteNavios[1] + " Porta-aviões (ocupa 5 espaços)");
        System.out.println("2 -> " + limiteNavios[2] + " Navio-tanque (ocupa 4 espaços)");
        System.out.println("3 -> " + limiteNavios[3] + " Destroyer    (ocupa 3 espaços)");
        System.out.println("4 -> " + limiteNavios[4] + " Cruzador     (ocupa 2 espaços)\n");

        System.out.println("========= Escolha em qual direção será posicionado o " + contadorNavios + "° navio =========\n");
        System.out.println("1. HORIZONTAL.");
        System.out.println("2. VERTICAL.\n");

    }

    public static int entradaPosicaoNavio(){

        int direcao = 0;

        do {

            Scanner entrada = new Scanner(System.in);
            System.out.print("Qual opção: ");
            direcao = entrada.nextInt();

            if(direcao < 1 || direcao > 2){

                System.out.println("Opção Invalida, tente novamente.\n");

            }

        }while(direcao < 1 || direcao > 2);

        return direcao;

    }



    public static int entradaNavioUsado(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual posicionara primeiro? ");

        return entrada.nextInt();
    }

    public static int navioUsado(int[] limiteNavios){

        Scanner entrada = new Scanner(System.in);
        int tamanho = 0;
        boolean escolhaValida = false;

        while (!escolhaValida) {
            System.out.print("Qual navio posicionara agora (1 a 4)? ");
            int opcao = entrada.nextInt();


            if (opcao >= 1 && opcao <= 4) {

                if (limiteNavios[opcao] > 0) {
                    limiteNavios[opcao]--;
                    escolhaValida = true;

                    if (opcao == 1) tamanho = 5;
                    else if (opcao == 2) tamanho = 4;
                    else if (opcao == 3) tamanho = 3;
                    else if (opcao == 4) tamanho = 2;

                } else {
                    System.out.println("Erro: Você já usou todos os navios desse tipo! Escolha outro da lista.\n");
                }
            } else {
                System.out.println("Opção inválida! Escolha um número de 1 a 4.\n");
            }
        }

        return tamanho;

    }

    public static String[][] entradaPosicaoNavio(String [][] tabuleiro, int tamanho, int direcao){
        Scanner entrada = new Scanner(System.in);
        int linha = 0;
        int coluna = 0;
        boolean posicaoFinalizada = false;

        while (!posicaoFinalizada) {

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.print("Digite a Coluna (A-J): ");
                String colunaLetra = entrada.next().toUpperCase();

                switch (colunaLetra) {
                    case "A":
                        coluna = 1;
                        colunaValida = true;
                    break;
                    case "B":
                        coluna = 2;
                        colunaValida = true;
                    break;
                    case "C":
                        coluna = 3;
                        colunaValida = true;
                        break;
                    case "D":
                        coluna = 4;
                        colunaValida = true;
                        break;
                    case "E":
                        coluna = 5;
                        colunaValida = true;
                        break;
                    case "F":
                        coluna = 6;
                        colunaValida = true;
                        break;
                    case "G":
                        coluna = 7;
                        colunaValida = true;
                        break;
                    case "H":
                        coluna = 8;
                        colunaValida = true;
                        break;
                    case "I":
                        coluna = 9;
                        colunaValida = true;
                        break;
                    case "J":
                        coluna = 10;
                        colunaValida = true;
                        break;
                    default: System.out.println("Coluna invalida! Tente novamente.");
                }
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.print("Digite a linha (1-10): ");
                linha = entrada.nextInt();

                if (linha >= 1 && linha <= 10) {
                    linhaValida = true;
                } else {
                    System.out.println("Linha inválida! Tente novamente.");
                }
            }


            boolean cabeEtaLivre = true;

            if (direcao == 1) {
                if(coluna + tamanho - 1 > 10){
                    System.out.println("Erro: O navio não cabe nessa posição na horizontal!");
                    cabeEtaLivre = false;
                } else {
                    for (int j = coluna; j < coluna + tamanho; j++){
                        if (tabuleiro[linha][j].equals("N")) {
                            System.out.println("Erro: Posição já ocupada por outro navio!");
                            cabeEtaLivre = false;
                            break;
                        }
                    }
                }
            } else if (direcao == 2) {
                if(linha + tamanho - 1 > 10){
                    System.out.println("Erro: O navio não cabe nessa posição na vertical!");
                    cabeEtaLivre = false;
                } else {
                    for (int j = linha; j < linha + tamanho; j++){
                        if (tabuleiro[j][coluna].equals("N")) {
                            System.out.println("Erro: Posição já ocupada por outro navio!");
                            cabeEtaLivre = false;
                            break;
                        }
                    }
                }
            }

            if (cabeEtaLivre) {
                posicaoFinalizada = true;
                if (direcao == 1) {
                    for (int j = coluna; j < coluna + tamanho; j++) {
                        tabuleiro[linha][j] = "N";
                    }
                } else if (direcao == 2) {
                    for (int j = linha; j < linha + tamanho; j++) {
                        tabuleiro[j][coluna] = "N";
                    }
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




    public static void main(String[] args) {

        int op1 = 0;
        int contadorNavios = 0;

    do{
        espacamento();
        logoJogo();
        espacamento();
        menu();
        int opcao = entradaMenu();

        switch (opcao) {
            case 1:
                limparPagina();
                String[][] tabuleiro = criarTabuleiro();
                exibirTabuleiro(tabuleiro);
                espacamento();

                int[] limiteNavios = {0, 1, 1, 2, 1};

                do {
                    limparPagina();
                    exibirTabuleiro(tabuleiro);
                    espacamento();

                    // Passamos o array para o menu e para a função de escolha
                    menuPosicaoNavio(contadorNavios + 1, limiteNavios);
                    int direcao = entradaPosicaoNavio();

                    // Passamos o estoque para descontar o navio escolhido
                    int tamanho = navioUsado(limiteNavios);

                    tabuleiro = entradaPosicaoNavio(tabuleiro, tamanho, direcao);

                    contadorNavios++;
                } while(contadorNavios != 5);
                break;
            case 2:
            limparPagina();


                break;
            case 3:
            limparPagina();
              op1 = 3;

              break;
        }

    }while(op1 != 3);


    }

}
