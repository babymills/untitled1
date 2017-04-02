/**
 * Created by PK on 26.03.2017.
 */
public class getLinNumb {
    public static void main(String[] args) throws Exception {
        method1();
        System.out.println(method1());
    }

    public static int method1() {

        return  /*напишите тут ваш код*/Thread.currentThread().getStackTrace()[2].getLineNumber() ;
    }}
