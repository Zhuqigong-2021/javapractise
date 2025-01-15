package trycatch;

class CloseException extends Throwable{

}
class OpenException extends Throwable{

}
public class ThrowException {
    public static int open(){
        return -1;
    }
    public static void readFile() throws OpenException,CloseException {
        if(open()==-1){
            throw new OpenException();
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (OpenException | CloseException e) {
            throw new RuntimeException(e);
        }
    }
}
