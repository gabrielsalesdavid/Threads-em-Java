package br.com.threadsemjava;

import br.com.modificadoresdeacesso.Conta;

public class FazDeposito implements Runnable {

	private Conta conta;
	
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		this.conta.depositar(200.0f);
	}

}
