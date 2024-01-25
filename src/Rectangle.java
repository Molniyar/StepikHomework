public class Rectangle {
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


    // 1
    public float getCenterX () {
        return (x2 - x1) / 2 + x1;
    }
    public static float getCenterX (Rectangle v) {
        return (v.x2 - v.x1) / 2 + v.x1;
    }
    public float getCenterY () {
        return (y2 - y1) / 2 + y1;
    }
    // 2
    public float getSquare () {
        return (x2 - x1) * (y1 - y2);
    }
    public float getPerimetor () {
        return ((x2 - x1) + (y1 - y2)) * 2;
    }
    public static void main(String[] args) {
        Rectangle R = new Rectangle(3, 8, 13, 2);
        System.out.print(R.getCenterX() + " ");
        System.out.println(R.getCenterY());
        System.out.println(R.getSquare());
        System.out.println(R.getPerimetor());


    }
}

