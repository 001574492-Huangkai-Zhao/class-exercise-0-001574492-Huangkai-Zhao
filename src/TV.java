class TV{
    String name;
    String brand;
    double price;
    String weight;
    String size;
    String resolution;
    Boolean support3D;
    String region;

    TV(String name, double price)
    {
        name = name;
        price=price;
        System.out.println("TV "+ name + " initiated");
    }

    public void setBrand()
    {
        System.out.println("TV brand set");
    }
    public void setRegion()
    {
        System.out.println("TV region set");
    }
    public void setResolution()
    {
        System.out.println("TV Resolution set");
    }
}


