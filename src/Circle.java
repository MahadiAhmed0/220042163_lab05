public class Circle implements Shape{
    public double radius;
    public int coordinateX,coordinateY;
    Circle(double radius, int coordinateX, int coordinateY){
        this.radius = radius;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double calculateArea() {
        return 3.1416*radius;
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
