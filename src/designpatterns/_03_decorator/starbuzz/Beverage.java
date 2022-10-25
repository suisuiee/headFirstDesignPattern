package designpatterns._03_decorator.starbuzz;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

}

