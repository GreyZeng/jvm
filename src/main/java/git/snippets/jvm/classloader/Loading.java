package git.snippets.jvm.classloader;

public class Loading {
    public static void main(String[] args) {
        System.out.println(T.count);
    }
}

class T {
    // 以下两行掉换位置结果不一样
    public static T t = new T();
    public static int count = 2;

    private T() {
        count++;
    }
}
