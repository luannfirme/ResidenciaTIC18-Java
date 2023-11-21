<h3 align="left">Prática Orientada 01</h3>
<br>
<p align="left"><b>1.</b> O que é uma classe em Java e qual é a diferença entre uma classe e um 
objeto? Dê 5 exemplos mostrando-os em C++ e em Java.</p>
<br>
<p align="left"><b>R:</b>uma classe é uma estrutura de dados abstrata que define um conjunto de atributos e métodos. Uma classe pode ser usada para representar um objeto do mundo real, como um carro, uma pessoa ou uma empresa. </p>
<p align="left">A diferença entre uma classe e um objeto é que uma classe é um modelo, enquanto um objeto é uma instância real da classe.</p>

<p align="left">Aqui estão 5 exemplos de classes e objetos em C++ e Java:</p>

<p align="left"><h3>C++</h3></p>
<p align="left"><h3><h5>Classes:</h5></p>
<div>
`class Carro {`
public:
    std::string marca;
    std::string modelo;
    int ano;

    void ligar() {
        std::cout << "Carro ligado!" << std::endl;
    }
};

class Pessoa {
public:
    std::string nome;
    int idade;

    void saudacao() {
        std::cout << "Olá, meu nome é " << nome << " e tenho " << idade << " anos." << std::endl;
    }
};
</div>
<p align="left"><h3><h5>Objetos:</h5></p>
<code>
Carro meuCarro;
meuCarro.marca = "Toyota";
meuCarro.modelo = "Corolla";
meuCarro.ano = 2020;
meuCarro.ligar();

Pessoa pessoa1;
pessoa1.nome = "Ana";
pessoa1.idade = 30;
pessoa1.saudacao(); // Chamada do método de um objeto
</code>
<br>
<p align="left"><h3>Java</h3></p>
<i>Classes:</i>
<br>
public class Carro {
    private String marca;
    privateString modelo;
    int ano;
    
	public void setMarca(String marca) {
			this.marca = marca;
	}
	
	public void setModelo(String modelo) {
			this.modelo = modelo;
	}
	
	public void setAno(int ano) {
			this.ano = ano;
	}
	
    void ligar() {
        System.out.println("Carro ligado!");
    }
}
public class Pessoa {
    String nome;
    int idade;
    
	public void setNome(String nome) {
			this.nome = nome;
	}
	
	public void setIdade(int idade) {
			this.idade = idade;
	}
    void saudacao() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
<i>Objetos:</i>
<code>
	Carro meuCarro = new Carro();
	carro.setMarca("Toyota");
	carro.setModelo("Corolla");
	carro.setAno(2020);
	meuCarro.ligar();

