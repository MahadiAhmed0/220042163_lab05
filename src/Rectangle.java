public class Rectangle implements Shape{
    public double length, breadth;
    public int coordinateX,coordinateY;

    Rectangle(double length, double breadth, int coordinateX, int coordinateY){
        this.length = length;
        this.breadth = breadth;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }

    @Override
    public int getCoordinateX() {
        return coordinateX;
    }

    @Override
    public int getCoordinateY() {
        return coordinateY;
    }
}
