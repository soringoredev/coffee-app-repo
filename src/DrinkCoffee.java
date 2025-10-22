public class DrinkCoffee {

    void drinkCoffee (Coffee coffee) throws ConcentrationException, TemperatureException {

        // if for temp
        if(coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Cafeaua e prea fierbinte. O aruncam!");
        }

        // if for conc
        else if (coffee.getConc() > 55) {
            throw new ConcentrationException(coffee.getConc(), "Concentratia cafelei e prea mare. O aruncam!");
        } else {
            System.out.println("Serviti cafeaua!");
        }
    }

}