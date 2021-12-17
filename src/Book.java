class Book{
    String name;
    String publisher;
    double price;
    String writer;
    String pages;
    Boolean isPDF;
    String region;
    String abstraction;
    Book(String name, double price)
    {
        name = name;
        price=price;
        System.out.println("book "+ name + " initiated");
    }

    public void setPublisher()
    {
        System.out.println("book Publisher set");
    }
    public void setWriter()
    {
        System.out.println("book Writer set");
    }
    public void setAbstraction()
    {
        System.out.println("book Abstraction set");
    }
}