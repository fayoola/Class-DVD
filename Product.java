package Bupasha;

public class Product {
    protected int number;
    protected String name;
    protected int quantitiy;
    protected double price;
    
    public Product(){
        number = 0;
        name = "";
        quantitiy = 0;
        price = 0;
    }

    public Product(int number, String name, int quantitiy, double price){
        this.number = number;
        this.name = name;
        this.quantitiy = quantitiy;
        this.price = price;
    }

    public void print(){
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantitiy);
        System.out.println("Price: " + price);
    }
}