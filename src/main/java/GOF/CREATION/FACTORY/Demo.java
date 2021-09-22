package GOF.CREATION.FACTORY;

public class Demo {
    public static void main(String[] args) {
        var point = Point.Factory.newPolarPoint(2, 3);
    }
}

class Point {
    private double x,y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    class Factory {
        public static Point newCartesian(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
        }
    }
}
