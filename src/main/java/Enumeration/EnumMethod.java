package Enumeration;

/**
 * @author Phil
 * @version 1.0
 *
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        //输出枚举常量对象的名称
        System.out.println(autumn.name());
        //ordinal()输出的是该枚举对象的次序/编号，从0开始编号，按照定义该对象的次序编号
        System.out.println(autumn.ordinal());
        //values方法属于enum 枚举类的方法，返回enum类内定义所有的常量数组
        Season2[] values =Season2.values();
        for (Season2 season:values) {
            System.out.println(season);
        }
        //valuesOf:将字符串转成成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //1.根据你输入的“AUTUMN”到Season2的枚举对象去查找
        //2.如果找到了，就返回，如果没有找到就报错
        Season2 autumn1=Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        //compareTo：比较两个枚举常量，比较的就是位置编号，类似与array的index大小A.compareTo(B) => ordinal A-B
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

    }
}
