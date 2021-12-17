class Speaker{
    String name;
    String brand;
    double price;
    String speakersNum;
    boolean noiseDeduction;
    boolean isPortable;
    String electricity;
    String material;
    Speaker(String name, double price)
    {
        name = name;
        price=price;
        System.out.println("Speaker "+ name + " initiated");
    }

    public void setBrand()
    {
        System.out.println("Speaker brand set");
    }
    public void setNoiseDeduction()
    {
        System.out.println("speaker NoiseDeduction set");
    }
    public void setMaterial()
    {
        System.out.println("speaker Material set");
    }
}