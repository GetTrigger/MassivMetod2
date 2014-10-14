/**
 * Created by Devil Trigger S on 14.10.2014.
 */
public class MasMet2 {
    public static void main(String[] args) {
        String[] names = {"Павел", "Иван", "Сергей", "Александр", "Елена", "Юлия", "Ирина"};
        String[] greetings = new String[names.length];
        MyFanction(names, greetings);
        for (int i = 0; i < greetings.length; i++) System.out.println(greetings[i]);
    }

    public static void MyFanction(String[] N, String[] Gr) {
        for (int i = 0; i < N.length; i++)
            Gr[i] = "Привет " + N[i];
    }
}
