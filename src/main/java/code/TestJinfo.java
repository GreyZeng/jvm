package code;

/**
 * 运行如下程序
 * 然后使用: jps查看这个程序的pid
 * 用 jinfo -flag 【参数】 【pid】来查看相应配置参数的值
 * 例如：
 * 用 jinfo -flag CMSInitiatingOccupancyFraction 13804
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/11/30
 * @since 1.8
 */
public class TestJinfo {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(10000);
            System.out.println("hello");
        }
    }
}
