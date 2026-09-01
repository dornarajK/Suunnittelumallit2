package AbstractFactory;

public class main {
    public static void main(String[] args) {
        UIFactory factory = new BFactory();
        Button button = factory.createButton("OK");
        TextField textField = factory.createTextField("Hello");
        Checkbox checkbox = factory.createCheckbox("Remember me");

        button.display();
        textField.display();
        checkbox.display();

    }
}