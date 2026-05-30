package projetoBatalhaNaval;

import java.util.Scanner;

public class funcoesBatalhaNaval {

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

    public static void espaco(){

        for(int i = 0; i < 5; i++){

            System.out.println();

        }

    }

    public static void menuNaval(){

        System.out.println("                                                                                                  =========== MENU ===========");
        System.out.println("                                                                                                        1.Iniciar PvO.");
        System.out.println("                                                                                                        2.Iniciar PvP.");
        System.out.println("                                                                                                        3.Encerrar.\n");

    }

    public static int entradaMenu(){

        Scanner entrada = new Scanner(System.in);
        System.out.print("                                                                                                        Qual opção: ");

        return entrada.nextInt();

    }

    public static void clearPage(){

        for(int i = 0; i<50;++i){

            System.out.println();

        }

    }

    public static void continuar(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("========= Digite enter para continuar =========");

        String enter = entrada.nextLine();

    }

    public static String[][] alimentacaoTabuleiro(){

        String[][] alimentarTabuleiro = new String[11][11];

        alimentarTabuleiro[0][0] = " X";

        alimentarTabuleiro[0][1] = "A"; alimentarTabuleiro[0][2] = "B";
        alimentarTabuleiro[0][3] = "C"; alimentarTabuleiro[0][4] = "D";
        alimentarTabuleiro[0][5] = "E"; alimentarTabuleiro[0][6] = "F";
        alimentarTabuleiro[0][7] = "G"; alimentarTabuleiro[0][8] = "H";
        alimentarTabuleiro[0][9] = "I"; alimentarTabuleiro[0][10] = "J";

        alimentarTabuleiro[1][0] = " 1"; alimentarTabuleiro[2][0] = " 2";
        alimentarTabuleiro[3][0] = " 3"; alimentarTabuleiro[4][0] = " 4";
        alimentarTabuleiro[5][0] = " 5"; alimentarTabuleiro[6][0] = " 6";
        alimentarTabuleiro[7][0] = " 7"; alimentarTabuleiro[8][0] = " 8";
        alimentarTabuleiro[9][0] = " 9"; alimentarTabuleiro[10][0] = "10";

        for(int i = 1; i < 11; i++){

            for(int j = 1; j < 11; j++){

                alimentarTabuleiro[i][j] = "~";

            }

        }

        return alimentarTabuleiro;
    }

    public static void exibicaoTabuleiro(String[][] alimentarTabuleiro){

        for(int i = 0; i < 11; i++){

            for(int j = 0; j < 11; j++){

                System.out.print(" " + alimentarTabuleiro[i][j]);
                System.out.print("  ");

            }

            System.out.println();

        }

    }



    public static void menuPosicaoNavio(int contadorNavios){

        int contadorNavio = contadorNavios;

        System.out.println("========= Escolha em qual direção será posicionado o " + contadorNavio + "° navio =========\n");

        System.out.println("1. HORIZONTAL.");
        System.out.println("2. VERTICAL.\n");

    }

    public static int entradaPosicaoNavio(){

        int posicao = 0;

        do {

            Scanner entrada = new Scanner(System.in);
            System.out.print("Qual opção: ");
            posicao = entrada.nextInt();
            System.out.println();

            if(posicao < 1 || posicao > 2){

                System.out.println("Opção Invalida, tente novamente.\n");

            }

        }while(posicao < 1 || posicao > 2);

        return posicao;

    }

}
