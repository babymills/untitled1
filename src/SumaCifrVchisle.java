/**
 * Created by PK on 01.03.2017.
 */
public class SumaCifrVchisle {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(1314));
    }


    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int k = 0;
        String s = String.valueOf(number);
        for (int i = 0; i < s.length(); i++){
            k += Character.digit(s.charAt(i),10);
        }
        return k;
    }
}
