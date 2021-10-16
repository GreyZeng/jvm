package git.snippets.jvm.execute;

import java.io.IOException;

public class Test {
    static  boolean flag = true;
    // -Xint选项
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start");
                while (flag) {

                }
                System.out.println("end");
            }
        }).start();
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;
        System.in.read();
    }
}
