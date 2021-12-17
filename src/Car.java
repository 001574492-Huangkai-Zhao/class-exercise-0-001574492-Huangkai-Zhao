class Car {
    String size;
    String windowType;
    static private int Carprice;  //static private varible can be called by static Nested class
    String windSheild;
    String salesAgentname;
    int enginetype;
    String color;
    String wheelType;

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
            salesAgentname = "Judy";
        }
    }
    //inner nested class declaration end.

    //use constructor to initiate an inner nested class
    Car(){
        salesinfo salesinfoset = new salesinfo();
        salesinfoset.setsalesinfo();
        System.out.println("inner class initiated by constructor " + "  salesAgentname set to " + salesAgentname );
    }

    //use constructor to initiate properties
    Car(String input_windsheild, int input_enginetype){
        this.windowType = input_windsheild;
        this.enginetype = input_enginetype;
        System.out.println("Car class initiated by constructor");
    }



    //Three class methods start:
    void setCarcolor() {
        System.out.println("carcolor initiated");
    }


    void setEnginetype() {
        System.out.println("enginetype initiated");
    }

    void setwheeltype() {
        System.out.println("wheelType initiated");

    }
    //Three class methods ends.
}
