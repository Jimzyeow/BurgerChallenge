package com.Jimmy;

public class DeluxeBurger extends Hamburger
{
    public DeluxeBurger()
    {
        super("Deluxe", "Sausage and Bacon", 14.50, "White");
        super.addHamburgerAddition1("Chips", 5.43);
        super.addHamburgerAddition2("Drink", 1.80);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }
}
