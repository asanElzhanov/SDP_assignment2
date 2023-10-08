public class CutletDecorator extends BurgerDecorator {
    public CutletDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public int cost() {
        return super.cost() + 800;
    }
}
