import java.util.LinkedList;
class LLTasks {
    public static void removeOddLengthStrings(LinkedList<String> ll) {
        LinkedList<String> remove = new LinkedList<>();
        for (String i : ll) {
            if (i.length() % 2 == 1) {
                remove.add(i);
            }
        }
        ll.removeAll(remove);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg : args) {
                ll.add(arg);
            }
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}
