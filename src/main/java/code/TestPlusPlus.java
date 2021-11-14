package code;

// 注意查看字节码解释
public class TestPlusPlus {
    public static void main(String[] args) {
        int i = 8;
        i = ++i;
        //i = ++i;
        System.out.println(i);
        //System.out.println(i);
    }
}
