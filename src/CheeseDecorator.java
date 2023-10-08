public class CheeseDecorator extends BurgerDecorator{
    public CheeseDecorator(Burger burger){
        super(burger);
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}
