public class ConcentrationException extends Exception {
    // props
    int c;

    // constructor

    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }

    // getter

    public int getC() {
        return c;
    }
}
