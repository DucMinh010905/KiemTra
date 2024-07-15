package kiemTra;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawShapes(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void moveShapes(int deltaX, int deltaY) {
        for (Shape shape : shapes) {
            shape.move(deltaX, deltaY);
        }
    }
    
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void removeDuplicates() {
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape currentShape : shapes) {
            boolean isDuplicate = false;
            for (Shape s : uniqueShapes) {
                if (currentShape.equals(s)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueShapes.add(currentShape);
            }
        }
        shapes = uniqueShapes;
    }
}