public class StringChangeTo {
    public static void main(String[] args) {
        String str1 = "125";
        String str2 = "85";
        String str3 = str1 + str2;
        //转化前输出
        System.out.println("字符串转化前的输出：str1+str2=" + str3);

        //字符串转换为整型int进行求和
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = a + b;
        System.out.println("字符串转换成int类型后的输出：a+b=" + c);

        //字符串转换成float进行求和
        float a1=Float.parseFloat(str1);
        float b1=Float.parseFloat(str2);
        float c1=a1+b1;
        //转换为float后输出
        System.out.println("字符串转化成float类型后的输出：a1+b1=" + c1);

        //字符串转换成double进行求和
        double a2=Double.parseDouble(str1);
        double b2=Double.parseDouble(str2);
        double c2=a2+b2;
        //转换为double后输出
        System.out.println("字符串转化成double类型后的输出：a2+b2=" + c2);
    }
}
