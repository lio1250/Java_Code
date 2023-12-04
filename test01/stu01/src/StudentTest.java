public class StudentTest {
    static String name1="张三";//静态变量
    String name2="李四";//实例变量
    public static void main(String[] args){//静态方法
        System.out.println(name1);//直接调用静态变量
        printout();
        StudentTest st = new StudentTest();
        System.out.println(st.name2);
        st.print();
        st.main_demo();
        StudentDemo sd =new StudentDemo();
        System.out.println(sd.name3);
        System.out.println(StudentDemo.teacherName);
        System.out.println(sd.teacherName);
        sd.demoprint();
        StudentDemo.demoprintout();
        sd.demoprintout();
    }
    public void  main_demo(){//实例方法
        System.out.println(name1);
        printout();
        System.out.println(name2);
        print();
    }
    public static void printout(){
        System.out.println("静态方法被调用");
    }
    public void print(){
        System.out.println("实例方法被调用");
    }
}
