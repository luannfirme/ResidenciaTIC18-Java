package main;

import listaSessoes.ListaSessoes;
import listaUsuarios.ListaUsuarios;
import usuario.Usuario;
import sessao.Sessao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ListaUsuarios listaUsuarios = new ListaUsuarios("ListaPrincipal");
    private static ListaSessoes listaSessoes = new ListaSessoes();
    private static Usuario usuarioLogado = null;

    public static void main(String[] args) {
        exibirMenuInicial();
    }

    private static void exibirMenuInicial() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n---- Menu Inicial ----");
            System.out.println("1. Novo Usuário");
            System.out.println("2. Remover Usuário");
            System.out.println("3. Logar");
            System.out.println("0. Encerrar");

            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        novoUsuario();
                        break;
                    case 2:
                        removerUsuario();
                        break;
                    case 3:
                        logar();
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

    private static void novoUsuario() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\n---- Novo Usuário ----");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            Usuario novoUsuario = new Usuario(nome, email, senha);
            listaUsuarios.criarUsuario(novoUsuario);
            System.out.println("Novo usuário criado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao criar novo usuário: " + e.getMessage());
        }
    }

    private static void removerUsuario() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\n---- Remover Usuário ----");
            System.out.print("Nome do usuário a ser removido: ");
            String nomeUsuario = scanner.nextLine();

            Usuario usuarioRemover = buscarUsuarioPorNome(nomeUsuario);

            if (usuarioRemover != null) {
                System.out.print("Digite a senha para confirmar a remoção: ");
                String senhaConfirmacao = scanner.nextLine();

                if (senhaConfirmacao.equals(usuarioRemover.getSenha())) {
                    for (Usuario amigo : usuarioRemover.getAmigos()) {
                        amigo.getAmigos().remove(usuarioRemover);
                    }

                    for (Sessao sessao : usuarioRemover.getListaSessoes()) {
                        listaSessoes.getSessoes().remove(sessao);
                    }

                    listaUsuarios.removerUsuario(usuarioRemover);

                    System.out.println("Usuário removido com sucesso!");
                } else {
                    System.out.println("Senha incorreta. Operação cancelada.");
                }
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao remover usuário: " + e.getMessage());
        }
    }

    private static void logar() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\n---- Logar ----");
            System.out.print("Nome de usuário: ");
            String nomeUsuario = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            Usuario usuario = buscarUsuarioPorNome(nomeUsuario);

            if (usuario != null && senha.equals(usuario.getSenha())) {
                Sessao.logar(usuario, listaSessoes);
                usuarioLogado = usuario;
                exibirMenuSessao();
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao efetuar login: " + e.getMessage());
        }
    }

    private static void exibirMenuSessao() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n---- Menu de Sessão ----");
            System.out.println("1. Listar Postagens");
            System.out.println("2. Criar Postagem");
            System.out.println("3. Criar Amizade");
            System.out.println("4. Desfazer Amizade");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        Sessao.listarPostagens(usuarioLogado);
                        break;
                    case 2:
                        System.out.println("Digite o conteúdo da postagem:");
                        String conteudoPostagem = scanner.nextLine();
                        Sessao.criarPostagem(usuarioLogado, conteudoPostagem);
                        break;
                    case 3:
                        System.out.println("Digite o nome do usuário para criar amizade:");
                        String nomeAmigoCriar = scanner.nextLine();
                        criarAmizade(nomeAmigoCriar);
                        break;
                    case 4:
                        System.out.println("Digite o nome do usuário para desfazer amizade:");
                        String nomeAmigoDesfazer = scanner.nextLine();
                        desfazerAmizade(nomeAmigoDesfazer);
                        break;
                    case 0:
                        Sessao.deslogar(usuarioLogado, listaSessoes);
                        usuarioLogado = null;
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
    }

    private static Usuario buscarUsuarioPorNome(String nomeUsuario) {
        for (Usuario usuario : listaUsuarios.getUsuarios()) {
            if (usuario.getNome().equals(nomeUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    private static void criarAmizade(String nomeAmigo) {
        try {
            Usuario amigo = buscarUsuarioPorNome(nomeAmigo);

            if (amigo != null) {
                Sessao.criarAmizade(usuarioLogado, amigo);
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar amizade: " + e.getMessage());
        }
    }

    private static void desfazerAmizade(String nomeAmigo) {
        try {
            Usuario amigo = buscarUsuarioPorNome(nomeAmigo);

            if (amigo != null) {
                Sessao.desfazerAmizade(usuarioLogado, amigo);
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao desfazer amizade: " + e.getMessage());
        }
    }
}
