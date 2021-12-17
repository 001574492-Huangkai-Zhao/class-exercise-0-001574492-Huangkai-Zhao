class Milk{
    String name;
    String brand;
    double price;
    String weight;
    String region;
    Boolean organic;
    String fats;
    String expirationDate;
    Milk(String name, double price)
    {
        name = name;
        price=price;
        System.out.println("Milk "+ name + " initiated");
    }

    public void setBrand()
    {
        System.out.println("Milk brand set");
    }
    public void setRegion()
    {
        System.out.println("Milk region set");
    }
    public void setExpDate()
    {
        System.out.println("Milk ExpDate set");
    }
}