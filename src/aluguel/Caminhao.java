package aluguel;

public class Caminhao extends Cliente implements Veiculos {

	private String carga;
	private double peso;
	private String origem;
	private String destino;
	private int entregaCarga;
	private int devolucaoCaminhao;
	private boolean ligar;
	private double correr;
	private double frear;
	private String pagar;

	public Caminhao(boolean contrato, String carga, double peso, String origem, String destino, int entregaCarga,
			int devolucaoCaminhao, String pagar, boolean ligar) {
		super(contrato);
		this.carga = carga;
		this.peso = peso;
		this.origem = origem;
		this.destino = destino;
		this.entregaCarga = entregaCarga;
		this.devolucaoCaminhao = devolucaoCaminhao;
		this.pagar = pagar;
		this.ligar = ligar;
	}

	public Caminhao(boolean contrato) {
		super(contrato);
	}

	
	public void origem() {
		if (this.getContrato() && this.getOrigem().equalsIgnoreCase("Rio de janeiro")) {
			System.out.println("Origem do local aplicável!");
			System.out.println();
		}
	}

	public void destino() {
		if (this.getContrato() && this.getDestino().equalsIgnoreCase("São paulo")
				|| this.getContrato() && this.getDestino().equalsIgnoreCase("Minas Gerais")) {
			System.out.println("Destino do local aplicável!");
			System.out.println();
		}
	}

	@Override
	public void dataLocacao() {
		if (this.getContrato() && this.getEntregaCarga() >= 1 && this.getEntregaCarga() <= 30) {
			System.out.println("O total de meses está dentro da data de entrega adequada");
			System.out.println();
		}
	}

	@Override
	public void prazoLocacao() {
		if (this.getContrato() && this.getDevoluçãoCaminhão() == this.getEntregaCarga()
				&& this.getDevoluçãoCaminhão() >= 1
				|| this.getContrato() && this.getDevoluçãoCaminhão() <= this.getEntregaCarga()
						&& this.getDevoluçãoCaminhão() >= 1) {
			this.setDevoluçãoCaminhão(getDevoluçãoCaminhão() + 1);
			System.out.println("O total de meses está dentra da data de devolução do caminhão");
			System.out.println();
			System.out.println("Damos 1 mês a mais para a devolução");
			System.out.println();
			System.out.println("Total de meses: " + this.getDevoluçãoCaminhão() + " meses");
			System.out.println();
		}
	}

	@Override
	public void dadosVeiculo() {
		if (this.getContrato() && this.getPeso() <= 200.0 && this.getCarga().equalsIgnoreCase("ferro")
				|| this.getContrato() && this.getPeso() <= 200.0 && this.getCarga().equalsIgnoreCase("madeira")) {
			System.out.println("Caminhão disponível para o tipo de carga com o peso adequado");
			System.out.println();
		}
	}

	@Override
	public void contrato() {

		if (this.contrato == true) {
			System.out.println("Contrato assinado");
		} else {
			System.out.println("Não assinado");
		}
	}

	@Override
	public void formaPagamento() {
		if (this.getContrato() && this.getPagar().equalsIgnoreCase("débito")) {
			System.out.println("Sua compra foi efetuada!");
			System.out.println();
		} else if (this.getContrato() && this.getPagar().equalsIgnoreCase("crédito")) {
			System.out.println("Parcelamos em apenas 2x sem juros!");
			System.out.println();
		}
	}

	@Override
	public void valores() {
		if (this.getContrato() && this.getCarga().equalsIgnoreCase("madeira")) {
			this.setValor(5000.0);
			System.out.printf("Valor do caminhão R$ %.2f%n", this.getValor());
			System.out.println();
		} else if (this.getContrato() && this.getCarga().equalsIgnoreCase("ferro")) {
			this.setValor(10000.0);
			System.out.printf("Valor do caminhão R$ %.2f%n", this.getValor());
			System.out.println();
		}
	}

	@Override
	public void dadosCliente() {

	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getEntregaCarga() {
		return entregaCarga;
	}

	public void setEntregaCarga(int entregaCarga) {
		this.entregaCarga = entregaCarga;
	}

	public int getDevoluçãoCaminhão() {
		return devolucaoCaminhao;
	}

	public void setDevoluçãoCaminhão(int devolucaoCaminhao) {
		this.devolucaoCaminhao = devolucaoCaminhao;
	}

	public boolean getLigar() {
		return ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	public double getCorrer() {
		return correr;
	}

	public double getFrear() {
		return frear;
	}

	public String getPagar() {
		return pagar;
	}

	public void setPagar(String pagar) {
		this.pagar = pagar;
	}

	@Override
	public void ligar() {
		if (this.getLigar() && this.getContrato()) {
			System.out.println();
			System.out.println("O carro ligou");
			System.out.println();
		} else {
			System.out.println("O carro está desligado");
			System.out.println();
		}
	}

	@Override
	public void desligar() {
		if (this.getLigar() && this.getContrato() && this.getFrear() < 1) {
			System.out.println("O carro desligou");
			System.out.println();
		}
	}

	@Override
	public void acelerar(int rapido) {
		if (this.getLigar() && this.getContrato()) {

			this.correr = this.correr + rapido;
			System.out.println("O carro acelerou: " + this.getCorrer() + "km");
			System.out.println();
		}
	}

	@Override
	public void freiou(int devagar) {
		if (this.getLigar() && this.getContrato()) {

			this.frear = this.correr - devagar;
			System.out.println("O carro freou: " + this.getFrear() + "km");
			System.out.println();
		}
		if (this.getLigar() && this.getContrato() && this.frear < 0) {

			System.out.println("Não tem como frear mais que " + this.correr + "km");
			System.out.println();
		}

	}

}
