package aluguel;

public class Passeio extends Cliente implements Veiculos {

	private int dataInicio;
	private int dataTermino;
	private double kmPretendida;
	private double motorCarro;
	private String carro;
	private boolean ligar;
	private double correr;
	private double frear;
	private String pagar;

	public Passeio(boolean contrato) {
		super(contrato);
	}

	public Passeio(boolean contrato, int dataInicio, int dataTermino, double kmPretendida, double motorCarro,
			String pagar, boolean ligar) {
		super(contrato);
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.kmPretendida = kmPretendida;
		this.motorCarro = motorCarro;
		this.pagar = pagar;
		this.ligar = ligar;
	}

	

	@Override
	public void dataLocacao() {
		if (this.getContrato() && this.dataInicio >= 1 && this.dataInicio <= 12) {
			System.out.println("Tá dentro da data adequada ");
			System.out.println();
		}
	}

	@Override
	public void prazoLocacao() {
		if (this.getContrato() && this.dataTermino >= 1 && this.dataTermino <= 12 && this.dataTermino > this.dataInicio
				|| this.dataTermino >= 1 && this.dataTermino <= 12 && this.dataTermino < this.dataInicio) {
			System.out.println("Está dentro do prazo");
			System.out.println();
		}
	}

	@Override
	public void dadosVeiculo() {
		if (this.getContrato() && this.getMotorCarro() == 1.0) {
			this.setCarro("Gol");
			System.out.println("O carro com motor 1.0 é: " + this.getCarro());
			System.out.println();
		} else if (this.getContrato() && this.getMotorCarro() == 1.6) {
			this.setCarro("Uno");
			System.out.println("O carro com motor 1.6 é: " + this.getCarro());
			System.out.println();
		} else if (this.getContrato() && this.getMotorCarro() == 2.0) {
			this.setCarro("Honda");
			System.out.println("O carro com motor 2.0 é: " + this.getCarro());
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
		if (this.getContrato() && this.getMotorCarro() == 1.0) {
			this.setValor(3000.00);
			System.out.printf("O valor do carro %s é R$ %.2f%n", this.getCarro(), this.getValor());
			System.out.println();
		} else if (this.getContrato() && this.getMotorCarro() == 1.6) {
			this.setValor(5000.00);
			System.out.printf("O valor do carro %s é R$ %.2f%n", this.getCarro(), this.getValor());
			System.out.println();
		} else if (this.getContrato() && this.getMotorCarro() == 2.0) {
			this.setValor(8000.00);
			System.out.printf("O valor do carro %s é R$ %.2f%n", this.getCarro(), this.getValor());
			System.out.println();
		}
	}

	@Override
	public void quilometragem() {
		if (this.getLigar() && this.getContrato() && this.getCorrer() <= this.getKmPretendida()) {

			System.out.println("A quilometragem do veículo foi de: " + this.getCorrer() + "km");
			System.out.println();

		} else if (this.getLigar() && this.getContrato() && this.getCorrer() > this.getKmPretendida()) {

			System.out.println("A quilometragem do veículo ultrapassou o limite: " + this.getCorrer() + "km");
			System.out.println("Está sujeito a multa!");
			System.out.println();
		}

	}

	@Override
	public void dadosCliente() {

	}

	public int getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(int dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getKmPretendida() {
		return kmPretendida;
	}

	public void setKmPretendida(double kmPretendida) {
		this.kmPretendida = kmPretendida;
	}

	public double getMotorCarro() {
		return motorCarro;
	}

	public void setMotorCarro(double motorCarro) {
		this.motorCarro = motorCarro;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
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
