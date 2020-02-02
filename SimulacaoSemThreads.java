package br.com.threadsemjava;

public class SimulacaoSemThreads {
	public static void main(String [] args) {
		BarraProgresso barra = new BarraProgresso();
		barra.executa();
		
		GeracaoRelatorio relatorio = new GeracaoRelatorio();
		relatorio.executa();
	}

}
