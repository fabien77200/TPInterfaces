package domaine;

public class Rectangle implements ISurface {

	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	
	@Override
	public double getArea() {

		double rectangleArea= width*height;
		
		return rectangleArea;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle: width=" + width + ", height=" + height ;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}

	
}
