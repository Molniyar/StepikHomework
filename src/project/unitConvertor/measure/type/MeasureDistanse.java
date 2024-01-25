package project.unitConvertor.measure.type;

import project.unitConvertor.measure.MeasureType;

public class MeasureDistanse extends MeasureType {
    public MeasureDistanse() {
        super("растояние");
        addUnit("милиметр",   0.001);
        addUnit("сантиметр",  0.01);
        addUnit("дециметр",   0.1);
        addUnit("метр",       1);
        addUnit("километр",  1000);
    }
}

