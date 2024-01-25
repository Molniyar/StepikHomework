package course.chapter28.task2;


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
        My_Panel.My_Key listener = new My_Panel.My_Key();
        addKeyListener(listener);
        setFocusable(true);
    }


    public class My_Key implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Символ " + e.getKeyChar());

        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("Клавиша нажата " + e.getKeyChar());
            My_Frame frame = new My_Frame();
            frame.setVisible(true);
            String login = JOptionPane.showInputDialog(frame, "Введите логин");
            String logIn = (login);
            boolean check = false;
            while (!check) {
                if (login.length() <= 4) {
                    JOptionPane.showMessageDialog(frame, "логин должен быть длиннее 4 символов", "Test", JOptionPane.WARNING_MESSAGE);
                    login = JOptionPane.showInputDialog(frame, "Введите логин");
                }
                else if (login.charAt(0) == 0 || login.charAt(0) == 1 || login.charAt(0) == 2 || login.charAt(0) == 3 || login.charAt(0) == 4 || login.charAt(0) == 5 || login.charAt(0) == 6 || login.charAt(0) == 7 || login.charAt(0) == 8 || login.charAt(0) == 9) {
                    JOptionPane.showMessageDialog(frame, "логин не может начинаться с цифры", "Test", JOptionPane.WARNING_MESSAGE);
                    login = JOptionPane.showInputDialog(frame, "Введите логин");
                }
                else check = true;
            }


            String checkPassword = "s";

            String password = JOptionPane.showInputDialog(frame, "Введите пароль");

            boolean check2 = false;
            while (!check2) {
                boolean c1 = false;
                boolean c2 = false;
                if (password.length() <= 8) {
                    JOptionPane.showMessageDialog(frame, "Пароль должен быть длиннее 8 символов", "Test", JOptionPane.WARNING_MESSAGE);
                }
                else c1 = true;
                int different = 0;

                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) == ' ') {
                        JOptionPane.showMessageDialog(frame, "Пароль не должен содержать пробелы", "Test", JOptionPane.WARNING_MESSAGE);
                        different = 1;
                    }
                }
                if (different == 0) {
                    c2 = true;
                }

                if (!c1 || !c2){
                    password = JOptionPane.showInputDialog(frame, "Введите пароль");
                }

            }

            while (!password.equals(checkPassword)) {
                checkPassword = JOptionPane.showInputDialog(frame, "Подтвердите пароль");
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("Клавиша отпущена " + e.getKeyChar());
        }

    }
}
