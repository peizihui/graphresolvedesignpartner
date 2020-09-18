package core.java.autoclosable;

import org.junit.Test;

/**
 * @ClassName AutoCloseDemoTest
 * @description: 自动关闭测试
 * @author: peiwisdom
 * @create: 2020-09-10 17:54
 **/
public class AutoCloseDemoTest {
    @Test
    public void test3() throws Exception {
        try (AutoCloseDemo autoCloseTestModel = new AutoCloseDemo()) {
            autoCloseTestModel.run(false);
        }
    }

}
