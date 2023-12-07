package coelho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cliente.Cliente;
import imovel.Imovel;

public class Coelho {
	private List<Cliente> Clientes = new ArrayList<>();
	private List<Imovel> Imoveis = new ArrayList<>();

	public void newCliente() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("CPF: ");
			String cpf = sc.nextLine();

			Cliente cliente = new Cliente(nome, cpf);
			Clientes.add(cliente);

			System.out.println("Cliente cadastrado com sucesso \n");
		} catch (Exception e) {
			System.out.println("Não foi possível realizar o cadastro.");
		}
	}

	public void viewCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o CPF do cliente: ");
		String cpf = sc.nextLine();

		Cliente cliente = localizarCliente(cpf);

		if (cliente != null) {
			System.out.println("Nome: " + cliente.getNome() + "		CPF: " + cliente.getCpf());
			if (cliente.getImoveis() != null) {
				System.out.println("Imóveis:");
				for (Imovel imovel : cliente.getImoveis()) {
					System.out.println("Matrícula: " + imovel.getMatricula() + "	Endereço: " + imovel.getEndereco()
							+ "	Última Leitura: " + imovel.getUltimaLeitura() + "	Penúltima Leitura: "
							+ imovel.getPenultimaLeitura() + "\n");
				}
			}
			System.out.println("\n");
		}
	}

	public void deletClientes() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o CPF do cliente: ");
		String cpf = sc.nextLine();

		Cliente cliente = localizarCliente(cpf);

		if (cliente != null) {
			Clientes.remove(cliente);
			System.out.println("Cliente removido com sucesso \n");

		}
	}

	public void allClientes() {
		for (Cliente cliente : Clientes) {
			System.out.println("Nome: " + cliente.getNome() + "		CPF: " + cliente.getCpf());
			if (cliente.getImoveis() != null) {
				System.out.println("Imóveis:");
				for (Imovel imovel : cliente.getImoveis()) {
					System.out.println("Matrícula: " + imovel.getMatricula() + "	Endereço: " + imovel.getEndereco()
							+ "	Última Leitura: " + imovel.getUltimaLeitura() + "	Penúltima Leitura: "
							+ imovel.getPenultimaLeitura() + "\n");
				}
			}
		}
	}

	public void newImovel() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Informe o CPF do cliente proprietário: ");
			String cpf = sc.nextLine();
			System.out.print("Informe a Matricula: ");
			String matricula = sc.nextLine();
			System.out.print("Informe o Endereço: ");
			String endereco = sc.nextLine();

			Imovel imovel = new Imovel(matricula, endereco);

			Cliente cliente = localizarCliente(cpf);

			if (cliente != null)
				cliente.setImoveis(imovel);

			Imoveis.add(imovel);

			System.out.println("Imóvel cadastrado com sucesso \n");

		} catch (Exception e) {
			System.out.println("Não foi possível realizar o cadastro.");
		}
	}

	public void viewImovel() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a matrícula do imóvel: ");
		String matricula = sc.nextLine();

		Imovel imovel = localizarImovel(matricula);

		if (imovel != null) {
			System.out.println("Matrícula: " + imovel.getMatricula() + "	Endereço: " + imovel.getEndereco()
					+ "	Última Leitura: " + imovel.getUltimaLeitura() + "	Penúltima Leitura: "
					+ imovel.getPenultimaLeitura() + "\n");
		}
	}

	public void deletImovel() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a matrícula do imóvel: ");
		String matricula = sc.nextLine();
		Imovel imovelEncontrado = null;

		for (Cliente cliente : Clientes) {
			for (Imovel imovel : cliente.getImoveis()) {
				if (imovel.getMatricula().equals(matricula)) {
					imovelEncontrado = imovel;
					break;
				}
			}
			if (imovelEncontrado != null) {
				cliente.removeImoveis(imovelEncontrado);
				Imoveis.remove(imovelEncontrado);
				System.out.println("Imovel removido com sucesso \n");
				break;
			}
		}

		if (imovelEncontrado == null) {
			System.out.println("Imóvel com a matrícula " + matricula + " não encontrado.");
		}
	}

	public void allImovel() {
		for (Imovel imovel : Imoveis) {
			System.out.println("Matrícula: " + imovel.getMatricula() + "	Endereço: " + imovel.getEndereco()
					+ "	Última Leitura: " + imovel.getUltimaLeitura() + "	Penúltima Leitura: "
					+ imovel.getPenultimaLeitura() + "\n");
		}
	}

	public Cliente localizarCliente(String cpf) {
		Cliente clienteEncontrado = null;

		for (Cliente cliente : Clientes) {
			if (cliente.getCpf().equals(cpf)) {
				clienteEncontrado = cliente;
				break;
			}
		}

		if (clienteEncontrado == null) {
			System.out.println("Cliente com CPF " + cpf + " não encontrado.");
		}

		return clienteEncontrado;
	}

	public Imovel localizarImovel(String matricula) {
		Imovel imovelEncontrado = null;

		for (Imovel imovel : Imoveis) {
			if (imovel.getMatricula().equals(matricula)) {
				imovelEncontrado = imovel;
				break;
			}
		}

		if (imovelEncontrado == null) {
			System.out.println("Imóvel com matrícula " + matricula + " não encontrado.");
		}

		return imovelEncontrado;
	}

	public Cliente localizarImovelComClientePorMatricula(String matricula) {
		Cliente clienteEncontrado = null;
		Imovel imovelEncontrado = null;

		for (Cliente cliente : Clientes) {
			for (Imovel imovel : cliente.getImoveis()) {
				if (imovel.getMatricula().equals(matricula)) {
					imovelEncontrado = imovel;
					break;
				}
			}
			if (imovelEncontrado != null) {
				clienteEncontrado = cliente;
				clienteEncontrado.setImoveis(imovelEncontrado);
				break;
			}
		}

		if (imovelEncontrado == null) {
			System.out.println("Imóvel com a matrícula " + matricula + " não encontrado.");
		}

		return clienteEncontrado;
	}
}
