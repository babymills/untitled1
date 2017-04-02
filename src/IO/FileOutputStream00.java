package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pc on 18.01.2016.
 */
public class FileOutputStream00 {




    public static void main(String[] args) {
        try {
            // создание потокового объекта (открытие потока)
            FileWriter out = new FileWriter("text.txt");
            // придание потоковому объекту требуемых свойств
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in a text-file.");//запись и создание текстового файла
            // закрытие потока
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}