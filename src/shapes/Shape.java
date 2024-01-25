package shapes;

public abstract class Shape {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[2];
        shapes[0] = new Circle( 16,  8,  5) ;
        shapes[1] = new Rectangle( 2,  1,  4,  8) ;

        for (int i = 0; i < shapes.length; i++){
            shapes[i].draw();
        }
    }
    public abstract void draw();
    Color color;
    public static class Color {
        float red;
        float green;
        float blue;


    }
}
