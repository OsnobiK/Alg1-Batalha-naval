package Code;

import java.util.Scanner;

public class FuncoeBatalhaNaval {

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

    public static void clearPage(){

        for(int i = 0; i<50;++i){

            System.out.println();

        }

    }




}
