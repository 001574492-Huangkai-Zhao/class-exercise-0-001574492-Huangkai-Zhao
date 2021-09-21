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

public class Exercise0
{


    public static void main(String[] args)
    {
        car NormalCarBuyer = new car(); //first new class declare
        NormalCarBuyer.setCarcolor();// use method to set property

        car CustomizedCarbuyer = new car("test",456); //secondary new class declare and input value for constructor


        car.LuxuryCar LuxuryCarBuyer = new car.LuxuryCar();// Static nested class initiate
        LuxuryCarBuyer.initiateLuxuryCar(); // call method of static nested class


    }
}

