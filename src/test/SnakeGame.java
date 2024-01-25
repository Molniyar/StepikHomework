package test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class SnakeGame extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;

    private static final int GRID_SIZE = 30;
    private static final int CELL_SIZE = 30;

    private int[][] grid;
    private int snakeLength;
    private Point[] snake;
    private Point food;

    private boolean gameOver;

    public SnakeGame() {
        grid = new int[GRID_SIZE][GRID_SIZE];
        snakeLength = 1;
        snake = new Point[GRID_SIZE * GRID_SIZE];
        snake[0] = new Point(GRID_SIZE / 2, GRID_SIZE / 2);
        spawnFood();
        gameOver = false;

        setTitle("Snake Game");
        setSize(GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        Timer timer = new Timer(100, e -> {
            if (!gameOver) {
                move();
                checkCollision();
                checkFood();
                repaint();
            }
        });
        timer.start();
    }

    private void spawnFood() {
        int x, y;
        do {
            x = (int) (Math.random() * GRID_SIZE);
            y = (int) (Math.random() * GRID_SIZE);
        } while (grid[x][y] != 0);
        food = new Point(x, y);
    }

    private void move() {
        for (int i = snakeLength - 1; i > 0; i--) {
            snake[i] = new Point(snake[i - 1]);
        }

        Point head = snake[0];
        switch (direction) {
            case KeyEvent.VK_UP:
                head.y--;
                break;
            case KeyEvent.VK_DOWN:
                head.y++;
                break;
            case KeyEvent.VK_LEFT:
                head.x--;
                break;
            case KeyEvent.VK_RIGHT:
                head.x++;
                break;
        }
    }

    private void checkCollision() {
        Point head = snake[0];

        if (head.x < 0 || head.x >= GRID_SIZE || head.y < 0 || head.y >= GRID_SIZE) {
            gameOver = true;
            return;
        }

        for (int i = 1; i < snakeLength; i++) {
            if (head.equals(snake[i])) {
                gameOver = true;
                return;
            }
        }
    }

    private void checkFood() {
        Point head = snake[0];

        if (head.equals(food)) {
            snakeLength++;
            spawnFood();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.clearRect(0, 0, getWidth(), getHeight());

        if (gameOver) {
            g.setColor(Color.RED);
            g.drawString("Game Over!", getWidth() / 2 - 50, getHeight() / 2);
        } else {
            g.setColor(Color.GREEN);
            g.fillRect(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);

            g.setColor(Color.BLUE);
            for (int i = 0; i < snakeLength; i++) {
                g.fillRect(snake[i].x * CELL_SIZE, snake[i].y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    private int direction = KeyEvent.VK_RIGHT;

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if ((key == KeyEvent.VK_LEFT) && (direction != KeyEvent.VK_RIGHT)) {
            direction = KeyEvent.VK_LEFT;
        } else if ((key == KeyEvent.VK_RIGHT) && (direction != KeyEvent.VK_LEFT)) {
            direction = KeyEvent.VK_RIGHT;
        } else if ((key == KeyEvent.VK_UP) && (direction != KeyEvent.VK_DOWN)) {
            direction = KeyEvent.VK_UP;
        } else if ((key == KeyEvent.VK_DOWN) && (direction != KeyEvent.VK_UP)) {
            direction = KeyEvent.VK_DOWN;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame game = new SnakeGame();
            game.setVisible(true);
        });
    }
}
