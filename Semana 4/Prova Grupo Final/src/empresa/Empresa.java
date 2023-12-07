package empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
	private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private List<Imovel> listaImoveis = new ArrayList<Imovel>();
    private List<Fatura> listaFaturas = new ArrayList<Fatura>();
	private List<Reparo> listaReparos = new ArrayList<Reparo>();
    private List<Falha> listaFalhas = new ArrayList<Falha>();
    private List<Reembolso> listaReembolsos = new ArrayList<Reembolso>();
	
    
    //MENUS
    public void menuEmpresa() {
    	
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	 while (!acao.equals("0")) {
    		System.out.println("-----Menu Geral-----");
        	System.out.println("1 - Menu de Clientes");
        	System.out.println("2 - Menu de Imoveis");
        	System.out.println("3 - Menu de Faturas");
        	System.out.println("4 - Menu de Pagamentos");
        	System.out.println("5 - Menu de Falhas");
        	System.out.println("0 - Sair");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();

        	switch(acao) {
        	case "0":
        		System.out.println("Finalizando operacao...");
        		System.exit(0);
            	break;
            	
        	case "1":
        		menuCliente();
            	break;
            	
        	case "2":
        		menuImovel();
            	break;
            	
        	case "3":
        		menuFatura();
            	break;
            	
        	case "4":
        		menuPagamento();
            	break;
            	
        	case "5":
        		menuFalha();
            	break;
           case "6":
        	   preencherListasComValoresIniciais();
				break;
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
			
    	}
    }
    
    
    public void menuCliente() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	 while (!acao.equals("0")) {
    		System.out.println("-----Menu de Clientes-----");
        	System.out.println("1 - Incluir cliente");
        	System.out.println("2 - Consultar cliente");
        	System.out.println("3 - Listar clientes");
        	System.out.println("4 - Excluir cliente");
        	System.out.println("5 - Alterar cliente");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
         
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
        		menuEmpresa();
            	break;
            	
        	case "1":
        		incluirCliente();
            	break;
            	
        	case "2":
        		consultarCliente();
            	break;
            	
        	case "3":
        		listarCliente();
            	break;
            	
        	case "4":
        		excluirCliente();
            	break;
            	
        	case "5":
        		alterarCliente();
            	break;

        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuImovel() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Imoveis-----");
        	System.out.println("1 - Incluir imovel");
        	System.out.println("2 - Consultar imovel");
        	System.out.println("3 - Listar imovel");
        	System.out.println("4 - Excluir imovel");
        	System.out.println("5 - Alterar imovel");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
        		menuEmpresa();
            	break;
            	
        	case "1":
        		incluirImovel();
            	break;
            	
        	case "2":
        		consultarImovel();
            	break;
            	
        	case "3":
        		listarImovel();
            	break;
            	
        	case "4":
        		excluirImovel();
            	break;
            	
        	case "5":
        		alterarImovel();
            	break;
            
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuFatura() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Faturas-----");
        	System.out.println("1 - Incluir fatura");
        	System.out.println("2 - Listar todas as faturas");
        	System.out.println("3 - Listar todas as faturas em aberto");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
        		menuEmpresa();
            	break;
            	
        	case "1":
        		incluirFatura();
            	break;
            	
        	case "2":
        		listarTodasFaturas();
            	break;
            	
        	case "3":
        		listarFaturasAbertas();
            	break;
            
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuPagamento() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Pagamentos-----");
        	System.out.println("1 - Incluir pagamentos");
        	System.out.println("2 - Listar todos os pagamentos");
        	System.out.println("3 - Listar todos os pagamentos de uma fatura");
        	System.out.println("4 - Listar todos os reembolsos");
        	System.out.println("5 - Consultar reembolso de uma fatura");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
        		menuEmpresa();
            	break;
            	
        	case "1":
        		incluirPagamento();
            	break;
            	
        	case "2":
        		listarTodosPagamentos();
            	break;
            	
        	case "3":
        		listarPagamentosFatura();
            	break;
            	
        	case "4":
        		ListarReembolsos();
            	break;
            	
        	case "5":
        		consultarReembolsoFatura();
            	break;
            
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuFalha() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Falhas-----");
        	System.out.println("1 - Incluir falha (com matricula)");
        	System.out.println("2 - Incluir falha (sem matricula)");
        	System.out.println("3 - Sub-menu de Reparos");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
        		menuEmpresa();
            	break;
            	
        	case "1":
        		incluirFalhaComMatricula();
            	break;
            	
        	case "2":
        		incluirFalhaSemMatricula();
            	break;
            	
        	case "3":
        		menuReparo();
            	break;
            	
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuReparo() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Sub-Menu de Reparos-----");
        	System.out.println("1 - Listar todos os reparos abertos");
        	System.out.println("2 - Encerrar um reparo");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
			
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
        		menuEmpresa();
            	break;
            	
        	case "1":
        		listarReparosAbertos();
            	break;
            	
        	case "2":
        		encerrarReparo();
            	break;
            	
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    public void incluirCliente() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----Incluindo novo cliente-----");
    	
    	System.out.println("Nome: ");
    	String nome = sc.nextLine();
    	
    	System.out.println("CPF: ");
    	String cpf= sc.nextLine();
    	
    	System.out.println("Possui imovel cadastrado? (sim / nao): ");
    	String resposta = sc.nextLine();
		
    	if(resposta != "sim") {
    		System.out.println("Cliente cadastrado com sucesso");
    		return;
    	}
    	
    	System.out.println("Matricula do imovel: ");
    	String matricula = sc.nextLine();
    	
    	boolean check = false;
    	int index = 0;
    	for(int i = 0; i < listaImoveis.size(); i++) {
    		if(matricula == listaImoveis.get(i).getMatricula()) {
    			check = true;
    			index = i;
    			break;
    		}
    	}
    	
    	if(check) {
    		Cliente cliente = new Cliente(nome, cpf, listaImoveis.get(index));
    		listaClientes.add(cliente);
    		System.out.println("Cliente cadastrado com sucesso");
    	}
    	
    	else {
        	System.out.println("Imovel nao encontrado, cadastrando cliente sem imovel");
        	Cliente cliente = new Cliente(nome, cpf);
    		listaClientes.add(cliente);
    		System.out.println("Cliente cadastrado com sucesso");
    	}
		
    }
    
    public void consultarCliente() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----Consultando cliente-----");
    	
    	System.out.println("CPF: ");
    	String cpf= sc.nextLine();
    	

    	boolean check = false;
    	int index = 0;
    	for(int i = 0; i < listaClientes.size(); i++) {
    		if (cpf.equals(listaClientes.get(i).getCpf())) {
    			check = true;
    			index = i;
    			break;
    		}
    	}
    	
    	if(!check) {
    		System.out.println("Cliente nao encontrado");
    		return;
    	}
    	
    	Cliente c = listaClientes.get(index);
    	
    	System.out.println("Nome: " + c.getNome() + " - CPF: " + c.getCpf());
    }
    
    public void listarCliente() {
    	if(listaClientes.size() == 0){
    		System.out.println("A lista de clientes esta vazia");
    		return;
    	}
    	
    	System.out.println("-----Listando todos os clientes-----");
    	for(int i = 0; i < listaClientes.size(); i++) {
        	Cliente c = listaClientes.get(i);        	
        	System.out.println("Nome: " + c.getNome() + " - CPF: " + c.getCpf());
    	}    	
    }
    
    public void excluirCliente() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----Excluindo cliente-----");
    	
    	System.out.println("CPF: ");
    	String cpf= sc.nextLine();
    	
		
    	boolean check = false;
    	int index = 0;
    	for(int i = 0; i < listaClientes.size(); i++) {
    		if (cpf.equals(listaClientes.get(i).getCpf())) {
    			check = true;
    			index = i;
    			break;
    		}
    	}
    	
    	if(!check) {
    		System.out.println("Cliente nao encontrado");
    		return;
    	}
    	
    	listaClientes.remove(index);    	
    	System.out.println("Cliente excluido com sucesso");
    }
    
    public void alterarCliente() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----Alterando cliente-----");
    	
    	System.out.println("CPF: ");
    	String cpf= sc.nextLine();
    	
		
		
    	boolean check = false;
    	int index = 0;
    	for(int i = 0; i < listaClientes.size(); i++) {
    		if(cpf == listaClientes.get(i).getCpf()) {
    			check = true;
    			index = i;
    			break;
    		}
    	}
    	
    	if(!check) {
    		System.out.println("Cliente nao encontrado");
    		return;
    	}
    	
    	String acao = "";
    	System.out.println("Deseja alterar o nome? (sim / nao): ");
    	acao = sc.nextLine();
    	if(acao == "sim") {
    		System.out.println("Nome: ");
    		String nome = sc.nextLine();
    		listaClientes.get(index).setNome(nome);
    		System.out.println("Nome alterado com sucesso");
    	}
    	
    	System.out.println("Deseja alterar o imovel? (sim / nao): ");
    	acao = sc.nextLine();

    	if(acao == "sim") {
    		System.out.println("Matricula do imovel: ");
        	String matricula = sc.nextLine();
        	
        	boolean checkM = false;
        	int indexM = 0;
        	for(int i = 0; i < listaImoveis.size(); i++) {
        		if(matricula == listaImoveis.get(i).getMatricula()) {
        			checkM = true;
        			indexM = i;
        			break;
        		}
        	}
        	
        	if(!checkM) {
            	System.out.println("Imovel nao encontrado");
        	}
        	
        	else {
        		listaClientes.get(index).setImovel(listaImoveis.get(indexM));
        		System.out.println("Imovel alterado com sucesso");
        	}
    	}
    	
    	System.out.println("Cliente alterado com sucesso");
    }
    
    
   	public void incluirImovel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Incluindo novo imóvel-----");

		System.out.println("Matrícula do imóvel: ");
		String matricula = sc.nextLine();

		System.out.println("Endereço do imóvel: ");
		String endereco = sc.nextLine();

		System.out.println("Última leitura: ");
		float ultimaLeitura = Float.parseFloat(sc.nextLine());

		System.out.println("Penúltima leitura: ");
		float penultimaLeitura = Float.parseFloat(sc.nextLine());

		

		Imovel imovel = new Imovel(matricula, endereco, ultimaLeitura, penultimaLeitura);
		listaImoveis.add(imovel);

		System.out.println("Imóvel cadastrado com sucesso");
	}

	public void consultarImovel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Consultando imóvel-----");

		System.out.println("Matrícula do imóvel: ");
		String matricula = sc.nextLine();
		

		boolean check = false;
		for (Imovel imovel : listaImoveis) {
			if (matricula.equals(imovel.getMatricula())) {
				check = true;
				System.out.println("Matrícula: " + imovel.getMatricula());
				System.out.println("Endereço: " + imovel.getEndereco());
				System.out.println("Última leitura: " + imovel.getUltimaLeitura());
				System.out.println("Penúltima leitura: " + imovel.getPenultimaLeitura());
				break;
			}
		}

		if (!check) {
			System.out.println("Imóvel não encontrado");
		}
	}

	public void listarImovel() {
		if (listaImoveis.isEmpty()) {
			System.out.println("A lista de imóveis está vazia");
		} else {
			System.out.println("-----Listando todos os imóveis-----");
			for (Imovel imovel : listaImoveis) {
				System.out.println("Matrícula: " + imovel.getMatricula());
				System.out.println("Endereço: " + imovel.getEndereco());
				System.out.println("Última leitura: " + imovel.getUltimaLeitura());
				System.out.println("Penúltima leitura: " + imovel.getPenultimaLeitura());
				System.out.println("------");
			}
		}
	}

	public void excluirImovel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Excluindo imóvel-----");

		System.out.println("Matrícula do imóvel: ");
		String matricula = sc.nextLine();
		

		boolean check = false;
		for (Imovel imovel : listaImoveis) {
			if (matricula.equals(imovel.getMatricula())) {
				check = true;
				listaImoveis.remove(imovel);
				System.out.println("Imóvel excluído com sucesso");
				break;
			}
		}

		if (!check) {
			System.out.println("Imóvel não encontrado");
		}
	}

	public void alterarImovel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Alterando imóvel-----");

		System.out.println("Matrícula do imóvel: ");
		String matricula = sc.nextLine();

		boolean check = false;
		for (Imovel imovel : listaImoveis) {
			if (matricula.equals(imovel.getMatricula())) {
				check = true;

				System.out.println("Novo endereço (deixe em branco para manter o atual): ");
				String novoEndereco = sc.nextLine();
				if (!novoEndereco.isEmpty()) {
					imovel.setEndereco(novoEndereco);
					System.out.println("Endereço alterado com sucesso");
				}

				System.out.println("Nova última leitura (deixe em branco para manter a atual): ");
				String novaUltimaLeituraStr = sc.nextLine();
				if (!novaUltimaLeituraStr.isEmpty()) {
					float novaUltimaLeitura = Float.parseFloat(novaUltimaLeituraStr);
					imovel.setUltimaLeitura(novaUltimaLeitura);
					System.out.println("Última leitura alterada com sucesso");
				}

				System.out.println("Nova penúltima leitura (deixe em branco para manter a atual): ");
				String novaPenultimaLeituraStr = sc.nextLine();
				
				
				if (!novaPenultimaLeituraStr.isEmpty()) {
					float novaPenultimaLeitura = Float.parseFloat(novaPenultimaLeituraStr);
					imovel.setPenultimaLeitura(novaPenultimaLeitura);
					System.out.println("Penúltima leitura alterada com sucesso");
				}

				System.out.println("Imóvel alterado com sucesso");
				break;
			}
		}

		if (!check) {
			System.out.println("Imóvel não encontrado");
		}
	}

    public void incluirFatura() {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Matricula do imovel: ");
    	String matricula = sc.nextLine();
    	
    	boolean checkM = false;
    	int indexM = 0;
    	for (Imovel imovel : listaImoveis) {
			if (matricula.equals(imovel.getMatricula())) {
				checkM = true;
				break;
			}
			indexM++;
		}
    	
    	if(!checkM) {
        	System.out.println("Imovel nao encontrado");
    	}
    	else {
    		String id =  String.valueOf(listaFaturas.size() + 1);
    		float ultimaLeitura = listaImoveis.get(indexM).getUltimaLeitura();
    		float penultimaLeitura = listaImoveis.get(indexM).getPenultimaLeitura();
    		float valor = (ultimaLeitura - penultimaLeitura) * 10;
    		
    		
    		Fatura fatura = new Fatura(id, LocalDate.now(), ultimaLeitura, penultimaLeitura, valor);
    		listaImoveis.get(indexM).setListaFaturas(fatura);
    		listaFaturas.add(fatura);

    		System.out.println("Fatura "+ id +" cadastrada com sucesso");
    	}
    }

    public void listarTodasFaturas() {
		if (listaFaturas.isEmpty()) {
			System.out.println("A lista de faturas está vazia");
		} else {
			System.out.println("-----Listando todas Faturas -----");
			for (Fatura fatura : listaFaturas) {
				String status = fatura.isEstadoPagamento() ? "PAGO" : "EM ABERTO";
				System.out.println("Id: " + fatura.getId());
				System.out.println("Última leitura: " + fatura.getUltimaLeitura() + " KWh");
				System.out.println("Penúltima leitura: " + fatura.getPenultimaLeitura()+ " KWh");
				System.out.println("Valor: R$" + fatura.getValor());
				System.out.println("Data: " + fatura.getData());
				System.out.println("Status: " + status);
				System.out.println("------");
			}
		}
    }
    
    public void listarFaturasAbertas() {
    	if (listaFaturas.isEmpty()) {
            System.out.println("A lista de faturas está vazia");
        } else {
            System.out.println("-----Listando todas Faturas (em aberto) -----");
            for (Fatura fatura : listaFaturas) {
                if (!fatura.isEstadoPagamento()) {
                    System.out.println("Id: " + fatura.getId());
                    System.out.println("Última leitura: " + fatura.getUltimaLeitura() + " KWh");
                    System.out.println("Penúltima leitura: " + fatura.getPenultimaLeitura()+ " KWh");
                    System.out.println("Valor: R$" + fatura.getValor());
                    System.out.println("Data: " + fatura.getData());
                    System.out.println("Status: EM ABERTO");
                    System.out.println("------");
                }
            }
        }
    }
    
    
    public void incluirPagamento() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ID da fatura:");
        String idFatura = sc.nextLine();

        System.out.println("Informe o valor do pagamento:");
        float valorPagamento = Float.parseFloat(sc.nextLine());
		

        Pagamento pagamento = new Pagamento();
        pagamento.setValor(valorPagamento);
        pagamento.setData(LocalDate.now());

        Fatura faturaEncontrada = null;
        for (Fatura fatura : listaFaturas) {
            if (fatura.getId().equals(idFatura)) {
                faturaEncontrada = fatura;
                break;
            }
        }

        if (faturaEncontrada != null) {
            faturaEncontrada.getPagamentos().add(pagamento);
            System.out.println("Pagamento incluído com sucesso!");
        } else {
            System.out.println("Fatura não encontrada. Pagamento não incluído.");
        }
    }
    
    public void listarTodosPagamentos() {
    	
        if (listaFaturas.isEmpty()) {
            System.out.println("Não há faturas disponíveis.");
        } else {
            for (Fatura fatura : listaFaturas) {
                System.out.println("ID da Fatura: " + fatura.getId());
                
                if (fatura.getPagamentos().isEmpty()) {
                    System.out.println("Não há pagamentos para esta fatura.");
                } else {
                    System.out.println("Pagamentos:");
                    for (Pagamento pagamento : fatura.getPagamentos()) {
                        System.out.println("  Valor: " + pagamento.getValor());
                        System.out.println("  Data: " + pagamento.getData());
                        System.out.println("------");
                    }
                }
            }
        }
    }
    
    public void listarPagamentosFatura() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ID da fatura:");
        String idFatura = sc.nextLine();
		

        Fatura faturaEncontrada = null;
        for (Fatura fatura : listaFaturas) {
            if (fatura.getId().equals(idFatura)) {
                faturaEncontrada = fatura;
                break;
            }
        }

        if (faturaEncontrada != null) {
            if (faturaEncontrada.getPagamentos().isEmpty()) {
                System.out.println("Não há pagamentos para esta fatura.");
            } else {
                System.out.println("Pagamentos da Fatura " + idFatura + ":");
                for (Pagamento pagamento : faturaEncontrada.getPagamentos()) {
                    System.out.println("  Valor: " + pagamento.getValor());
                    System.out.println("  Data: " + pagamento.getData());
                    System.out.println("------");
                }
            }
        } else {
            System.out.println("Fatura não encontrada.");
        }
    }
    
    
    public void ListarReembolsos() {
 
        if (listaReembolsos.isEmpty()) {
            System.out.println("Não há reembolsos disponíveis.");
        } else {
            System.out.println("Lista de Reembolsos:");

            for (Reembolso reembolso : listaReembolsos) {
                System.out.println("  Valor: " + reembolso.getValor());
                System.out.println("  Data: " + reembolso.getData());
                System.out.println("------");
            }
        }
   }
   
    public void consultarReembolsoFatura() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ID da fatura:");
        String idFatura = sc.nextLine();
		
		
        Fatura faturaEncontrada = null;
        for (Fatura fatura : listaFaturas) {
            if (fatura.getId().equals(idFatura)) {
                faturaEncontrada = fatura;
                break;
            }
        }

        if (faturaEncontrada != null) {
            if (faturaEncontrada.getPagamentos().isEmpty()) {
                System.out.println("Não há pagamentos para esta fatura.");
            } else {
                System.out.println("Reembolsos da Fatura " + idFatura + ":");

                for (Pagamento pagamento : faturaEncontrada.getPagamentos()) {
                    Reembolso reembolso = pagamento.getReembolso();

                    if (reembolso != null) {
                        System.out.println("  Valor do Reembolso: " + reembolso.getValor());
                        System.out.println("  Data do Reembolso: " + reembolso.getData());
                        System.out.println("------");
                    } else {
                        System.out.println("  Pagamento sem reembolso associado.");
                    }
                }
            }
        } else {
            System.out.println("Fatura não encontrada.");
        }
    }
    
    
    public void incluirFalhaComMatricula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Incluindo falha com matrícula-----");
	
		System.out.println("Descrição da falha: ");
		String descricao = sc.nextLine();
	
		System.out.println("Previsão de início (AAAA-MM-DD): ");
		LocalDate previsaoInicio = LocalDate.parse(sc.nextLine());
	
		System.out.println("Data de início (AAAA-MM-DD): ");
		LocalDate dataInicio = LocalDate.parse(sc.nextLine());
	
		System.out.println("Data de fim (AAAA-MM-DD): ");
		LocalDate dataFim = LocalDate.parse(sc.nextLine());
	
		System.out.println("Tipo de falha: ");
		String tipoFalha = sc.nextLine();

		Falha novaFalha = new Falha(descricao, previsaoInicio, dataInicio, dataFim, tipoFalha);
	
		listaFalhas.add(novaFalha);
	
		System.out.println("Falha com matrícula incluída com sucesso!");
	}
	
	public void incluirFalhaSemMatricula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Incluindo falha sem matrícula-----");

		System.out.println("Descrição da falha: ");
		String descricao = sc.nextLine();
	
		System.out.println("Previsão de início (AAAA-MM-DD): ");
		LocalDate previsaoInicio = LocalDate.parse(sc.nextLine());
	
		System.out.println("Data de início (AAAA-MM-DD): ");
		LocalDate dataInicio = LocalDate.parse(sc.nextLine());
	
		System.out.println("Data de fim (AAAA-MM-DD): ");
		LocalDate dataFim = LocalDate.parse(sc.nextLine());
	
		System.out.println("Tipo de falha: ");
		String tipoFalha = sc.nextLine();

		Falha novaFalha = new Falha(descricao, previsaoInicio, dataInicio, dataFim, tipoFalha);
	
		listaFalhas.add(novaFalha);
	
		System.out.println("Falha sem matrícula incluída com sucesso!");
	}

    public void listarReparosAbertos() {
        System.out.println("-----Lista de Reparos Abertos-----");
        for (Reparo reparo : listaReparos) {
            if (!reparo.isEstadoResolvido()) {
                System.out.println("Descrição: " + reparo.getDescricao());
                System.out.println("Previsão de Reparo: " + reparo.getPrevisao());
                System.out.println("Data de Início: " + reparo.getDataInicio());
                System.out.println("-----------------------");
            }
        }
    }

    public void encerrarReparo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Encerrar Reparo-----");

        System.out.println("Informe a descrição do reparo que deseja encerrar:");
        String descricaoReparo = sc.nextLine();
        
        for (Reparo reparo : listaReparos) {
            if (reparo.getDescricao().equals(descricaoReparo) && !reparo.isEstadoResolvido()) {
                reparo.setEstadoResolvido(true);
                System.out.println("Reparo encerrado com sucesso.");
                return;
            }
        }

        System.out.println("Reparo não encontrado ou já encerrado.");
    }

    public void preencherListasComValoresIniciais() {
        // Adicionando clientes à listaClientes
        Cliente cliente1 = new Cliente("Ana", "12345678901");
        Cliente cliente2 = new Cliente("João", "98765432109");
        Cliente cliente3 = new Cliente("Maria", "11122233344");
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        // Adicionando imóveis à listaImoveis
        Imovel imovel1 = new Imovel("01", "rua dos bobos", 100.0f, 80.0f);
        Imovel imovel2 = new Imovel("02", "rua dos carros", 150.0f, 120.0f);
        Imovel imovel3 = new Imovel("03", "rua dos cachorros", 200.0f, 180.0f);
        listaImoveis.add(imovel1);
        listaImoveis.add(imovel2);
        listaImoveis.add(imovel3);

        // Adicionando faturas à listaFaturas
        Fatura fatura1 = new Fatura("ID1", LocalDate.now(), 100.0f, 80.0f, 100.0f);
        Fatura fatura2 = new Fatura("ID2", LocalDate.now(), 150.0f, 120.0f, 150.0f);
        Fatura fatura3 = new Fatura("ID3", LocalDate.now(), 200.0f, 180.0f, 200.0f);

        listaFaturas.add(fatura1);
        listaFaturas.add(fatura2);
        listaFaturas.add(fatura3);

        // Adicionando reparos à listaReparos
        Reparo reparo1 = new Reparo("Reparo1", LocalDate.now().plusDays(5), LocalDate.now(), LocalDate.now().plusDays(5));
        Reparo reparo2 = new Reparo("Reparo2", LocalDate.now().plusDays(7), LocalDate.now(), LocalDate.now().plusDays(7));
        Reparo reparo3 = new Reparo("Reparo3", LocalDate.now().plusDays(10), LocalDate.now(), LocalDate.now().plusDays(10));

        listaReparos.add(reparo1);
        listaReparos.add(reparo2);
        listaReparos.add(reparo3);

        // Adicionando falhas à listaFalhas
        Falha falha1 = new Falha("Falha1", LocalDate.now().plusDays(1), LocalDate.now(), LocalDate.now().plusDays(2), "Tipo1");
        Falha falha2 = new Falha("Falha2", LocalDate.now().plusDays(3), LocalDate.now(), LocalDate.now().plusDays(5), "Tipo2");
        Falha falha3 = new Falha("Falha3", LocalDate.now().plusDays(5), LocalDate.now(), LocalDate.now().plusDays(7), "Tipo3");
        listaFalhas.add(falha1);
        listaFalhas.add(falha2);
        listaFalhas.add(falha3);
    }
}
