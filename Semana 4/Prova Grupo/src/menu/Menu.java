package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import coelho.Coelho;

public class Menu {
	
    public static void MainMenu(Coelho coelho) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n---- Menu Inicial ----");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Imóveis");
            System.out.println("0. Encerrar");

            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                    	MenuCliente(coelho);
                        break;
                    case 2:
                    	MenuImovel(coelho);
                        break;
                    case 0:
                        System.out.println("Encerrando o programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                opcao = -1; 
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void MenuCliente(Coelho coelho) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n---- Menu Cliente ----");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Alterar");
            System.out.println("4. Excluir");
            System.out.println("5. Listar Todos");
            System.out.println("0. Encerrar");

            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        coelho.newCliente();
                        break;
                    case 2:
                    	coelho.viewCliente();
                        break;
                    case 3:
                    	System.out.println("não implementado.");
                        break;
                    case 4:
                    	coelho.deletClientes();
                        break;
                    case 5:
                    	coelho.allClientes();
                        break;
                    case 0:
                    	MainMenu(coelho);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                opcao = -1; 
            }
        } while (opcao != 0);

        scanner.close();
    }
    
    private static void MenuImovel(Coelho coelho) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n---- Menu Imóvel ----");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Alterar");
            System.out.println("4. Excluir");
            System.out.println("5. Listar Todos");
            System.out.println("0. Encerrar");

            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        coelho.newImovel();
                        break;
                    case 2:
                    	coelho.viewImovel();
                        break;
                    case 3:
                    	System.out.println("não implementado.");
                        break;
                    case 4:
                    	coelho.deletImovel();
                        break;
                    case 5:
                    	coelho.allImovel();
                        break;
                    case 0:
                    	MainMenu(coelho);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                opcao = -1; 
            }
        } while (opcao != 0);

        scanner.close();
    }
}
