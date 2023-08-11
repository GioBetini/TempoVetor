package view;
import controller.TempoController;

public class Principal {

	public static void main(String[] args) {
		TempoController tc = new TempoController();
		tc.CalculaTempo1000();
		tc.CalculaTempo10000();
		tc.CalculaTempo100000();

	}

}
