package project.unitConvertor.measure.type;

import project.unitConvertor.measure.MeasureType;

public class MeasureSpeed extends MeasureType {
    public MeasureSpeed() {
        super("скорость");
        addUnit("м/с",  1);
        addUnit("км/ч", (double) 1000 / 3600);
        addUnit("узел", 0.5144444444444444444444d);
    }
}
