import java.lang.reflect.Array;
import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public Product getBottleOfWater(String name, int volume){
        for (Product product : products){
            if(product instanceof BottleOfWater){
               if(product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                   return product;
               }
            }
        }
        return null;
    }

    public Chips getChips(String name,double price, int weight){
        for (Product product : products){
            if(product instanceof Chips){
                if (product.getName() == name && ((Chips)product).getWeight() == weight && product.getPrice() <= price){
                    return (Chips)product;
                }
            }
        }
        return null;
    }
}
