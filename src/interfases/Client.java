package interfases;

public class Client implements Person {

    public Client(String firstName, String lastName, String middleName, int year, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.year = year;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return lastName + " " + firstName + " " + middleName;
    }

    @Override
    public String getInfo() {
        return getName() + " " + year + " " + phoneNumber + " " + getStatus();
    }

    @Override
    public String getStatus() {
        return "Client";
    }
    String firstName;
    String lastName;
    String middleName;
    int year;
    String phoneNumber;
}
