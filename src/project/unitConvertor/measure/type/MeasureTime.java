package project.unitConvertor.measure.type;

import project.unitConvertor.measure.MeasureType;

public class MeasureTime extends MeasureType {
    public MeasureTime() {
        super("время");
        addUnit("секунда", 1);
        addUnit("минута",  60);
        addUnit("час",     60 * 60);
        addUnit("день",    60 * 60 * 24);
        addUnit("неделя",  60 * 60 * 24 * 7);
    }
}
