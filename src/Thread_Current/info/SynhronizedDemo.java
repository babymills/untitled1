package Thread_Current.info;

/**
 * Created by привет on 05.05.2016.
 */
 class SynhronizedDemo {
        void call(String msg) {
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("]");
        }
    }

    class Caller implements Runnable {
        String msg;
        SynhronizedDemo target;
        Thread t;

        public Caller(SynhronizedDemo targ, String s) {
            target = targ;
            msg = s;
            t = new Thread(this);
            t.start();
        }

        public void run() {
            target.call(msg);}
        }


    class Synch {
        public static void main(String args[]) {
            SynhronizedDemo target = new SynhronizedDemo();
            Caller ob1 = new Caller(target, "Hello");
            Caller ob2 = new Caller(target, "Synchronized");
            Caller ob3 = new Caller(target, "World");

            // wait for threads to end
            try {
                ob1.t.join();
                ob2.t.join();
                ob3.t.join();
            } catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
