class Beer{
    String Name;
    String Brand;
    double Price;
    String Weight;
    String Region;
    String Ahl;
    String BeerType;
    Boolean DarkBeer;
    Beer(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("Beer "+ name + " initiated");
    }

    public void SetBrand()
    {
        System.out.println("beer brand set");
    }
    public void SetRegion()
    {
        System.out.println("beer region set");
    }
    public void SetAhl()
    {
        System.out.println("Beer Ahl set");
    }
}