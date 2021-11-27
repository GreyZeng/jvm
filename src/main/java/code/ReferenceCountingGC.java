package code;

import java.io.IOException;

/**
 * 测试引用计数
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/27
 * @since
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[_1MB];

    public static void testGC() {
        ReferenceCountingGC obj1 = new ReferenceCountingGC();
        ReferenceCountingGC obj2 = new ReferenceCountingGC();
        obj1.instance = obj2;
        obj2.instance = obj1;


        obj1 = null;
        obj2 = null;

        System.gc();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testGC();
    }
}
