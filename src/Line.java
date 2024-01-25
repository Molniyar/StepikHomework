public class Line {
    double x1 = 1;
    double y1 = 1;
    double z1 = 1;

    double x2 = 2;
    double y2 = 2;
    double z2 = 2;

    public Line(double ax1, double ay1, double az1, double ax2, double ay2, double az2) {
        x1 = ax1;
        y1 = ay1;
        z1 = az1;
        x2 = ax2;
        y2 = ay2;
        z2 = az2;
    }

    public static void main(String[] args) {
        Line[] cat = new Line[3];
        cat[0] = new Line(84, 15, 8, 34, 8, 19);
        cat[1] = new Line(7, 32, 44, 38, 33, 3);
        cat[2] = new Line(57, 21, 11, 71, 83, 28);
        for (int i = 0; i < cat.length; i++) {
            System.out.printf("p1.firstName = %s, p1.lastName = %s\n", i, cat[i].lenght());

        }


    }

    private double lenght() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
    }

}
