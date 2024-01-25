package course.chapter27.example2;

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

class My_Panel extends JPanel {
    private final ArrayList<Integer> points = new ArrayList<>();

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
        g.fillRect(x, y, 50, 50);
    }
    public class My_Mouse implements MouseListener {


        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                repaint();
            }
            else if (e.getButton() == MouseEvent.BUTTON3) {
                points.add(e.getX());
                points.add(e.getY());
                x = getX();
                y = getY();
                paint(getGraphics());
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
