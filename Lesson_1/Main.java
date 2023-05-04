import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product chips1 = new Chips("Соль", 42.8, 200);
        Product chips2 = new Chips("Лук", 45.5, 300);
        Product chips3 = new Chips("Лук", 80, 600);
        Product chips4 = new Chips("Сметана", 54.2, 300);
        Product chips5 = new Chips("Паприка", 60, 300);


        List<Product>products = new ArrayList<>();

        products.add(chips1);
        products.add(chips2);
        products.add(chips3);
        products.add(chips4);
        products.add(chips5);

        VendingMachine machine = new VendingMachine(products);

        Chips myChips = machine.getChips("Лук", 50, 300);

        if(myChips != null){
            System.out.println("Вы купили: ");
            System.out.println(myChips.DisplayInfo());
        }
        else System.out.println("Такой упаковки чипсов нет");
    }
}
