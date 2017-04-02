import java.util.Scanner;

/**
 * Created by PK on 18.03.2017.
 */
public class Srednee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while(true){
            int c = scanner.nextInt();
            if(c==-1){
                break;
            }
            sum+=c;
            count++;
        }
        System.out.println(sum/count);
    }
}

