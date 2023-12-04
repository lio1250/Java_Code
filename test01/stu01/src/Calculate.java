import javax.swing.*;

public class Calculate {
    public static void main(String args[]){
        double x,y;
        String s= JOptionPane.showInputDialog("请输入x的值：");
        x=Double.parseDouble(s);

        if ((x>=-10)&&(x<=10)){
            y=x*x-1;
        }else {
            y=5*x+3;
        }

        JOptionPane.showMessageDialog(null,"x="+x+'\n'+"函数值为："+y);
    }
}
