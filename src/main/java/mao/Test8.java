package mao;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Project name(项目名称)：JDK8_method_reference
 * Package(包名): mao
 * Class(类名): Test8
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/23
 * Time(创建时间)： 16:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test8
{
    public static void main(String[] args)
    {
        Function<Integer, String[]> fun = (len) ->
        {
            return new String[len];
        };
        String[] arr1 = fun.apply(10);
        System.out.println(Arrays.toString(arr1) + ", " + arr1.length);
        Function<Integer, String[]> fun2 = String[]::new;
        String[] arr2 = fun.apply(5);
        System.out.println(Arrays.toString(arr2) + ", " + arr2.length);
    }
}
