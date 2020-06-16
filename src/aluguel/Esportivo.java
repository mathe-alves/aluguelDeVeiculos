package aluguel;

public class Esportivo extends Cliente implements Veiculos {

	private int tempoMinuto;
	private String carros;
	private int data = 1;
	private boolean ligar;
	private double correr;
	private double frear;
	private String pagar;

	public Esportivo(boolean contrato, int tempoMinuto, String carros, int data, String pagar, boolean ligar) {
		super(contrato);
		this.tempoMinuto = tempoMinuto;
		this.carros = carros;
		this.data = data;
		this.pagar = pagar;
		this.ligar = ligar;
	}

	public Esportivo(boolean contrato) {
		super(contrato);
	}

	

	@Override
	public void dataLocacao() {
		if (this.getContrato() && this.data == 1) {
			System.out.println("Data dentro do prazo");
			System.out.println();
		}
	}

	@Override
	public void prazoLocacao() {
		if (this.getContrato() && this.tempoMinuto >= 20 && this.tempoMinuto <= 120) {
			System.out.println("O minutos estão no tempo adequado");
			System.out.println();
		} else if (this.getContrato() && this.tempoMinuto > 120) {
			System.out.println("O valor de acréscimo será acrescentado");
			System.out.println();
		} else if (this.getContrato() && this.tempoMinuto < 0) {
			System.out.println("Tempo indisponível");
			System.out.println();
		}
	}

	@Override
	public void dadosVeiculo() {
		if (this.getContrato() && this.getCarros().equalsIgnoreCase("ferrari") && this.getTempoMinuto() > 0
				&& this.getTempoMinuto() < 120
				|| this.getContrato() && this.getCarros().equalsIgnoreCase("lamborghini")
						&& this.getTempoMinuto() > 0) {
			System.out.println("Você escolheu a ferrari");
			System.out.println();
		} else if (this.getContrato() && this.getCarros().equalsIgnoreCase("lamborghini") && this.getTempoMinuto() > 0
				&& this.getTempoMinuto() < 120
				|| this.getContrato() && this.getCarros().equalsIgnoreCase("lamborghini")
						&& this.getTempoMinuto() > 0) {
			System.out.println("Você escolheu a lamborghini");
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
		if (this.getContrato() && this.getPagar().equalsIgnoreCase("débito") && this.getTempoMinuto() > 0
				&& this.getTempoMinuto() < 120) {
			System.out.println("Sua compra foi efetuada!");
			System.out.println();
		} else if (this.getContrato() && this.getPagar().equalsIgnoreCase("crédito") && this.getTempoMinuto() > 0
				&& this.getTempoMinuto() < 120) {
			System.out.println("Parcelamos em apenas 2x sem juros!");
			System.out.println();
		} else if (this.getContrato() && this.getTempoMinuto() < 0) {

		}

	}

	@Override
	public void valores() {
		if (this.getContrato() && this.getCarros().equalsIgnoreCase("ferrari") && this.getTempoMinuto() >= 20
				&& this.getTempoMinuto() <= 120) {
			this.setValor(3000.00);
			System.out.printf("O valor da ferrari é: %.2f%n", this.getValor());
			System.out.println();
		} else if (this.getContrato() && this.getCarros().equalsIgnoreCase("ferrari") && this.getTempoMinuto() > 120) {
			this.setValor((3000 + this.getTempoMinuto()) * 2);
			System.out.printf("O valor da ferrari ficou em: %.2f%n", this.getValor());
			System.out.println();
		} else if (this.getContrato() && this.getCarros().equalsIgnoreCase("lamborghini") && this.getTempoMinuto() >= 20
				&& this.getTempoMinuto() <= 120) {
			this.setValor(5000.00);
			System.out.printf("O valor da lamborghini é: %.2f%n", this.getValor());
			System.out.println();
		} else if (this.getContrato() && this.getCarros().equalsIgnoreCase("lamborghini")
				&& this.getTempoMinuto() > 120) {
			this.setValor((5000 + this.getTempoMinuto()) * 2);
			System.out.printf("O valor da lamborghini ficou em: %.2f%n", this.getValor());
			System.out.println();
		}
	}

	@Override
	public void dadosCliente() {

	}

	public int getTempoMinuto() {
		return tempoMinuto;
	}

	public void setTempoMinuto(int tempoMinuto) {
		this.tempoMinuto = tempoMinuto;
	}

	public String getCarros() {
		return carros;
	}

	public void setCarros(String carros) {
		this.carros = carros;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
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
