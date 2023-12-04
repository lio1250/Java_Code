//用多分支语句计算分段函数的值
import javax.swing.JOptionPane;
public class Calculate2 {
    public static void main(String args[]){
        double x,y;
        String s =JOptionPane.showInputDialog("请输入x的值：");
        x = Double.parseDouble(s);

        if (x<-5){
            y=-x;
        }else if (x<5){
            y = Math.sin(x);
        }else{
            y = Math.sin(-x);
        }
        JOptionPane.showMessageDialog(null,"x="+x+'\n'+"函数值："+y);
    }
}
