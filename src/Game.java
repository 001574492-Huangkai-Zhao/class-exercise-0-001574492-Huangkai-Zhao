class Game{
    String name;
    String publisher;
    double price;
    String driverType;
    String ageRestriction;
    String publishDate;
    Boolean display3D;
    Boolean onlineCorp;
    Game(String name, double price)
    {
        name = name;
        price=price;
        System.out.println("TV "+ name + " initiated");
    }

    public void setPublisher()
    {
        System.out.println("Game Publisher set");
    }
    public void setDriverType()
    {
        System.out.println("Game DriverType set");
    }
    public void setAgeRestriction()
    {
        System.out.println("Game AgeRestriction set");
    }
}