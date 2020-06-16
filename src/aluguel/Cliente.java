package aluguel;

public class Cliente extends Contrato{
	
	private String nome;
	private String sexo;
	private int idade;
	private long cpf;

	public Cliente(boolean contrato, String nome, String sexo, int idade, long cpf) {
		super(contrato);
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
	}

	public Cliente(boolean contrato) {
		super(contrato);
	}


	

	@Override
	public void contrato() {
		if(this.contrato) {
			System.out.println("Contrato assinado");
			 System.out.println();
		}else {
			System.out.println("Contrato não assinado");
		}
	}
	
	@Override
    public void dadosCliente() {
		if(this.contrato) {
			System.out.println("DADOS PESSOAIS");
			 System.out.println();
	    	System.out.println("Nome: " + getNome());
	    	 System.out.println();
			System.out.println("Idade: " + getIdade());
			 System.out.println();
			System.out.println("Sexo: " + getSexo());
			System.out.println();
			System.out.println("Cpf: " + getCpf());
			System.out.println();
			System.out.println("Contrato assinado");
			  
		}
		else {
			System.out.println("Dados indisponiveis");
		}
	}
	
	
        
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
