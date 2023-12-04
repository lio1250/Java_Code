
import java.util.Scanner;
public class Grade {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        int score=scanner.nextInt();
        System.out.println("\n成绩为："+score+"分");
        if (score>=90){
            System.out.println("等级：优秀");
        }else if (score>=80){
            System.out.println("等级：良好");
        }else if (score>=70){
            System.out.println("等级：中等");
        }else if (score>=60){
            System.out.println("等级：及格");
        }else {
            System.out.println("等级：不及格");
        }
    }
}
