package ShapesCalculate;
public class PointTest{
    public static void main(String[] args) {
        Point p1 = new Point(-3,3);
        Point p2 = new Point(-4,-3);
        Point p3 = new Point(4,-2);
        Point p4 = new Point(6,5);
        // Point p5 = new Point(-4, -6);
        // Point p6 = new Point(2, -8);
        // Point p7 = new Point(6, -5);
        // Point p8 = new Point(10, -3);
        // Point p9 = new Point(8, 5);
        // Point p10= new Point(4, 8);

        Point[] pts = {p1,p2,p3,p4};
        Shape s1 = new Shape(pts);
        System.out.println(Shape.getPerimeter(s1));
        System.out.println(Shape.getAverageLength(s1));
        System.out.println(Shape.getLargestX(s1));
        System.out.println("New Shape Done");
    }
}