package kiemTra;

import java.awt.Graphics;

public class Rectangle extends Shape {
    int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        
        Rectangle other = (Rectangle) obj;
        return x == other.x && y == other.y && width == other.width && height == other.height;
    }
}
