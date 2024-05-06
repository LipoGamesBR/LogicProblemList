/*
 * O código precisa ter um menu, um add item e um listar itens
 * A lista terá no máximo 20 itens podendo não ser completamente preenchida
 * 
 */

import java.util.Scanner;

public class App {
    private static int[] lista = new int[20];
    private static int i = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = 0;
        while(opc != 3){
            System.out.println("Escolha a digitando o numero a baixo.");
            System.out.println("Adicionar itens -> 1");
            System.out.println("Listar itens    -> 2");
            System.out.println("Sair            -> 3");
            opc = sc.nextInt();


            switch (opc) {
                case 1:
                    additem();
                
                case 2:
                    listitens();
                case 3:
                    break;
                default:
                    System.out.println("A resposta precisa estar entre os valores 1 e 3.");
                    break;
            }

        }

        sc.close();
    }

    public static void additem(){
        int esc = 1;
        while (esc != -1 && i < 20){
            System.out.println("Digite um valor para ser adicionado.");

            System.out.println("Digite -1 para sair.");
            System.out.println(" ");
            
            esc = sc.nextInt();
            if(esc != -1){
                System.out.println(" ");
                System.out.println(" ");

                lista[i] = esc;

                System.out.print(lista[i]);
                System.out.print(" adicionado com sucesso. ");

                System.out.println(" ");
                System.out.println(" ");
                i++;
            }
            
        }
    }

    public static void listitens(){
        for (int x = 0; x < i; x++) {
            System.out.print("Position: ");
            System.out.print(x+1);
            System.out.print(" with value: ");
            System.out.print(lista[x]);

            System.out.println(" ");
            System.out.println(" ");
        }
    }
}
