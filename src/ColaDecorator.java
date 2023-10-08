public class ColaDecorator extends BurgerDecorator{
    public ColaDecorator(Burger burger){
        super(burger);
    }

    @Override
    public int cost() {
        return super.cost() + 450;
    }
}
