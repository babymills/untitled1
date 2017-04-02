import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.XMLFormatter;

/**
 * Created by PK on 09.03.2017.
 */
public class jj {
    public static void main(String[] args) throws IOException {
        //int p = x % 4 == 0 ? c1 : c;
        Scanner scanner = new Scanner(System.in);
        int x  = scanner.nextInt();
        int c = 365;
        int ccc =    17%100;
        System.out.println(ccc);
        if (x%4 == 0 && !(x%100 == 0 && x%400 != 0)) {
            int c1 = 366;
            System.out.println("количество дней в году: "+ c1);
        }else
            System.out.println("количество дней в году: " +c);

    }
    }

