package controller;

public class TempoController {

	public TempoController() {
		super();
	}

	public void CalculaTempo1000() {
		double tempoInicial = System.nanoTime();
		int[] vetor = new int[1000];
		for (int i = 0; i < 1000; i++) {
			vetor[i] = 0;
		}
		for (int i = 0; i < 1000; i++) {
			vetor[i] = vetor[i];
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("O tempo (em segudos) para percorrer um vetor de 1000 casas foi de: "
				+ String.format("%.5f", tempoTotal) + "S");
	}

	public void CalculaTempo10000() {
		double tempoInicial = System.nanoTime();
		int[] vetor = new int[10000];
		for (int i = 0; i < 10000; i++) {
			vetor[i] = 0;
		}
		for (int i = 0; i < 10000; i++) {
			vetor[i] = vetor[i];
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("O tempo (em segudos) para percorrer um vetor de 10000 casas foi de: "
				+ String.format("%.5f", tempoTotal) + "S");
	}

	public void CalculaTempo100000() {
		double tempoInicial = System.nanoTime();
		int[] vetor = new int[100000];
		for (int i = 0; i < 100000; i++) {
			vetor[i] = 0;
		}
		for (int i = 0; i < 100000; i++) {
			vetor[i] = vetor[i];
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("O tempo (em segudos) para percorrer um vetor de 100000 casas foi de: "
				+ String.format("%.5f", tempoTotal) + "S");
	}
}