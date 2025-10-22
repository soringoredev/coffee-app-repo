public class ConcentartionException extends Exception {
    // props
    int c;

    // constructor

    public ConcentartionException(int c, String msg) {
        super(msg);
        this.c = c;
    }

    // getter

    public int getC() {

        return c;
    }
}
