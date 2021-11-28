package code;

/**
 * 测试大对象直接进入老年代
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/28
 * @since 1.8
 */
public class PretunureTest {

    public static void main(String[] args) {
        byte[] a;
        a = new byte[4 * 1024 * 1024];
    }

}
