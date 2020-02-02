package br.com.threadsemjava;

public class SimulacaoComThreads {

	public static void main(String[] args) {
		BarraProgresso barra = new BarraProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		GeracaoRelatorio relatorio = new GeracaoRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();
	}

}
