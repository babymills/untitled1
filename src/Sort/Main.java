package Sort;

/**
 * Created by Катя on 17.11.2015.
 */
public class Main {
    public static void sort(int[] data) {
        for (int barrier = data.length -1; barrier>=0;barrier--){
            for(int index = 0; index<barrier;index++) {
                if (data[index] > data[index+1]){
                    int tmp = data[index];
                    data[index] = data[index+1];
                    data[index+1] = tmp;
                }
            }
        }

    }
}