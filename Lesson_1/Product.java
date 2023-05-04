public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(){
        this("Продукт");
    }

    public Product(String name) {
        this(name, 1);
    }

    public Product(String name, double price) {
        this(name,"No Name",price );
        this.name = name;
        this.price = price;
    }

    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    /**
     *
     * Получить информацию по продукту
     */
    String DisplayInfo(){
        return String.format("%s - %s - %f", name, brand, price);
    }
}
