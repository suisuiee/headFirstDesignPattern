package designpatterns._04_factory.pizzas;

public class CheeesePizza extends Pizza {
    public CheeesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";

        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }

    @Override
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
