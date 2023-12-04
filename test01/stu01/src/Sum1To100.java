//计算1+2+3+4+...+100的值（用while语句来实现）
public class Sum1To100 {
    public static void main(String args[]){
        int i;
        int sum = 0;
        i=1;
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println("1+2+3+4+...+100="+sum);
    }
}
