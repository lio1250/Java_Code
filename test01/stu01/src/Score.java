import java.io.*;
public class Score {
    public static void main(String args[] )throws Exception{
        float score;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("请输入成绩：");
        String s = br.readLine();
        score =Float.parseFloat(s);
        System.out.println("\n成绩为:"+score+"分");
        if (score>=60)
            System.out.println("恭喜你，通过考试了！");
        else
            System.out.println("很遗憾，考试成绩不及格！");
    }
}
