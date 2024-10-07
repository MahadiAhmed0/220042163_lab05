import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderPrinter {
    public void printShapesInOrder(List<Shape> shapes) {
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                int areaComparison = Double.compare(s1.calculateArea(), s2.calculateArea());
                if (areaComparison != 0) {
                    return areaComparison;
                }

                int coordinateXComparison = Integer.compare(s1.getCoordinateX(), s2.getCoordinateX());
                if (coordinateXComparison != 0) {
                    return coordinateXComparison;
                }

                return Integer.compare(s1.getCoordinateY(), s2.getCoordinateY());
            }
        });
        for(Shape shape : shapes) {
            shape.draw();
            System.out.println("at (" + shape.getCoordinateX() + ", " + shape.getCoordinateY() + ") with area " + shape.calculateArea());
        }
    }
}