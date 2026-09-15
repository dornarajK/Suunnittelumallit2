package decorator;

public abstract class printerDecorator implements Printer {
    protected Printer printer;

    public printerDecorator(Printer printer){
        this.printer= printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
}
