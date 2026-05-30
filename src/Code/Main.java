package Code;

public class Main {

    public static void main(String[] args) {

        int op1 = 0;

    do{
        FuncoeBatalhaNaval.espaco();
        FuncoeBatalhaNaval.logoJogo();
        FuncoeBatalhaNaval.espaco();
        FuncoeBatalhaNaval.menuNaval();
        int opcao = FuncoeBatalhaNaval.entradaMenu();

        switch (opcao) {
            case 1:
            FuncoeBatalhaNaval.clearPage();

                break;
            case 2:
            FuncoeBatalhaNaval.clearPage();


                break;
            case 3:
            FuncoeBatalhaNaval.clearPage();
              op1 = 3;

              break;
        }

    }while(op1 != 3);


    }

}
