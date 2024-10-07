public class Square implements Shape{
    public double length;
    public int coordinateX;
    public int coordinateY;

    Square(double length, int coordinateX, int coordinateY){
        this.length = length;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public double calculateArea() {
        return length*length;
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
