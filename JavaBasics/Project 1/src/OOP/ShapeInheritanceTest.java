package OOP;

public class ShapeInheritanceTest {
	public static void main(String[] args) {

		CircleEx c = new CircleEx();
		TriangleEx t = new TriangleEx();
		RectangleEx r = new RectangleEx();

		// ShapeInheritance s = new CircleEx();
		// CircleEx c = (CircleEx) s;

		c.setBw(20);
		c.setColor("Blue");
		c.setRadius(2);
		double d = c.area();

		System.out.println("Border Width="+ c.getBw());
		System.out.println("Border Color=" + c.getColor());
		System.out.println("Circle Radius=" + c.getRadius());
		System.out.println("Area of Circle=" + d);

		r.setLength(12);
		r.setWidth(10);
		double d1 = r.area();

		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println("Area of Rectangle=" + d1);

		t.setBase(6);
		t.setHeight(2);
		double d2 = t.area();

		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println("Area of Triangle" + d2);
		 double A= d+d1+d2;
		System.out.println("Total Area=" + A);
	}
}
