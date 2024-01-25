package shapes;

public class Rectangle extends Shape {
    public void draw(){
        System.out.println("Рисую прямоугольник с верхним левым углом " + x1 + " " + y1 + " и нижним правым углом " + x2 + y2);
    }
    float x1;
    float y1;

    float x2;
    float y2;
    public Rectangle(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


}
