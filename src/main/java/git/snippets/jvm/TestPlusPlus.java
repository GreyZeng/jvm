package git.snippets.jvm;

// 注意查看字节码解释
public class TestPlusPlus {
    public static void main(String[] args) {
        int a = 8;
        //i = (i++);
        a = ++a;
        System.out.println(a);
        //System.out.println(i);
    }
}
