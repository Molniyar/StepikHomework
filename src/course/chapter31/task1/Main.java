package course.chapter31.task1;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Yar\\IdeaProjects\\homework\\src");
        String[] fileList = file.list();
        //System.out.println(Arrays.toString(fileList));

        for (int i = 0; i < fileList.length; i++){
            System.out.println(fileList[i]);
        }
    }
}