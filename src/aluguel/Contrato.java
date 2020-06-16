package aluguel;

public abstract class Contrato {
	
	protected boolean contrato;
	protected double valor;
	
	public Contrato(boolean contrato) {
		super();
		this.contrato = contrato;
	}
	
	public void dadosCliente() {
		
	}
	public void dataLocacao() {
		
	}
	public void prazoLocacao() {
		
	}
	public void valores() {
		
	}
	public void quilometragem() {
		
	}
	public void formaPagamento() {
		
	}
	public void valorAdiantado() {
		
	}
	public void dadosVeiculo() {
		
	}
	public void contrato() {
		if(this.contrato) {
			System.out.println("Contrato assinado");
			 System.out.println();
		}else {
			System.out.println("Contrato não assinado");
		}
	}
	public boolean getContrato() {
		return contrato;
	}
	public void setContrato(boolean contrato) {
		this.contrato = contrato;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
