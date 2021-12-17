class Snacks{
    String name;
    String brand;
    double price;
    String weight;
    String ingredient;
    String nutrition;
    String fats;
    boolean GMO;

    Snacks(String name, double price)
    {
        name = name;
        price=price;
        System.out.println("Snack "+ name + " initiated");
    }

    public void setFats()
    {
        System.out.println("snack fats set");
    }
    public void setIngredient()
    {
        System.out.println("snack ingredient set");
    }
    public void setNutrition()
    {
        System.out.println("snack nutrition set");
    }
}
