package ShapesCalculate;

public class Shape{
    private Point[] pts;
    public Shape(Point... pts){
        this.pts = pts.clone();
    }
    public int getNumOfPt(){
        return pts.length;
    }
    public Point[] getPoints(){
        return pts;
    }
    public Point getPoint(int n){
        return pts[n];
    }
    public static double getPerimeter(Shape s){
        int n = s.getNumOfPt();
        double sumDis = 0;
        for(int i=1;i<n ;i++){
            sumDis = sumDis + s.getPoint(i-1).disToPoint(s.getPoint(i));
        }
        sumDis = sumDis + s.getPoint(n-1).disToPoint(s.getPoint(0));
        return sumDis;
    }
    public static double getAverageLength(Shape s){
        return getPerimeter(s)/s.getNumOfPt();
    }
    public static double getLargestX(Shape s){
        Point[] pts = s.getPoints();
        double maxX = pts[0].getX();
        for (Point pt : pts) {
            if(pt.getX()>maxX){
                maxX = pt.getX();
            }
        }
        return maxX;
    }

}