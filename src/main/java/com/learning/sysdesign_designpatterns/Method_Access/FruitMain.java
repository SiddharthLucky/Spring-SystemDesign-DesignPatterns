package com.learning.sysdesign_designpatterns.Method_Access;

public class FruitMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.printFruit();
        fruit.otherFruit();

        Fruit mango = new Mango();
        mango.printFruit();
        mango.otherFruit();

        /*
        Since mango class does not override the otherFruit method
        And the mango object is created from the Mango class
        when otherFruit is called it refers to the Fruit class method
        since mango is a subclass of fruit.
         */
    }
}
