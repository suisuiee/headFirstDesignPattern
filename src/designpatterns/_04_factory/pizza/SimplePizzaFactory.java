package designpatterns._04_factory.pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if( type.equals("cheese") ){
            pizza = new CheeesePizza();
        }else if( type.equals("pepperoni") ){
            pizza = new PerpperoniPizza();
        }else if( type.equals("clam") ){
            pizza = new ClamPizza();
        }else if( type.equals("veggie") ){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
