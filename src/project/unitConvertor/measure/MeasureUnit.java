package project.unitConvertor.measure;

// единица измерений, например: км, ч и т.д.
public class MeasureUnit {
    String title;//пример: минута, сантиметр, км/ч и т.д.
    double measure;//размер измерения в СИ
    public MeasureUnit(String title, double measure) {
        this.title = title;
        this.measure = measure;
    }
}
