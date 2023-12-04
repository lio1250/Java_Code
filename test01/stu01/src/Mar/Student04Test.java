
import Mar.Student04;

public class Student04Test {
    public static void main(String[] args){
        Student04 stu01 = new Student04("19021201","张三","信息处理与大数据科学");
        //使用访问器getXxx（）读取学生信息
        System.out.println("学号："+stu01.getSno());
        System.out.println("姓名："+stu01.getName());
        System.out.println("专业："+stu01.getMajor());
        System.out.println("年龄："+stu01.getAge());
        System.out.println("性别："+stu01.getGender());
        Student04 stu02 = new Student04("19021201","张三","信息处理与大数据科学",19);
        //使用访问器getXxx（）读取学生信息
        System.out.println("学号："+stu02.getSno());
        System.out.println("姓名："+stu02.getName());
        System.out.println("专业："+stu02.getMajor());
        System.out.println("年龄："+stu02.getAge());
        System.out.println("性别："+stu02.getGender());
        Student04 stu03 = new Student04("19021201","张三","信息处理与大数据科学",'男',19);
        //使用访问器getXxx（）读取学生信息
        System.out.println("学号："+stu03.getSno());
        System.out.println("姓名："+stu03.getName());
        System.out.println("专业："+stu03.getMajor());
        System.out.println("年龄："+stu03.getAge());
        System.out.println("性别："+stu03.getGender());
    }
}
