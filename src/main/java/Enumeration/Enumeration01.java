package Enumeration;

/**
 * @author Phil
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
//        Season spring = new Season("春天", "温暖");
//        Season winter = new Season("冬天", "寒冷");
//        Season summer = new Season("夏天", "炎热");
//        Season autumn = new Season("秋天", "凉爽");

        //因为对于季节而言，它的对象（具体值），是固定的四个，不会有更多
        //按照这个设计思路，不能体现季节是固定的四个对象
        //因此，这样的设计不好====>通过枚举类实现[枚：一个一个 举：例举，即把具体的对象一个一个的列举出来的类就成为枚举类
//        Season other = new Season("红天", "~~~");

    }
}

//class Season{
//    private String name;
//    private String desc;
//
//    public Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//}
