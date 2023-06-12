package aula_07;

public class Funcionario {
	private String dataDeAdmissao;
	private String departamento;
	private String cargo;
	private String nome;
	private float salario;
	
	public Funcionario(String dataDeAdmissao, String departamento, String cargo, String nome, float salario) {
		super();
		this.dataDeAdmissao = dataDeAdmissao;
		this.departamento = departamento;
		this.cargo = cargo;
		this.nome = nome;
		this.salario = salario;
	}

	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void saudacao() {
		System.out.println("Nome: " + this.getNome() + "\nDepartamento: " + this.getDepartamento());
	}
}
