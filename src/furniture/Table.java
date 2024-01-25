package furniture;

public class Table extends Furniture {
    Type type;
    String material;
    public enum Type {
        Kitchen("кухонные"),
        Desk("для письма"),
        Computer("для компьютер"),
        Magazine("журнальные"),
        ;

        private final String text;

        Type(String text) {
            this.text=text;
        }
    }
}
