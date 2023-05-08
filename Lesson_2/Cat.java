public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public void eat(int food) {
        if(food >= this.appetite){
            this.satiety = true;
            System.out.printf("Кот %s сыт\n", name);
        }
        else {
            System.out.printf("Кот %s остался голодным\n", name);
        }

    }

    public int getAppetite() {
        return appetite;
    }
}
