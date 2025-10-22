public class CoffeeTest {
    public static void main(String[] args) {

        CoffeeMaker mk = new CoffeeMaker();
        DrinkCoffee d  = new DrinkCoffee();

        for (int i = 0; i < 10; i++) {
            Coffee coffee = mk.makeCoffee();
            System.out.println(" -------------- ");
            System.out.println(" -------------- ");
            try {
                d.drinkCoffee(coffee);
            } catch (TemperatureException e) {
                System.out.println("Exception: " + e.getMessage() + "\ntemp: " + e.getT());

            } catch (ConcentrationException e) {
                System.out.println("Exception: " + e.getMessage() + "\nconc: " + e.getC());
            }
            finally {
                System.out.println("Throw the coffee");
            }

        }

    }
}
