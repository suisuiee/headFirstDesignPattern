package designpatterns._00_test;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑!");
    }
}
