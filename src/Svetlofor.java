import java.util.ArrayList;
import java.util.Scanner;

import static les22_11.file1.a;

/**
 * Created by PK on 09.03.2017.
 */
public class Svetlofor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for(int z= 0 ;z<10;z++){
        arrayList.add(scanner.nextDouble());
                double x = arrayList.get(z);
                System.out.println(x%5<3?"green":x%5<4?"yellow":"red");
            } }
        }
