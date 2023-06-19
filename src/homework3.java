
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;

public class homework3 {
    public static void main(String[] args) {
    ArrayList<Integer> ready = createRandomArray();
    System.out.println(ready.toString());
    deleteEven(ready);
    System.out.println(ready.toString());
    System.out.println(Collections.min(ready));
    System.out.println(Collections.max(ready));
    average(ready);
    System.out.println(ready.toString());
        }

    public static void average(ArrayList<Integer> ready) {
        int sum = 0;
        for (int item: ready) {
            sum += item;
        }
        double avg = sum/ready.size();
    }

        public static void deleteEven(ArrayList<Integer> ready) {
        ListIterator<Integer> iterator = ready.listIterator(0);
        while(iterator.hasNext()) {
            if(iterator.next()%2==0) {
                iterator.remove();
            }
        }
        }
        public static ArrayList<Integer> createRandomArray () {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i<20; i++) {
                arrayList.add(new Random().nextInt(-100, 100));
            }
            return (arrayList);
    }
}