	Pessoa pessoa1 = new Pessoa();
	pessoa1.setNome("Ana");
	pessoa1.setIdade(30);
	pessoa1.saudacao();
</code>
<br>
<br>
<p align="left"><b>2.</b> Como você declara uma variável em Java e quais são os tipos de dados 
primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++</p>
<br>
<p align="left"><b>R:</b>Em Java, você declara variáveis fornecendo o tipo de dado seguido pelo nome da variável. Os tipos de dados primitivos mais comuns em Java são:</p>
<ul>
<li>int: Representa números inteiros.</li>
<li>double: Representa números de ponto flutuante (com precisão dupla).</li>
<li>boolean: Representa valores booleanos (verdadeiro ou falso).</li>
<li>char: Representa um caractere Unicode.</li>
<li>byte: Representa números inteiros pequenos.</li>
<li>short: Representa números inteiros curtos.</li>
<li>long: Representa números inteiros longos.</li>
<li>float: Representa números de ponto flutuante (com precisão simples).</li>
</ul>
<p align="left">Os tipos de dados primitivos mais comuns em C++ são:</p>
<ul>
<li>int: Representa números inteiros.</li>
<li>double: Representa números de ponto flutuante com precisão dupla.</li>
<li>bool: Representa valores booleanos (verdadeiro ou falso).</li>
<li>char: Representa um caractere ASCII.</li>
<li>signed char / unsigned char: Também representam caracteres, mas diferem na faixa de valores aceitáveis.</li>
<li>short: Representa números inteiros curtos.</li>
<li>long: Representa números inteiros longos.</li>
<li>float: Representa números de ponto flutuante com precisão simples.</li>
</ul>
<br>
<br>
<p align="left"><b>3.</b> Explique o conceito de herança em Java e como você pode criar uma 
subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.</p>
<br>
<p align="left"><b>R:</b>
A herança em Java (assim como em C++) é um conceito fundamental que permite a uma classe (conhecida como subclasse ou classe filha) herdar atributos e métodos de outra classe. Isso permite a reutilização de código e a criação de hierarquias entre classes, facilitando a organização e a manutenção do código.
</p>
<p align="left">Para criar uma subclasse em Java, você usa a palavra-chave extends seguida do nome da classe da qual você quer herdar.</p>
<p align="left"><h3>C++</h3></p>
<i>Classe pai:</i>
<code>
class Animal {
public:
    void fazerSom() {
        std::cout << "Barulho genérico de animal" << std::endl;
    }
};

class Veiculo {
public:
    void mover() {
        std::cout << "Veículo se movendo." << std::endl;
    }
};
</code>
<i>Classes filhas:</i>
<code>
class Cachorro : public Animal {
public:
    void latir() {
        std::cout << "Au au!" << std::endl;
    }
};
class Carro : public Veiculo {
public:
    void ligarMotor() {
        std::cout << "Motor do carro ligado." << std::endl;
    }
};
</code>
<br>
<p align="left"><h3>Java</h3></p>
<i>Classes pai:</i>
<code>
public class Animal {
    public void fazerSom() {
        System.out.println("Barulho genérico de animal");
    }
}

public class Veiculo {
    public void mover() {
        System.out.println("Veículo se movendo.");
    }
}
</code>
<i>Classes filhas:</i>
<code>
public class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au au!");
    }
}
public class Carro extends Veiculo {
    public void ligarMotor() {
        System.out.println("Motor do carro ligado.");
    }
}
</code>
<br>
<br>
<p align="left"><b>4.</b> Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. 
Em C++ é diferente. Discorra sobre esse aspecto.</p>
<br>
<p align="left"><b>R:</b>Em Java, variáveis de tipos de objetos (como classes) armazenam referências ou endereços para os objetos na memória, não os próprios objetos. Isso é frequentemente interpretado como "ponteiro", mas em Java, essas referências são tratadas de maneira transparente e são gerenciadas automaticamente pelo sistema. O programador não lida diretamente com ponteiros como em C++.</p>
<p align="left">Ao declarar uma variável de um tipo de objeto em Java, você está alocando espaço suficiente na memória para armazenar uma referência a esse objeto. Isso permite que o objeto seja acessado indiretamente através dessa referência. A manipulação do objeto é feita por meio dessas referências, mas o acesso direto aos endereços de memória não é permitido.</p>
<p align="left">Por outro lado, em C++, quando você declara uma variável de um tipo de objeto, está alocando espaço diretamente para o objeto em si, não para uma referência a ele. Em C++, as variáveis de tipos de objetos contêm o objeto real e não um ponteiro para ele. Isso significa que, ao trabalhar com objetos em C++, você está lidando diretamente com a instância real do objeto, não com uma referência a ele.</p>
<p align="left">O uso direto de ponteiros em C++ oferece ao programador mais controle sobre a manipulação da memória, permitindo alocações e desalocações manuais de memória. Em contraste, Java gerencia automaticamente a alocação e desalocação de memória para objetos, tornando-o mais seguro em relação a certos tipos de erros de programação, como vazamentos de memória ou acesso a áreas de memória não alocadas.</p>
<p align="left">Em resumo, em Java, as variáveis de tipos de objetos armazenam referências a objetos na memória, enquanto em C++, as variáveis de tipos de objetos armazenam os próprios objetos.</p>