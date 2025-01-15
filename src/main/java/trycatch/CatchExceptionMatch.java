package trycatch;

class OpenException1 extends java.lang.Exception {

}
class CloseException1 extends OpenException1 {

}
public class CatchExceptionMatch {



    public static int open(){
        int[] a = new int[10];
        a[10]=10;
        return -1;
    }
    public static void readFile() throws OpenException1, CloseException1 {
        if(open()==-1){
            throw new CloseException1();
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch (CloseException1 e) {
            e.printStackTrace();
            System.out.println("CLose");
        } catch (OpenException1 e) {
            e.printStackTrace();
            System.out.println("Open");
        }catch (java.lang.Exception e) {
            e.printStackTrace();
            System.out.println("Catch in the Exception");
        }
    }
}
