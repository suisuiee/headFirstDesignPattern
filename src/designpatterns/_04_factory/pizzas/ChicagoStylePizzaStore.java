package designpatterns._04_factory.pizzas;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        if (item.equals("cheese")) {

            pizza = new ChicagoStyleCheesePizza();

        } else if (item.equals("veggie")) {

            pizza = new ChicagoStyleVeggiePizza();

        }else return null;

        return pizza;
    }
}
