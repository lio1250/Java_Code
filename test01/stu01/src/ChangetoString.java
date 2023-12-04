public class ChangetoString {
    public static  void main(String[] args){
        int num1=88;
        int num2=99;
        int num3=num1+num2;
        //输出int类型转换前的和
        System.out.println("转换前num1+num2="+num3);

        //int转换成String
        String s1=Integer.toString(num1);
        String s2=Integer.toString(num2);
        String s3=s1+s2;
        System.out.println("s1="+s1+",s2="+s2);
        System.out.println("s3="+s3);

        double num4=88.0;
        double num5=99.0;
        double num6=num4+num5;
        //输出double类型转换前的和
        System.out.println("转换前num4+num5="+num6);

        //double转换成String
        String s4=Double.toString(num4);
        String s5=Double.toString(num5);
        String s6=s4+s5;
        System.out.println("s4="+s4+",s5="+s5);
        System.out.println("s6="+s6);

        float num7=88;
        float num8=99;
        float num9=num7+num8;
        //输出double类型转换前的和
        System.out.println("转换前num7+num8="+num9);

        //float转换成String
        String s7=Float.toString(num7);
        String s8=Float.toString(num8);
        String s9=s7+s8;
        System.out.println("s7="+s7+",s8="+s8);
        System.out.println("s9="+s9);
    }
}
