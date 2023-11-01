package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}

	public double getArea()
	{
		return length * width;
	}
	public double getPerimeter()
	{
		return 2*width + 2*length;
	}
	public boolean isSmaller(Rectangle r2)
	{
		return getArea() < r2.getArea();
	}
	public boolean isSquare()
	{
		return length==width;
	}
	public void drawRectangle(double x, double y)
	{
		StdDraw.rectangle(x, y, width/2, length/2);
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(.25, .25);
		Rectangle r2 = new Rectangle(.5, .5);
		
		System.out.println(r1);
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.isSmaller(r2));
		System.out.println(r1.isSquare());
		r1.drawRectangle(.5, .5);
	}

	public String toString()
	{
		return "Length: " + length + " Width " + width;
	}
}
