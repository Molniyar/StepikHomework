import java.util.Locale;

public class Contact {
    String name;
    String phoneNumber;
    public String getInfo () {
        return name.substring(0, 1).toUpperCase() + name.substring(1) + "+" + phoneNumber;
    }
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
     public static void main(String[] args) {
         Contact C = new Contact("ярослав", "2313463");
         System.out.print(C.getInfo());
    }
}
