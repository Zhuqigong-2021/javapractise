package Enumeration;

/**
 * @author Phil
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Season3 season3 = Season3.CLASSICMUSIC;
        season3.playing();
        System.out.println(Season3.CLASSICMUSIC);
    }
}

class A{

}
interface IPlaying{
    public void playing();
}
//1.使用enum类，就不能继承其他类了，因为他隐藏继承Enum类而java是属于单继承机制
//2.enum实现的枚举，依然是个类，可以实现接口
enum Season3 implements IPlaying{
    CLASSICMUSIC;

    @Override
    public void playing() {
        System.out.println("好听的音乐.....");
    }
}