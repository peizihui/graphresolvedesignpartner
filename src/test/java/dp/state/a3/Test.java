package dp.state.a3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName Test
 * @description:
 * @author: peizihui
 * @create: 2020-09-10 17:29
 **/
public class Test {



@org.junit.Test
    public void test2() throws IOException {
        String filepath = "D:\\docs\\img\\aa.png";
        try (
                FileReader fileReader = new FileReader(filepath);
                BufferedReader br = new BufferedReader(fileReader)
        ){
            String curline = null;
            while ((curline = br.readLine()) != null) {
                System.out.println(curline);
            }
        }
    }
    // FileReader 和 BufferedReader 均实现了 AutoCloseable 接口
}
