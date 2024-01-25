package course.chapter27.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
    public My_Panel() {
        My_Key listener = new My_Key();
        addKeyListener(listener);
        setFocusable(true);
    }
    int x = 375;
    int y = 275;
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(x, y, 50, 50);
    }

    public class My_Key implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Символ " + e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Клавиша нажата " + e.getKeyChar());
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                x += 10;
                repaint();
            }
            else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                x -= 10;
                repaint();
            }
            else if (e.getKeyCode() == KeyEvent.VK_UP) {
                y -= 10;
                repaint();
            }
            else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                y += 10;
                repaint();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Клавиша отпущена " + e.getKeyChar());
        }
    }
}