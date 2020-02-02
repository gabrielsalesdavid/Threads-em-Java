package br.com.threadsemjava;

import br.com.modificadoresdeacesso.Cliente;
import br.com.modificadoresdeacesso.Conta;

public class ContaThreadNaoSincronizada {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(1, "Rebeca Vitoria", "Rua: Amorzão, 2");
		Conta c1 = new Conta(1, 500, 200, cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		System.out.println(c1);
	}

}
