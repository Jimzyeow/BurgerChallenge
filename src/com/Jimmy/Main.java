package com.Jimmy;

public class Main
{
    public static void main(String[] args)
    {
        Hamburger hamburger = new Hamburger("Basic burger", "Sausage", 3.56, "White");
        hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Lettuce", 2.05);
        hamburger.addHamburgerAddition2("Cheese", 1.50);
        System.out.println("Total price of hamburger is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        healthyBurger.addHealthAddition2("Cucumber", 0.50);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
    }
}
