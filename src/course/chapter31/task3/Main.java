package course.chapter31.task3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("Введина строка: " + s);
        FileWriter file = new FileWriter("C:\\Users\\Yar\\IdeaProjects\\homework\\src\\course\\chapter31\\task3\\test.txt");
        file.write(s);
        file.close();
        System.out.println(file);
    }

}
