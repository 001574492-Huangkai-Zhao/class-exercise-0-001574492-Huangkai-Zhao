class Computer{
    String name;
    String brand;
    double price;
    String weight;
    String CPUType;
    String GPUType;
    String ramSize;
    boolean TouchScreen;
    Computer(String name, double price)
    {
        name = name;
        price=price;
        System.out.println("Computer "+ name + " initiated");
    }
    public void setCPUType()
    {
        System.out.println("Computer CPUType set");
    }
    public void setGPUType()
    {
        System.out.println("Computer GPUType set");
    }
    public void setRamSize()
    {
        System.out.println("Computer RamSize set");
    }
}
