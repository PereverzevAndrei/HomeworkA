import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    int capacity;
    T[] magicBox;
    public T item;

    public MagicBox(Class<T> dataType, int capacity) {
        this.magicBox = (T[]) java.lang.reflect.Array.newInstance(dataType, capacity);
        this.capacity = capacity;
    }

    public boolean addItem(T item) {
        for (int i = 0; i < capacity; i++) {
            if (magicBox[i] == null) {
                magicBox[i] = (T) item;
                return true;
            }
        }
        return false;
    }

    public T getItem(int i) {
        return magicBox[i];
    }

    public void pick() {
        int randomInt;
        for (int i = 0; i < capacity; i++) {
            if (magicBox[i] == null) {
                System.out.println("Коробка не полна, осталось заполнить " + (capacity - i) + " ячеек");
                return;
            }
        }
        Random random = new Random();
        randomInt = random.nextInt(capacity);
        System.out.println(magicBox[randomInt]);
    }

}