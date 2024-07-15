package kiemTra;

import java.awt.Graphics;

public class Triangle extends Shape {
    int x2, y2, x3, y3; // Tọa độ của ba đỉnh

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1); // Sử dụng x1, y1 làm tọa độ đỉnh đầu tiên
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    void draw(Graphics g) {
        int[] xPoints = {x, x2, x3};
        int[] yPoints = {y, y2, y3};
        g.drawPolygon(xPoints, yPoints, 3);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Triangle other = (Triangle) obj;
        return (x == other.x && y == other.y &&
                x2 == other.x2 && y2 == other.y2 &&
                x3 == other.x3 && y3 == other.y3);
    }
}
