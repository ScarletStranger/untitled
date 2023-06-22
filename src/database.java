import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class database {
    public static void main(String[] args) {
        String[] people;
        ArrayList<String[]> arrayList = new ArrayList<>();
        String encoding = System.getProperty("Console encoding", "utf-8");
        Scanner scanner = new Scanner(System.in, encoding);
        while (true) {
            System.out.println("+".repeat(30));
            System.out.println("Ввдеите строку в формете\nФамилия Имя Отчество Возраст Пол\nДля выхода введите пустую строку");
            people = GetArrayString(scanner.nextLine());
            if (people == null || people[0].equals(""))
                break;
            arrayList.add(people);
        }
        PrintArray(arrayList, 1);

        scanner.close();
    }

    public static void PrintArray(ArrayList<String[]> arrayList, int sortby) {
        arrayList.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int r = Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                return r * sortby;
            }
        });
        for (String[] people : arrayList) {
            System.out.println(people[0] + " " + people[1].charAt(0) + "." + " " + (people[2].charAt(0)) + "." + " " + people[3] + " " + people[4]);
        }
    }

    public static String[] GetArrayString(String str) {
        String[] result;
        result = str.strip().split(" ");
        if (result.length != 5) {
            return null;
        }
        return result;
    }
}
