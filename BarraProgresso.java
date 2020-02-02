package br.com.threadsemjava;

public class BarraProgresso implements Runnable {
	public void executa() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " - Barra de progresso... aguarde!");
		}
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " - Barra de progresso... aguarde!");
		}
	}
}
