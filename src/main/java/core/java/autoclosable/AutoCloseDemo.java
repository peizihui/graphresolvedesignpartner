package core.java.autoclosable;

/**
 * @ClassName AutoCloseTest
 * @description: 自定义自动关闭类；
 * @author: peiwisdom
 * @create: 2020-09-10 17:49
 **/
public class AutoCloseDemo implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("关闭");
    }
    public void run(boolean flag) {
        if (flag) {
            System.out.println("业务处理");
        } else {
            System.out.println("出现异常");
            throw new RuntimeException("自定义RuntimeException");
        }
    }
}
