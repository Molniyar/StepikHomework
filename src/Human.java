public class Human {
    String lastName;
    String firstName;
    String middleName;
    int age;
    int height;
    int weight;
    public String getInfo() {
        return lastName.substring(0, 1).toUpperCase() +
                lastName.substring(1) +
                " " +
                firstName.substring(0, 1).toUpperCase() +
                firstName.substring(1) +
                " " +
                middleName.substring(0, 1).toUpperCase() +
                middleName.substring(1) + " " +
                "age: " + age + " height: " + height + " weight: " + weight;
    }
    public float getBodyMassIndex() {
        return (float) weight / (height / 100 * height / 100);
    }

    public Human(String lastName, String firstName, String middleName, int age, int height, int weight) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    private static boolean isCorrect(int age) {
        return age >= 18 && age <= 100;
    }
    private static boolean IsHeightCorrect(int height) {
        return height >= 120 && height <= 220;
    }
    private static boolean IsWeightCorrect(int weight) {
        return weight >= 30 && weight <= 300;
    }

    void setAge(int age) {
        if (isCorrect(age)) {
            this.age = age;
        }
    }
    void setHeight(int height) {
        if (IsHeightCorrect(height)) {
            this.height = height;
        }
    }
    void setWeight(int weight) {
        if (IsWeightCorrect(weight)) {
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Human human = new Human("савин", "ярослав", "владимирович", 0, 0, 40);
        human.setAge(20);
        human.setHeight(170);
        human.setWeight(77);
        System.out.println(human.getInfo());
        System.out.println ("индекс массы тела: " + human.getBodyMassIndex());
    }
}