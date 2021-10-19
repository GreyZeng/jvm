package code;

import java.util.LinkedList;
import java.util.List;

public class HelloGC {
    public static void main(String[] args) {
        System.out.println("HelloGC!");
        List<byte[]> list = new LinkedList<>();
        for (; ; ) {
            byte[] b = new byte[1024 * 1024];
            list.add(b);
        }
    }
}
