import Java_Lang.Str;
import Java_Lang.Stri;
import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by PK on 22.03.2017.
 */
public class vcfg {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)list.add(reader.readLine());
        int size = list.get(0).length();
        for (int i = 1; i < 10; i++){
            if(list.get(i).length()>=size)
                size=list.get(i).length();
            else System.out.println(i);
        }
            // min = (list.get(x).length() < list.get(min).length() ? x : min) ;
    //  max = (list.get(x).length() > list.get(max).length() ? x : max) ;

        /*}
        min = list.get(0).length();
        max = list.get(0).length();
        for(int x1 = 0 ; x1<10;x1++){
            if(list.get(x1).length()<min){
                min = x1;
            }if(list.get(x1).length()>max){
                max = x1;
            }*/
        }}
       // System.out.println(min<max ? list.get(min): list.get(max));

