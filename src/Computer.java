public class Computer {
    Type type;
    Screen screen;
    String country;
    int year;
    float price;
    public enum Type {
        DeskTop("стационарный компьютер"),
        LapTop("ноутбук"),
        SmartPhone("смартфон"),
        ;

        private final String text;

        Type(String text) {
            this.text=text;
        }
    }
    public static class Screen {
        int heihgt;
        int width;
    }
}