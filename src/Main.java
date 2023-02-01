import java.util.Arrays;

public class Main {
    public static void main(String[] Args) {


        MagicBox<String> sMagicBox = new MagicBox<String>(String.class, 4);
        MagicBox<Integer> intMagicBox = new MagicBox<Integer>(Integer.class, 3);
        sMagicBox.addItem("Biden");
        sMagicBox.addItem("Tramp");
        sMagicBox.addItem("Obama");
        intMagicBox.addItem(1977);
        intMagicBox.addItem(1981);
        intMagicBox.addItem(1996);


        System.out.println(sMagicBox.getItem(1));
        sMagicBox.pick();
        intMagicBox.pick();

    }
}
