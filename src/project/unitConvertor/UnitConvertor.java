package project.unitConvertor;

import project.unitConvertor.measure.MeasureType;
import project.unitConvertor.measure.MeasureUnit;
import project.unitConvertor.measure.type.MeasureDistanse;
import project.unitConvertor.measure.type.MeasureSpeed;
import project.unitConvertor.measure.type.MeasureTime;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<MeasureType> list = new ArrayList<>();
        list.add(new MeasureTime());
        list.add(new MeasureDistanse());
        list.add(new MeasureSpeed());

        System.out.println("Что вы хотите переводить?");
        System.out.print("можно писать цифрами. например: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).title + " - " + i + ",  ");
        }
        System.out.println();
        String chose = input.nextLine();

        int x = Integer.parseInt(chose);
        list.get(x).convert();


        /*
        switch (chose.toLowerCase().trim()){
            case "1", "растояние": distanse(); break;
            case "2", "скорость" : speed();    break;
            default              : time();
        }
         */

    }

    private static void speed() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите вид измерения скорости");
        System.out.println("Возможные варианты: километры в час - 0, метры в секунду - 1, узлы -2.");
        String type = input.nextLine();
        System.out.println("Введите число");
        double number = input.nextDouble();
        input.nextLine();
        switch (type){
            case "1":number = number / 1000 * 60 * 60;break;
            case "2":number = number * 1852 / 1000;break;
        }
        System.out.println("Введите вид измерения скорости в который будете преобразовывать");
        System.out.println("Возможные варианты: километры в час - 0, метры в секунду - 1, узлы -2.");
        String type2 = input.nextLine();
        switch (type2){
            case "1":System.out.println(number * 1000 / 60 / 60 + " М/С");break;
            case "2":System.out.println(number / 1852 * 1000 + " узлов");break;
            default:System.out.println(number + " КМ/Ч");
        }

    }

    private static void distanse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите единицу измерения растояния которую будете переводить (по умолчанию милиметры)");
        System.out.println("можно писать цифрами. например: милиметр - 0, сантиметр - 1, дециметр - 2, метр - 3, километр - 4 миля - 5.");
        String distanseType = input.nextLine();
        System.out.println("Введите число");
        int number = input.nextInt();
        int milimetrs;
        input.nextLine();
        switch (distanseType.toLowerCase().trim()){
            case "1", "сантиметр", "сантиметры", "в сантиметрах":milimetrs = number * 10     ;break;
            case "2", "дециметр" , "дециметры" , "в дециметрах" :milimetrs = number * 100    ;break;
            case "3", "метр"     , "метры"     , "в метрах"     :milimetrs = number * 1000   ;break;
            case "4", "километр" , "километры" , "в километрах" :milimetrs = number * 1000000;break;
            case "5", "миля"     , "мили"      , "в милях"      :milimetrs = number * 1609344;break;
            default                                             :milimetrs = number;
        }
        System.out.println("Введите единицу измерения в которую будете переводить (по умолчанию секуда)");
        System.out.println("можно писать цифрами. например: милиметр - 0, сантиметр - 1, дециметр - 2, метр - 3, километр - 4, миля - 5.");
        String unitIn = input.nextLine();
        //int out;
        //int remainder;
        double out;
        String s;
        switch (unitIn.toLowerCase().trim()){
            case "1", "сантиметр"  ,"сантиметры"   ,"в сантиметры" : out = (double) milimetrs / 10;     s = "сантиметров";break;
            case "2", "дециметр"   ,"дециметры"    ,"в дециметры"  : out = (double) milimetrs / 100;    s = "дециметров"; break;
            case "3", "метр"       ,"метры"        ,"в метры"      : out = (double) milimetrs / 1000;   s = "метров";     break;
            case "4", "километр"   ,"километры"    ,"в километры"  : out = (double) milimetrs / 1000000;s = "километров"; break;
            case "5", "миля"       , "мили"       , "в мили"       : out = (double) milimetrs / 1609344;s = "миль";       break;
            default                                                : out = milimetrs;                   s = "милиметров";
        }
        System.out.println(out + " " + s);

    }

    public static void time() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите единицу измерения времени которую будете переводить (по умолчанию секунды)");
        System.out.println("можно писать цифрами. например: секунда - 0, минута - 1, час - 2, день - 3, неделя - 4.");
        String t = input.nextLine();
        System.out.println("Введите число");
        int number = input.nextInt();
        int seconds;
        input.nextLine();
        switch (t.toLowerCase().trim()){
            case "1", "минута", "минуты", "в минутых": seconds = number * 60;                  break;
            case "2", "час"   , "часы"  , "в часах"  : seconds = number * (60 * 60);           break;
            case "3", "день"  , "дни"   , "в днях"   : seconds = number * (60 * 60 * 24);      break;
            case "4", "неделя", "недели", "в неделях": seconds = number * (60 * 60 * 24 * 7);  break;
            case "5", "год"   , "года"  , "в годах"  : seconds = number * (60 * 60 * 24 * 365);break;
            default                                  : seconds = number;                       break;
        }

        System.out.println("Введите единицу измерения в которую будете переводить (по умолчанию секуда)");
        System.out.println("можно писать цифрами. например: секунда - 0, минута - 1, час - 2, день - 3, неделя - 4.");
        String unitIn = input.nextLine();
        int out;
        int remainder;
        String s;
        switch (unitIn.toLowerCase().trim()){
            case "1", "минута", "минуты","в минуты": out = seconds / 60;                   s = "минут"; remainder = seconds % 60;                  break;
            case "2", "час"   , "часы"  ,"в часы"  : out = seconds / (60 * 60);            s = "часов"; remainder = seconds % (60 * 60);           break;
            case "3", "день"  , "дни"   ,"в дни"   : out = seconds / (60 * 60 * 24);       s = "дней";  remainder = seconds % (60 * 60 * 24);      break;
            case "4", "неделя", "недели","в недели": out = seconds / (60 * 60 * 24 * 7);   s = "недель";remainder = seconds % (60 * 60 * 24 * 7);  break;
            case "5", "год"   , "года"  , "в годах": out = seconds / (60 * 60 * 24 * 365); s = "лет";   remainder = seconds % (60 * 60 * 24 * 365);break;
            default                                : out = seconds;                        s = "секунд";remainder = 0;                             break;
        }
        System.out.println(out + " " + s + " " + remainder + " секунд");
    }
}
