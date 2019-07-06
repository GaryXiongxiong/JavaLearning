package ShapesCalculate;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double disToPoint(Point p2) {
        return Math.sqrt((this.x - p2.getX()) * (this.x - p2.getX()) + (this.y - p2.getY()) * (this.y - p2.getY()));
    }

}