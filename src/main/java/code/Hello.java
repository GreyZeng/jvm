package code;

public class Hello {
    public static void main(String[] args) {
        I i = C::x;
        I i2 = C::x;
        i.m();
        i2.m();
        System.out.println(i.getClass());
    }

    @FunctionalInterface
    public interface I {
        void m();
    }
    public static class C {
         static void x() {
            System.out.println("Hello");
        }
    }
}
