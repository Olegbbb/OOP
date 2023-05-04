public class BottleOfWater extends Product{
    private int volume;

    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    String DisplayInfo() {
        return String.format("%s - %s - %f - Vol: %d", name, brand, price, volume);
    }
}
