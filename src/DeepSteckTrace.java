/**
 * Created by PK on 26.03.2017.
 */
public class DeepSteckTrace {
    //Thread.currentThread().getStackTrace();
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement[]stackTraceElements = Thread.currentThread().getStackTrace();

        System.out.println(stackTraceElements.length);
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }

        return stackTraceElements.length;
    }
}