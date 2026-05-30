package projetoBatalhaNaval;

public class Main {

    public static void main(String[] args) {

        int op1 = 0;
        int contadorNavios = 0;

        do{
            funcoesBatalhaNaval.espaco();
            funcoesBatalhaNaval.logoJogo();
            funcoesBatalhaNaval.espaco();
            funcoesBatalhaNaval.menuNaval();
            int opcao = funcoesBatalhaNaval.entradaMenu();

            switch (opcao) {
                case 1:
                    funcoesBatalhaNaval.clearPage();
                    String[][] alimentarTabuleiro = funcoesBatalhaNaval.alimentacaoTabuleiro();
                    funcoesBatalhaNaval.exibicaoTabuleiro(alimentarTabuleiro);
                    funcoesBatalhaNaval.espaco();

                    System.out.println("========= Você deve posicionar os navios: =========\n" +
                            "\n" +
                            "1. Porta-aviões: ocupa 5 espaços.\n" +
                            "1. Navio-tanque: ocupa 4 espaços.\n" +
                            "2. Destroyer: ocupa 3 espaços.\n" +
                            "1. 1 Cruzador: ocupa 2 espaços.\n");

                    do {

                        contadorNavios++;

                        funcoesBatalhaNaval.menuPosicaoNavio(contadorNavios);
                        funcoesBatalhaNaval.entradaPosicaoNavio();

                    }while(contadorNavios != 5);

                    funcoesBatalhaNaval.continuar();
                    funcoesBatalhaNaval.clearPage();

                    contadorNavios = 0;

                    break;
                case 2:
                    funcoesBatalhaNaval.clearPage();


                    break;
                case 3:
                    funcoesBatalhaNaval.clearPage();
                    op1 = 3;

                    break;
            }

            if(opcao < 1 || opcao > 3){

                funcoesBatalhaNaval.clearPage();

            }

        }while(op1 != 3);

    }

}
