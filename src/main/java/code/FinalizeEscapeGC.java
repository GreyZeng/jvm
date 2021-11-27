package code;

/**
 * 对象可以在GC时进行自我拯救
 * 这种自救的机会只有一次
 * 因为一个对象的finalize()方法最多只会被系统调用一次
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/27
 * @since
 */
public class FinalizeEscapeGC {
    static FinalizeEscapeGC SAVE_HOOK = null;

    void isAlive() {
        System.out.println("i am alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("I am dead");
        }
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("I am dead");
        }
    }
}
