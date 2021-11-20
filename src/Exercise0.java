
class car {
    String Size;
    String Windowtype;
    static private int Carprice;  //static private varible can be called by static Nested class
    String Windsheild;
    String SalesAgentname;
    int Enginetype;
    String Color;
    String Wheeltype;

    //Static Nested class declaration start:
    static class LuxuryCar{
        void initiateLuxuryCar()
        {
            Carprice = 10000;
            System.out.println("Luxury Car initiated");
        }
    }
    //Static Nested class declaration ends.

    //inner nested class declaration start:
    class salesinfo{
        void setsalesinfo(){
            SalesAgentname = "Judy";
        }
    }
    //inner nested class declaration end.

    //use constructor to initiate an inner nested class
    car(){
        salesinfo salesinfoset = new salesinfo();
        salesinfoset.setsalesinfo();
        System.out.println("inner class initiated by constructor " + "  SalesAgentname set to " + SalesAgentname );
    }

    //use constructor to initiate properties
    car(String input_windsheild, int input_enginetype){
        this.Windowtype = input_windsheild;
        this.Enginetype = input_enginetype;
        System.out.println("car class initiated by constructor");
    }



    //Three class methods start:
    void setCarcolor() {
        System.out.println("carcolor initiated");
    }


    void setEnginetype() {
        System.out.println("Enginetype initiated");
    }

    void setwheeltype() {
        System.out.println("Wheeltype initiated");

    }
    //Three class methods ends.
}

class Furniture{
    String Color;
    String Weight;
    String Brand;
    String DealerName;
    double Price;
    String Material;
    String Name;
    String Height;
    Furniture(String name,double price)
    {
        Name = name;
        Price = price;
        System.out.println("furniture "+name+" initiate");
    }
    public void SetColor()
    {
        System.out.println("furniture color set");
    }
    public void SetMaterial()
    {
        System.out.println("furniture Material set");
    }
    public void SetDealerName()
    {
        System.out.println("furniture dealer name set");
    }
}

class Snacks{
    String Name;
    String Brand;
    double Price;
    String Weight;
    String Ingredient;
    String Nutrition;
    String Fats;
    boolean GMO;

    Snacks(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("Snack "+ name + " initiated");
    }

    public void SetFats()
    {
        System.out.println("snack fats set");
    }
    public void SetIngredient()
    {
        System.out.println("snack ingredient set");
    }
    public void SetNutrition()
    {
        System.out.println("snack nutrition set");
    }
}

class Computers{
    String Name;
    String Brand;
    double Price;
    String Weight;
    String CPUType;
    String GPUType;
    String RamSize;
    boolean TouchScreen;
    Computers(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("Computer "+ name + " initiated");
    }
    public void SetCPUType()
    {
        System.out.println("Computer CPUType set");
    }
    public void SetGPUType()
    {
        System.out.println("Computer GPUType set");
    }
    public void SetRamSize()
    {
        System.out.println("Computer RamSize set");
    }
}

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

class Milk{
    String Name;
    String Brand;
    double Price;
    String Weight;
    String Region;
    Boolean Organic;
    String Fats;
    String ExpirationDate;
    Milk(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("Milk "+ name + " initiated");
    }

    public void SetBrand()
    {
        System.out.println("Milk brand set");
    }
    public void SetRegion()
    {
        System.out.println("Milk region set");
    }
    public void SetExpDate()
    {
        System.out.println("Milk ExpDate set");
    }
}

class TV{
    String Name;
    String Brand;
    double Price;
    String Weight;
    String Size;
    String Resolution;
    Boolean Support3D;
    String Region;

    TV(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("TV "+ name + " initiated");
    }

    public void SetBrand()
    {
        System.out.println("TV brand set");
    }
    public void SetRegion()
    {
        System.out.println("TV region set");
    }
    public void SetResolution()
    {
        System.out.println("TV Resolution set");
    }
}

