package course.chapter31.task2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFileExtension("spam.txt"));
        System.out.println(getFileExtension("spam.txt.zip"));
        System.out.println(getFileExtension("spam"));
        System.out.println(getFileExtension("C:\\Users\\admin\\IdeaProjects\\lesson_01\\src\\spam.txt"));
        System.out.println(getFileExtension("C:\\Users\\admin\\IdeaProjects\\lesson_01\\src\\spam.txt.zip"));
        System.out.println(getFileExtension("C:\\Users\\admin\\IdeaProjects\\lesson_01\\src.txt\\spam"));
        System.out.println(getFileExtension("C:\\Users\\admin\\IdeaProjects\\lesson_01\\src\\spam"));
    }
    public static String getFileExtension(String filePath) {
        int getStartString = filePath.lastIndexOf("\\");
        String s;
        if (getStartString >= 0){
            s = filePath.substring(getStartString);
        }
        else s = filePath;


        int index = s.lastIndexOf(".");
        if (index >= 0) {
            return (s.substring(index));
        }
        else return ("");
    }
}
