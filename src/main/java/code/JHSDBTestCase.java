package code;


/**
 * JHSDB 使用
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/30
 * @since 1.8
 */
public class JHSDBTestCase {
    public static void main(String[] args) {
        Test test = new JHSDBTestCase.Test();
        test.foo();

    }

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }

    private static class ObjectHolder {
        int a;
        long b;
        String c;
    }

}
