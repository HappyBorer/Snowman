import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);


        // Туловище
        g2d.drawArc(250, 350, 200, 190, 117, 305);

        g2d.drawArc(275, 235, 150, 140, 117, 305);
        g2d.drawArc(300, 165, 100, 90, 140, 257);


        // Шляпа
        g2d.drawRoundRect(325, 120, 50, 50, 10, 10);

        g2d.drawLine(325, 155, 375, 155);

        Point p1 = new Point(275, 178);
        Point p2 = new Point(325, 165);
        Point p3 = new Point(325, 185);

        Path2D p2d = new Path2D.Double();
        p2d.moveTo(p3.x, p3.y);
        p2d.curveTo(p3.x, p3.y, p1.x, p1.y, p2.x, p2.y);
        g2d.draw(p2d);

        p1 = new Point(425, 178);
        p2 = new Point(375, 165);
        p3 = new Point(375, 185);

        p2d.moveTo(p3.x, p3.y);
        p2d.curveTo(p3.x, p3.y, p1.x, p1.y, p2.x, p2.y);
        g2d.draw(p2d);

        p1 = new Point(325, 185);
        p2 = new Point(375, 185);
        p3 = new Point(350, 190);

        p2d.moveTo(p1.x, p1.y);
        p2d.curveTo(p1.x, p1.y, p3.x, p3.y, p2.x, p2.y);
        g2d.draw(p2d);

        // Пуговки
        g2d.drawOval(360, 300, 7, 7);
        g2d.drawOval(360, 280, 7, 7);
        g2d.drawOval(360, 320, 7, 7);

        // Рот
        g2d.drawOval(340, 225, 7,7);
        g2d.drawOval(352, 230, 7,7);
        g2d.drawOval(364, 230, 7,7);
        g2d.drawOval(376, 225, 7,7);

        // Глаза
        g2d.drawOval(345, 197, 10,10);
        g2d.drawOval(370, 197, 10,10);

        // Нос
        int[] xPoints = new int[]{360, 420, 362};
        int[] yPoints = new int[]{212, 212, 224};
        g2d.setColor(getBackground());
        g2d.fillPolygon(xPoints, yPoints, 3);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints, yPoints, 3);

        // руки
        xPoints = new int[]{100, 105, 130, 107, 112, 135, 285, 282, 135, 130, 125, 130};
        yPoints = new int[]{255, 250, 253, 212, 210, 254, 285, 290, 260, 285, 282, 260};
        g2d.drawPolygon(xPoints, yPoints, xPoints.length);

    }

    public Point interpolate(Point p1, Point p2, double t){
        return new Point((int) Math.round(p1.x * (1-t) + p2.x * t),
                (int) Math.round(p1.y * (1-t) + p2.y * t));
    }
}
