import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
public class PersonalTax {
    public static void main(String args[] )throws Exception{
        float salary;
        InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(in);
        System.out.println("请输入您的月工资（单位：元）：");
        String s = br.readLine();
        salary =Float.parseFloat(s);
        System.out.println();
        System.out.println("您的月工资为："+salary+"元");
        if (salary>1600)
            System.out.println("根据税法，您应该交纳个人所得税。");
    }
}
