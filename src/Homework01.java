import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr1 = {};

        Double res = a01.max(arr1);
        if ( res != null ) { // 不是空数组（数组长度为零的话，下面的arr[0]就无法访问了）
                                        // 真的有最大值，也就是不是空数组
//res！= null 是说 arr1不仅有最大值 而且 arr1不为null .一下子把两个异常都控制住了
            System.out.println("arr max " + a01.max(arr1));
        }
        else {
            System.out.println(" arr cannot be null ");
        }
    }
}
    class A01 {
        public Double max(double[] arr) {
            // 包装类

            if (arr != null  && arr.length > 0) {
                //arr.length > 0 不可以，万一arr=null就完了。。就成了null.length 估计会报 nopointer了。。。
                double max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                return max;
            } else {
                return null;
                // 不改成Doulble包装类保持double的话，就无法返回null
            }
        }
    }
