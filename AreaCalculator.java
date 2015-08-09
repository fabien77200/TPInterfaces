package domaine;

public class AreaCalculator {

	private AreaCalculator() {
	}

	public static double sommeAires(ISurface[] surfaces) {
		double resultatSomme = 0.0;

		for (ISurface value : surfaces) {
			resultatSomme += value.getArea();
		}

		return resultatSomme;
	}

}
