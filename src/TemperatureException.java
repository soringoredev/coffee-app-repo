public class TemperatureException extends Exception {
    //props
    int t;

    // constructor

    public TemperatureException(int t, String msg) {
        super(msg);
        this.t = t;
    }

    // getter

    public int getT() {
        return t;
    }
}
