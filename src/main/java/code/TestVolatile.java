package code;

// 观察volatile的字节码
public class TestVolatile {
    private int i;
    volatile int j;

    public static void main(String[] args) {
        short[] arr = {1, 2};
        System.out.println(arr.getClass());
    }
}
