package Different;

/**
 * Created by PK on 05.03.2017.
 */
public class A2 {
    public static void main(String[] args) {
        A1 a1 = new A1(2,"Max");
        A1 a2 = new A1(2,"Max");

        A1 a3 = a1;
        System.out.println(a1==a2);
        System.out.println(a1==a3);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
    }
}
