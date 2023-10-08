abstract public class BurgerDecorator implements Burger{
    protected Burger burger;
    public BurgerDecorator(Burger burger){
        this.burger = burger;
    }

    @Override
    public int cost() {
        return burger.cost();
    }
}
