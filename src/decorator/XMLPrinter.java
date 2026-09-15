package decorator;

public class XMLPrinter extends printerDecorator {

    public XMLPrinter (Printer printer){
        super(printer);
    }

    @Override
    public void print(String message) {
        printer.print("<message>" + message + "</message>");
    }

}
