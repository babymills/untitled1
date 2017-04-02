import Java_Lang.Stri;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by PK on 01.03.2017.
 */
public class ChyslaVampir {

    void  vv(){
        for (int p=10;p<100;p++){
        for (int b=10;b<100;b++){
       int y = p*b;
            //число s преобразовываем в строку, затем записываем в массив символов
            char r[]  = (new Integer(y).toString().toCharArray());
            Arrays.sort(r);
            //так само поступаем с каждым множителем
            String x = (new Integer(p).toString());
            String x1 = (new Integer(b).toString());
            //конкатенация строк (чисел-множителей)
            String z = x+x1;
            //запись строки в массив символов
            char r1[] = z.toCharArray();
            Arrays.sort(r1);//сортировка массива символов
            //сравнение массивов символов
            if(Arrays.equals(r,r1)){
                System.out.println(p +" * " +b +" = " + y);
            }

        }
    }}
    public static void main(String[] args) {
        ChyslaVampir i = new ChyslaVampir();
        i.vv();
    }
}
