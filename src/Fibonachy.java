import java.util.Scanner;

/**
 * Created by PK on 01.03.2017.
 */
public class Fibonachy {
    void cop (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numb");
        int x = scanner.nextInt();
        int n0 = 1, n1 = 1, n2;
        System.out.print(n0 + " " + n1);
        for (int c = 0; c < x; c++) {
            n2 = n0 + n1;
            System.out.print(" " + n2);
            n0 = n1;
            n1 = n2;
    }
    scanner.close();
    }
    public static void main(String[] args) throws Exception {
     Fibonachy v = new Fibonachy();
        v.cop();
        }
    }