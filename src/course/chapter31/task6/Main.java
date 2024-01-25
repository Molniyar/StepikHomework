package course.chapter31.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\Yar\\IdeaProjects\\homework\\src\\course\\chapter31\\task6\\text.txt");
        for (int i =10; i > 0; i--){
            fileWriter.write("" + Math.rint(Math.random() * 100));
            fileWriter.write("\n");
        }
        fileWriter.close();
        System.out.println();
        String firstNumber = "";
        String secondNumber = "";
        String lastNumber = "";
        try {
            File file = new File("C:\\Users\\Yar\\IdeaProjects\\homework\\src\\course\\chapter31\\task6\\text.txt");

            Scanner text = new Scanner(file);
            int i = 0;


            while (text.hasNextLine()) {
                String info = text.nextLine();
                i++;
                if (i == 1){
                    firstNumber =  info;
                }
                if (i == 2){
                    secondNumber =  info;
                }
                if (!text.hasNextLine()){
                    lastNumber =  info;
                }
            }

            text.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка!");
            ex.printStackTrace();
        }
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(lastNumber);
    }

}
