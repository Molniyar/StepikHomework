package course.chapter31.task5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++){
            String number=(i<10? "0":"")+i;
            File file = new File("C:\\Users\\Yar\\IdeaProjects\\homework\\src\\course\\chapter31\\task5\\spam_" + number + ".txt");
            file.createNewFile();
        }
    }

}
