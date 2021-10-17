package git.snippets.jvm;

public class WhoIsMyClassLoader {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(WhoIsMyClassLoader.class.getClassLoader());
    }
    static void whoIsMyClassLoader(Object o) {

    }
}
