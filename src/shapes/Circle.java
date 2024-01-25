package shapes;

public class Circle extends Shape {
    public void draw(){
        System.out.println("Рисую круг с центром " + centreX + " " + centreY + " и радиусом " + radiusLength);
    }
    float centreX;
    float centreY;
    float radiusLength;
    public Circle(float centreX, float centreY, float radiusLength) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radiusLength = radiusLength;
    }
}