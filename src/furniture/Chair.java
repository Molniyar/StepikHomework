package furniture;

public class Chair extends Furniture {
    Type type;
    float allowWeight;
    public enum Type {
        Chair("стул"),
        Taburet("табурет"),
        ;

        private final String text;

        Type(String text) {
            this.text=text;
        }
    }
}

