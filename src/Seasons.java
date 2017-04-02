/**
 * Created by PK on 09.03.2017.
 */
public class Seasons {
    public static void main(String[] args) {
        checkInterval(1);
        checkInterval(5);
        checkInterval(9);
        checkInterval(12);
    }

    public static void checkInterval(int month) {
        //::CODE:
        String seasons[] = {"зима","весна","лето","осень"};
        System.out.println(seasons[(month % 12) / 3]);
    }
}
