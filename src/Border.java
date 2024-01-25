public class Border {
    int width;
    LineStyle lineStyle;
    Color lineColor;
    public static class Color {
        float red;
        float green;
        float blue;
    }

    public enum LineStyle{
        Dotted,
        Inset,
        Solid,
    }
}