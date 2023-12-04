package kesheshiyan01;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class jiemian1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("用户登录界面");
        frame.setBounds(200,200,300,200);
        frame.setLayout(new GridLayout(3,1));

        JPanel panel1 =new JPanel();
        JLabel lb1 =new JLabel("用户名");
        JTextField tf1=new JTextField(15);
        panel1.add(lb1);
        panel1.add(tf1);
        frame.add(panel1);

        JPanel panel2=new JPanel();
        JLabel lb2=new JLabel("密码：");
        JPasswordField pf=new JPasswordField(15);
        pf.setEchoChar('*');
        panel2.add(lb2);
        panel2.add(pf);
        frame.add(panel2);
        JPanel panel3=new JPanel();
        JButton btn1=new JButton("登录");
        JButton btn2=new JButton("注册");
        panel3.add(btn1);
        panel3.add(btn2);
        frame.add(panel3);
        //3.设置窗口可见性和默认关闭方式（退出应用程序）
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=tf1.getText();
                String password=pf.getUIClassID();
                tf1.setText("");
                pf.setText("");
                try {
                    jdbcout(username,password);
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                pf.setText("");
                //    new zhuceframe();
            }
        });
    }

    public static void jdbcout(String str1,String str2)throws ClassNotFoundException, SQLException{
        //1、加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException cnf){
            System.out.println("SQLException:"+cnf.getMessage());
        }


        try {
            //2、创建数据库连接
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/keshe","root","123");
            //3、获取执行SQL语句的对象(利用Connection对象生成Statement对象)
            Statement stmt = con.createStatement();
            //4、数据查询
            String sql="select * from yonghuzhangmi where UserName='"+str1+"'";
            ResultSet rs = stmt.executeQuery(sql);
//            if (rs.next()){
//                if (rs.getString("password").equals(str2)){
//                    new Start();
//                }else {
//                    new dialogyminaNO();
//                }
//            }
            //
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            rs.close();
            stmt.close();
            con.close();
        }

    }
}
