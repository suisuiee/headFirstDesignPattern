package designpatterns._04_factory.pizzas;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected  Pizza createPizza(String item) {
        Pizza pizza = null;

        if (item.equals("cheese")) {
            pizza = new NYStyleCheesePizza();

        } else if (item.equals("veggie")) {

            pizza = new NYStyleVeggiePizza();

        }else return null;

        return pizza;
    }
}
