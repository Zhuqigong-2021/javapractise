package Enumeration;

/**
 * @author Phil
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}

enum Season2{


    //定义了四个对象
//
//    public static final Season WINTER = new Season2("冬天", "寒冷");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
   //如果使用enum，来实现枚举类
    //1.用关键字enum 来实现枚举类,底层默认继承了Enum类，而且是一个final类
    //2.   public static final Season2 SPRING = new Season2("春天", "温暖");直接使用 SPRING("春天", "温暖");格式：常量名（实参列表）
    //3. 如果有多个常量（对象），使用逗号间隔即可
    //4.如果使用enum来实现枚举类，要求将定义的常量对象放在Enum类内部的最前面
    //5.如果使用无参构造器创建常量对象，则可以省略（）
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),
//    what-->what(),
    AUTUMN("秋天", "凉爽");
    private String name;
    private String desc;

    private Season2(){}
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


}