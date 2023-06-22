public class Main {
    public static void main(String[] args) {

        String data = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петров\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] data1 = data.replace("\"", "").replace(":", "").replace("предмет", "").replace("оценка", "").replace("фамилия", "").replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("{", "").replace("\\s", " ").split(",");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < (data1.length) - 2; i++) {
            builder = builder.append(" Студент " + data1[i]).append(" получил " + data1[i + 1]).append(" по предмету " + data1[i + 2] + "\n");
        }
        System.out.println(builder);
    }
}