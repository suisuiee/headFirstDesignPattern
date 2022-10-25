package designpatterns._03_decorator.starbuzz;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 밀크";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
