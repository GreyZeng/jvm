package code;

import java.util.ArrayList;
import java.util.List;

/**
 * JConsole 监控代码示例
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/30
 * @since 11
 */
public class JConsoleTest {
    public static void main(String[] args) throws Exception {
        fillHeap(1000);
    }

    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    private static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }
}
