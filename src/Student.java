public class Student {
    String firstName;
    String lastName;
    int age;
    String course;
    int balance;

    public Student(String aFirstName, String aLastName, int aAge, String aCourse, int aBalance) {
        firstName=aFirstName;
        lastName=aLastName;
        age=aAge;
        course=aCourse;
        balance=aBalance;
    }

    public static void main(String[] args) {
        Student[] students;
        students = new Student[3];
        students[0] = new Student("Faks", "Savin", 13, "Java", 15);
        students[0].firstName = "факс";
        students[1] = new Student("Bars", "Savin", 10, "Java", 1000);
        students[2] = new Student("Vaska", "Savin", 2, "Minecraft", 0);
        for (int i = 0; i < students.length; i++) {
            System.out.printf("p1.firstName = %s, p1.lastName = %s\n", students[i].firstName, students[i].lastName);
            students[i].print();
        }
        System.out.print("самый старый студент: ");
        getOldestStudent(students).print();
    }
    public static Student getOldestStudent (Student[] arrayOfStudents) {
        int i = 0;
        Student oldestStudent = arrayOfStudents[0];
        while (i < arrayOfStudents.length){
            if (arrayOfStudents[i].age > oldestStudent.age){
                oldestStudent = arrayOfStudents[i];
            }
            i++;
        }
        return oldestStudent;
    }
    public String getBalanceStr () {
        if (balance >= 0){
            return "Текущий баланс: " + balance + " руб.";
        }
        else return "Задолженность!";
    }
    private void print() {
        System.out.printf("p1.firstName = %s, p1.lastName = %s, balance = %s\n", firstName, lastName, getBalanceStr());

    }
}
