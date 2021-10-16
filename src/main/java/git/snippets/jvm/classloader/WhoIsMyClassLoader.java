package git.snippets.jvm.classloader;

public class WhoIsMyClassLoader {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(sun.awt.HKSCS.class.getClassLoader());
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        System.out.println(WhoIsMyClassLoader.class.getClassLoader());
    }
    static void whoIsMyClassLoader(Object o) {

    }
}
