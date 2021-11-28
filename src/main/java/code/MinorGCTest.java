package code;

/**
 * 测试GC
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/28
 * @since 1.8
 */
public class MinorGCTest {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testAllocation();
    }

    // -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
    public static void testAllocation() {
        byte[] a1, a2, a3, a4;
        a1 = new byte[2 * _1MB];
        a1 = new byte[2 * _1MB];
        a1 = new byte[2 * _1MB];
        a1 = new byte[4 * _1MB];
    }
}
