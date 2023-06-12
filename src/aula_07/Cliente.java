package aula_07;

public class Cliente {
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	private int telefone;
	
	public Cliente(String nome, int idade, String cpf, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	public void visualizar() {
		System.out.println("\nNome: " + this.getNome() + "\nEndereço: " +	this.getEndereco());
	}
}
