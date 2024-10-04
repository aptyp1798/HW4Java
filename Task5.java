import java.util.Deque;
import java.util.LinkedList;
class DeqTasks {
    public static void removeAllOccurrences(Deque<String> deque, String value) {
        LinkedList<String> remove = new LinkedList<>();
        for (String s : deque) {
            if (value.equals(s)) {
                remove.add(s);
            }
        }
        deque.removeAll(remove);
//        deque.removeIf(element -> element.equals(value)); тоже самое, но короче
        System.out.println(deque);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task5 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        String value;
        if (args.length < 2) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            deque.add("apple");
            deque.add("banana");
            deque.add("apple");
            deque.add("cherry");
            value = "apple";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(args[i]);
            }
            value = args[args.length - 1];
        }
        DeqTasks.removeAllOccurrences(deque, value);
    }
}