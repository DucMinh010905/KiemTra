package kiemTra;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics g);

    void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }
}