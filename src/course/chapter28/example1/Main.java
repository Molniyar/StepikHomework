package course.chapter28.example1;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        My_Frame frame = new My_Frame();
        frame.setVisible(true);



        String name = JOptionPane.showInputDialog(frame, "Введите имя");
        System.out.println(name);
    }
}

class My_Frame extends JFrame {
    public My_Frame() {
        setTitle("Test");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}