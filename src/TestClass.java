public class TestClass
{
    public static void main(String[] args)
    {
        Car NormalCarBuyer = new Car(); //first new class declare
        NormalCarBuyer.setCarcolor();// use method to set property
        Car CustomizedCarbuyer = new Car("test",456); //secondary new class declare and input value for constructor
        Car.LuxuryCar LuxuryCarBuyer = new Car.LuxuryCar();// Static nested class initiate
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
        Computer LenovoT440= new Computer("LenovoT440",599.99);
        Computer DellPrecision= new Computer("DellPrecision",999.99);
        Computer WindowsSurface= new Computer("WindowsSurface",299.99);
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