package com.Jimmy;

public class Hamburger
{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private double additionPrice1;
    private String additionName1;

    private double additionPrice2;
    private String additionName2;

    private double additionPrice3;
    private String additionName3;

    private double additionPrice4;
    private String additionName4;

    public Hamburger(String name, String meat, double price, String breadRollType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price)
    {
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addHamburgerAddition2(String name, double price)
    {
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price)
    {
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price)
    {
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double itemizeHamburger()
    {
        double hamburgerPrice = this.price; //set the initial price first
        //print out the basic name, roll type and price
        System.out.println(this.name + "hamburger on a " + this.breadRollType + "roll type and " + this.meat + " meat, " + "price is: " + this.price);

        if(this.additionName1 != null) //meaning user has entered something
        {
            hamburgerPrice += this.additionPrice1;
            System.out.println(this.additionName1 + " added, extra price: " + this.additionPrice1);
        }

        if(this.additionName2 != null) //meaning user has entered something
        {
            hamburgerPrice += this.additionPrice2;
            System.out.println(this.additionName2 + " added, extra price: " + this.additionPrice2);
        }

        if(this.additionName3 != null) //meaning user has entered something
        {
            hamburgerPrice += this.additionPrice3;
            System.out.println(this.additionName3 + " added, extra price: " + this.additionPrice3);
        }

        if(this.additionName4 != null) //meaning user has entered something
        {
            hamburgerPrice += this.additionPrice4;
            System.out.println(this.additionName4 + " added, extra price: " + this.additionPrice4);
        }

        return hamburgerPrice;
    }
}
