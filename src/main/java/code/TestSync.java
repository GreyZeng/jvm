package code;

// 观察synchronized的字节码
public class TestSync {
    synchronized void m() {

    }

    void n() {
        synchronized (this) {

        }
    }

    void k() {
        synchronized (TestSync.class) {

        }
    }

    public static void main(String[] args) {

    }
}
