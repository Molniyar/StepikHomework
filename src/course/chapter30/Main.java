package course.chapter30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        input.nextLine();
        String[] list = new String[count];
        for (int i = 0; i < count; i++){
            list[i] = input.nextLine();
        }
        int index = input.nextInt();

        try {
            System.out.println(list[index - 1]);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Неверный ввод");
        }
        finally {
            System.out.println("Хорошего дня");
        }
    }
}