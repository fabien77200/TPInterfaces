package lanceur;

import java.util.Collection;
import domaine.*;

public class TestMain {

	public static void main(String[] args) {

		Circle c1 = new Circle(10);
		Rectangle r1 = new Rectangle(5, 3);
		Square s1 = new Square(4);

		ISurface[] surfaces = new ISurface[3];
		surfaces[0] = c1;
		surfaces[1] = r1;
		surfaces[2] = s1;

		for (ISurface value : surfaces) {
			System.out.println(value);
			System.out.println("Arrondi de l'Aire = " + Math.round(value.getArea()));
		}

		double sum = AreaCalculator.sommeAires(surfaces);

		System.out.println("\nsomme des aires = " + Math.round(sum));
		c1.getPrint("c1 est le nom de l'objet");

		
	}

}
