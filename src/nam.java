import java.util.Scanner;

/**
 * Created by PK on 11.03.2017.
 */
public class nam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
       if (a>=1 && a<=999){
           System.out.println(( a%2==0 ? "" : "не")+ "четное" +(a>99 ? " трех" : a>10?" двух":" одно")+" значное число");
       }

    }
}
