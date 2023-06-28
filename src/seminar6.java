import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class seminar6 {
    public void main(String[] args) {
        SetMimic setMimic = new SetMimic();
        System.out.println(setMimic.add(9));
        System.out.println(setMimic.add(9));
        System.out.println(setMimic.add(10));
        System.out.println(setMimic.add(8));
        System.out.println(setMimic.size());
        System.out.println(setMimic.remove(8));
        System.out.println(setMimic.remove(9));
        System.out.println(setMimic.size());
        System.out.println(setMimic.isEmpty());
        System.out.println(setMimic.contains(9));
        System.out.println(setMimic.contains(10));
        for (int i = 0; i < 10; i++) {
            setMimic.add(new Random().nextInt(1000));
        }
        Iterator<Integer> iterator = setMimic.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println(setMimic.get(3));
        System.out.println(setMimic.get(5));
    }

    class SetMimic<E> {
        private HashMap<E, Object> map = new HashMap<>();
        private static final Object OBJ = new Object();

        public boolean add(E n) {
            return map.put(n, OBJ) == null;
        }

        public boolean remove(E n) {
            return map.remove(n, OBJ);
        }

        public int size() {
            return map.size();
        }

        public boolean isEmpty() {
            return map.isEmpty();
        }

        public boolean contains(Object n) {
            return map.containsKey(n);
        }

        public Iterator<E> iterator() {
            return map.keySet().iterator();
        }

        public E get(int index) {
            E[] mapArray = (E[]) map.keySet().toArray();
            return mapArray[index];
        }
    }
}