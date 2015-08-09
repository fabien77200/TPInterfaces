package domaine;

public class Circle implements ISurface, IPrintable, IFXDrawable {


	private int rayon;

	
//	@Override
//	public Shape getShape() {
//
//		return null;
//	}

	@Override
	public void getPrint(String info) {
		System.out.println("précision sur le cercle = "+info);
	}

	@Override
	public String toString() {
		return "Cercle: rayon=" + rayon + "";
	}

	
	@Override
	public double getArea() {
		double circleArea=this.rayon*this.rayon*Math.PI;
		return circleArea;
	}

	public Circle(int rayon) {
		this.rayon = rayon;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

}
