package Main;
import Implemetation.Supermercado;
import Implemetation.SupermercadoArray;

import java.util.Scanner;
public class Main {
    private static int SIZE = 4;
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Supermercado supermercado = new SupermercadoArray(SIZE);
        int opcao;

        do {
            System.out.println("\nLista de compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String compra = leia.next();
                    supermercado.add(compra);
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido: ");
                    int index = leia.nextInt();
                    supermercado.remover(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa.....");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);

        leia.close();
    }
}
