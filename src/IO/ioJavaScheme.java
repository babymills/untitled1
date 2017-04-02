package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by привет on 28.03.2016.
 */
public class ioJavaScheme {
    public static void main(String[] args) {
        try {
            // создание потокового объекта (открытие потока)
            FileWriter out = new FileWriter("C://idea//ioSchem.txt");
            // придание потоковому объекту требуемых свойств
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in a text-file.");
            // закрытие потока
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

