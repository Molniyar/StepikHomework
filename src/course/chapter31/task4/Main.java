package course.chapter31.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter file = new FileWriter("C:\\Users\\Yar\\IdeaProjects\\homework\\src\\course\\chapter31\\task4\\test.txt");
        while (true){
            String s = input.nextLine();
            if (Objects.equals(s, "STOP")){
                break;
            }
            System.out.println("Введина строка: " + s);
            file.write(s);
            file.write("\n");
        }
        file.close();
    }

}
