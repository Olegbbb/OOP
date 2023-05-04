public class Chips extends Product {

    private int weight;

    public Chips(String name, double price,int weight){
        super(name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }



    @Override
    String DisplayInfo() {
        return String.format("%s - %s - %f - Vol: %d", name, brand, price, weight);
    }
}
