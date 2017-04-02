import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by PK on 24.02.2017.
 */
public class dddddd {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(scanner.nextInt());
        arrayList.add(scanner.nextInt());
        arrayList.add(scanner.nextInt());
int a = 0;
int a1 = 0;
        for(int x:arrayList){
    if(x<0){
        a++;
    }else a1++;
}
        System.out.println("Отрицательных "+a);
        System.out.println("Положительных"+a1);
    }}

