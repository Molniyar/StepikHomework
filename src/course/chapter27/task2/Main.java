package course.chapter27.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        My_Frame frame = new My_Frame();
        frame.setVisible(true);
    }
}

class My_Frame extends JFrame {
    public My_Frame() {
        setTitle("Test");
        setSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        My_Panel panel = new My_Panel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}

class MyPoint {
    int x;
    int y;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class My_Panel extends JPanel {
    private final ArrayList<MyPoint> points = new ArrayList<>();

    public My_Panel() {
        My_Mouse listener = new My_Mouse();
        addMouseListener(listener);
        setFocusable(true);

    }
    int x = 0;
    int y = 0;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int i = 0;
        while (i < points.size()) {
            g.fillRect(points.get(i).x, points.get(i).y, 50, 50);
            System.out.println("Нарисован квадрат");
            i++;
        }
    }
    public class My_Mouse implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON3) {
                points.clear();
                repaint();
                System.out.println("Стёрты все квадраты");
            }
            else if (e.getButton() == MouseEvent.BUTTON1) {
                //points.add(e.getX());
                //points.add(e.getY());
                x = e.getX() - 25;
                y = e.getY() - 25;
                System.out.println(e.getX());
                System.out.println(e.getY());
                //myPaint();
                MyPoint point = new MyPoint(x, y);

                points.add(point);
                repaint();
            }
        }


        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }
}