class Furniture{
    String color;
    String weight;
    String brand;
    String dealerName;
    double price;
    String material;
    String name;
    String height;
    Furniture(String name,double price)
    {
        name = name;
        price = price;
        System.out.println("furniture "+name+" initiate");
    }
    public void setColor()
    {
        System.out.println("furniture color set");
    }
    public void setMaterial()
    {
        System.out.println("furniture Material set");
    }
    public void setDealerName()
    {
        System.out.println("furniture dealer name set");
    }
}
