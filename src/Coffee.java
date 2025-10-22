public class Coffee {
    // properties
    private int temp;
    private int conc;

    // constructor   (init)
    Coffee(int t, int c) {
        temp = t;   // temperature
        conc = c;   // concentration
    }

    // getters
    int getTemp() {
        return temp;
    }

    int getConc() {
        return conc;
    }

    @Override
    public String toString() {
        return "[coffee temperature = " + temp +
                ": concentration = "    + conc +
                "]";
    }
}
