package code;

/**
 * 类初始化
 * 通过子类引用父类的静态字段，不会导致子类初始化
 * 通过数组定义来引用类，不会触发此类的初始化
 * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类初始化
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/30
 * @since 1.8
 */
public class InitTest extends Super {
    public static void main(String[] args) {
        System.out.println(Sub.value);
        Super[] supers = new Super[100];
        System.out.println(Const.HELLO);
    }
}

class Const {
    static final String HELLO = "HELLO";

    static {
        System.out.println("const");
    }

}

class Sub extends Super {
    static {
        System.out.println("sub");
    }
}

class Super {
    static {
        System.out.println("super");
    }

    public static int value = 123;
}
