package mao;

import java.util.function.Supplier;

/**
 * Project name(项目名称)：JDK8_method_reference
 * Package(包名): mao
 * Class(类名): Test7
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/23
 * Time(创建时间)： 15:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test7
{
    public static void main(String[] args)
    {
        Supplier<Test7> supplier = Test7::new;
        supplier.get().hello();
    }

    public void hello()
    {
        System.out.println("hello!");
    }
}
