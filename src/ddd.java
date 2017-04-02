import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by PK on 22.03.2017.
 */
public class ddd {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш код
            double d = weight / (height * height);
            System.out.println(d<18.5 ? "Недовес: меньше чем 18.5" : d < 24.9 ? "Недовес: меньше чем 18.5" : d<29.9 ? "Избыточный вес: между 25 и 29.9" : "Ожирение: 30 или больше");
        }
    }
}


