package project.unitConvertor.measure;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// тип измерения: скорость, расстояние и т.д.
public class MeasureType {
    public String title;
    ArrayList<MeasureUnit> units = new ArrayList<>();
    public void addUnit(String title, double measure) {
        MeasureUnit measureUnit = new MeasureUnit(title, measure);
        units.add(measureUnit);
    }
    public double enterValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите вид единицы измерения");
        System.out.println("можно писать цифрами, например:");
        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i).title + " - " + i);
        }
        String type = input.nextLine();
        if (!type.trim().equals("0") && !type.trim().equals("1") && !Objects.equals(type.trim(), "2")){
            type = "0";
        }
        int x = Integer.parseInt(type);
        System.out.println("Введите число");
        double number = input.nextDouble();
        return units.get(x).measure * number;

    }

    public void showValue(double number){
        Scanner input = new Scanner(System.in);
        System.out.println("В какие единицы измерения вы хотите перевести?");
        String s = input.nextLine();

        int sInt = Integer.parseInt(s);

        System.out.println(number / units.get(sInt).measure);

    }
    public MeasureType(String title) {
        this.title = title;
    }

    public void convert() {
        showValue(enterValue());
    }
}
