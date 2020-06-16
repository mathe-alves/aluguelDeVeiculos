package aluguel;

import java.util.Locale;

public class Programa {

	//PROFESSOR, CADA ITEM AQUI QUE EST� COM COMENT�RIO, PODE SER REALIZADO COM OS M�TODOS 'PERSONALIZADOS' ABAIXO
	//AP�S RETIRAR O COMENT�RIO, COLOCAR O COMENT�RIO NO M�TODO CONSTRUTOR COMPLETO E RETIRAR OS COMENT�RIOS DOS 'SETTERS'
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Cliente c = new Cliente(true, "matheus", "masculino", 19, 12232114587L);
		// Cliente c = new Cliente(true);
		c.contrato();
		// c.setIdade(19);
		// c.setNome("Arnaldo");
		// c.setSexo("masculino");
		// c.setCpf(12232114587L);
		c.dadosCliente();
		System.out.println();
		
		System.out.println("---------CAMINH�O------------");
		System.out.println();
		Caminhao m = new Caminhao(c.contrato, "ferro", 100.0, "rio de janeiro", "minas gerais", 30, 2, "cr�dito", true);
		// Caminhao m = new Caminhao(true);
		// m.setCarga("ferro");
		// m.setPeso(100.0);
		m.contrato();
		System.out.println();
		m.dadosVeiculo();
		// m.setOrigem("rio de janeiro");
		// m.setDestino("minas gerais");
		m.origem();
		m.destino();
		// m.setEntregaCarga(30);
		// m.setDevolu��oCaminh�o(2);
		m.dataLocacao();
		m.prazoLocacao();
		m.valores();
		// m.setPagar("cr�dito");
		m.formaPagamento();
		//m.setNome("matheus");
       // m.setIdade(19);
       // m.setSexo("masculino");
        c.dadosCliente();
		//m.setLigar(true);
		m.ligar();
		m.acelerar(100);
		m.freiou(100);
		m.desligar();
		System.out.println();
		
		System.out.println("-----------CARRO ESPORTIVO------------");
		System.out.println();
		Esportivo e = new Esportivo(c.contrato, 56, "lamborghini", 1, "d�bito", true);
		// Esportivo e = new Esportivo(true);
		// e.setData(1);
		 e.contrato();
		System.out.println();
		e.dataLocacao();
		// e.setTempoMinuto(120);
		e.prazoLocacao();
		// e.setCarros("lamborghini");
		e.dadosVeiculo();
		e.valores();
		// e.setPagar("d�bito");
		e.formaPagamento();
		c.dadosCliente();
		//e.setLigar(true);
		e.ligar();
		e.acelerar(100);
		e.freiou(100);
		e.acelerar(50);
		e.freiou(150);
		e.desligar();
		System.out.println();
		
		System.out.println("----------CARRO PASSEIO-----------");
		System.out.println();
		Passeio p = new Passeio(c.contrato, 2, 12, 100, 2.0, "d�bito", true);
		// Passeio p = new Passeio(true);
		// p.setDataInicio(2);
		p.contrato();
		System.out.println();
		p.dataLocacao();
		// p.setDataTermino(12);
		p.prazoLocacao();
		// p.setMotorCarro(2.0);
		p.dadosVeiculo();
		p.valores();
		// p.setPagar("d�bito");
		p.formaPagamento();
		c.dadosCliente();
		// p.setKmPretendida(100);
		// p.setLigar(true);
		p.ligar();
		p.acelerar(100);
		p.freiou(1);
		p.acelerar(10);
		p.freiou(100);
		p.desligar();
		p.quilometragem();

	}

}
