package decorator;

public class EncryptedPrinter extends printerDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encrypted = encrypt(message);
        printer.print(encrypted);
    }

    private String encrypt(String message) {
        StringBuilder result = new StringBuilder();

        for (char c : message.toCharArray()) {
            result.append((char) (c + 3));
        }

        return result.toString();
    }

}
