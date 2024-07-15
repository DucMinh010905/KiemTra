package kiemTra;

import java.awt.Graphics;

class Circle extends Shape {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        
        Circle other = (Circle) obj;
        return x == other.x && y == other.y && radius == other.radius;
    }
}
