public class Main {
    public static void main(String[] args) {
        Burger burger = new ClassicBurger();
        System.out.println("Your order: Burger, " + burger.cost());
        Burger burgerWithCola = new ColaDecorator(burger);
        System.out.println("Burger with cola(+450) : " + burgerWithCola.cost());
        Burger burgerWithColaWithCotlete = new CutletDecorator(new ColaDecorator(burger));
        System.out.println("Burger with cola(+450) and additional cotlete(+800): " + burgerWithColaWithCotlete.cost());
        Burger burgerWithColaWithCheese = new CheeseDecorator(new ColaDecorator(burger));
        System.out.println("Cheeseburger(+500 for cheese) with cola(+450): " + burgerWithColaWithCheese.cost());
    }
}