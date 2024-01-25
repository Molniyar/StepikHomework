import java.util.Scanner;
public class Animal {
    Scanner input = new Scanner(System.in);
    String type;
    String name;
    int age;
    float weight;
    boolean walk;
    boolean swim;
    boolean fly;
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public Animal(String type, String name, int age, float weight, boolean walk, boolean swim, boolean fly) {
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.name = name;
        this.walk = walk;
        this.swim = swim;
        this.fly = fly;
    }
    public void printInfo() {
        System.out.println( type + " " + name + " " + age + " " + weight + " Способность ходить: " + walk + " Способность плавать: " + swim + " Способность летать: " + fly);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void inkWeight() {
        weight+= 0.1;
    }
    public static void main(String[] args) {
        Animal animal = new Animal("cat", "fax", 14, 10, true, true, false);
        animal.printInfo();
        animal.setName("bax");
        animal.printInfo();
        animal.inkWeight();
        animal.printInfo();
    }

}