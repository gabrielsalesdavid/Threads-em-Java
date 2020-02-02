package br.com.threadsemjava;

public class GeracaoRelatorio implements Runnable {
	public void executa() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " - Gerando relatorio... aguarde!");
		}
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " - Gerando relatorio... aguarde! ");
		}
	}
}