class Game{
    String Name;
    String Publisher;
    double Price;
    String DriverType;
    String AgeRestriction;
    String PublishDate;
    Boolean display3D;
    Boolean OnlineCorp;
    Game(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("TV "+ name + " initiated");
    }

    public void SetPublisher()
    {
        System.out.println("Game Publisher set");
    }
    public void SetDriverType()
    {
        System.out.println("Game DriverType set");
    }
    public void SetAgeRestriction()
    {
        System.out.println("Game AgeRestriction set");
    }
}

class Book{
    String Name;
    String Publisher;
    double Price;
    String Writer;
    String Pages;
    Boolean IsPDF;
    String Region;
    String Abstraction;
    Book(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("book "+ name + " initiated");
    }

    public void SetPublisher()
    {
        System.out.println("book Publisher set");
    }
    public void SetWriter()
    {
        System.out.println("book Writer set");
    }
    public void SetAbstraction()
    {
        System.out.println("book Abstraction set");
    }
}

class Speaker{
    String Name;
    String brand;
    double Price;
    String SpeakersNum;
    boolean NoiseDeduction;
    boolean IsPortable;
    String Electricity;
    String Material;
    Speaker(String name, double price)
    {
        Name = name;
        Price=price;
        System.out.println("Speaker "+ name + " initiated");
    }

    public void SetBrand()
    {
        System.out.println("Speaker brand set");
    }
    public void SetNoiseDeduction()
    {
        System.out.println("speaker NoiseDeduction set");
    }
    public void SetMaterial()
    {
        System.out.println("speaker Material set");
    }
}

public class Exercise0
{


    public static void main(String[] args)
    {
        car NormalCarBuyer = new car(); //first new class declare
        NormalCarBuyer.setCarcolor();// use method to set property
        car CustomizedCarbuyer = new car("test",456); //secondary new class declare and input value for constructor
        car.LuxuryCar LuxuryCarBuyer = new car.LuxuryCar();// Static nested class initiate
        LuxuryCarBuyer.initiateLuxuryCar(); // call method of static nested class

        System.out.println();
        //Normal class
        Beer Budlite = new Beer("Budlite",2.99);
        Beer Corona = new Beer("Corona", 3.99);
        Beer Qindao = new Beer("Qindao", 4.99);
        System.out.println();
        Book Annabel=new Book("Annabel",29.99);
        Book Ash=new Book("Ash",25.99);
        Book Autumn=new Book("Autumn",19.58);
        System.out.println();
        Computers LenovoT440= new Computers("LenovoT440",599.99);
        Computers DellPrecision= new Computers("DellPrecision",999.99);
        Computers WindowsSurface= new Computers("WindowsSurface",299.99);
        System.out.println();
        Furniture Chair= new Furniture("Chair",15.99);
        Furniture Table= new Furniture("Table",29.99);
        Furniture Bed= new Furniture("Bed",399.99);
        System.out.println();
        Game CSGo= new Game("CsGo",0.00);
        Game SurvivingMars= new Game("SurvivingMars",19.99);
        Game Sniper = new Game("Sniper",49.99);
        System.out.println();
        Milk Alexandre= new Milk("Alexandre",5.99);
        Milk Binggrae= new Milk("Binggrae",4.99);
        Milk Oatly= new Milk("Oatly",4.99);
        System.out.println();
        Snacks Haitai= new Snacks("Haitai",1.79);
        Snacks GreenPean= new Snacks("GreenPean",1.99);
        Snacks BeefJerky= new Snacks("BeefJerky",15.99);
        System.out.println();
        Speaker MarshallStanmore= new Speaker("MarshallStanmore",350.00);
        Speaker BossSoundLink= new Speaker("BossSoundLink",139.00);
        Speaker Muzen= new Speaker("Muzen",75.00);
        System.out.println();
        TV LG77= new TV("LG-77",2999.99);
        TV Samsung40= new TV("Samsung40",248.00);
        TV SonyBravia= new TV("SonyBravia",8998.00);





    }
}