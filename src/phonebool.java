import java.util.*;

public class phonebool {
    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        book.merge("Алла Нирн", "634196", (x, y) -> x == null ? y : x + " " + x);
        book.merge("Виктор Сысоев", "9849841", (x, y) -> x == null ? y : x + " " + x);
        book.merge("Виктор Сысоев", "1981961", (x, y) -> x == null ? y : x + " " + x);
        book.merge("Антон Звягин", "547964", (x, y) -> x == null ? y : x + " " + x);
        book.merge("Алла Нирн", "7340676", (x, y) -> x == null ? y : x + " " + x);

        System.out.println(book);
        for (String s : book.keySet()) {
            list.add(s);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return book.get(o1).split(" ").length - book.get(o2).split(" ").length;
            }
        });
        System.out.println(list);
    }
}
