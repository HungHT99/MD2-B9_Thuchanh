package ra.dev;

public class AbsoluteNumber {
    public static int getAbsoluteNumber(int number){
        int absNumber;
        if (number>=0){
            absNumber = number;
        } else {
            absNumber = -number;
        }
        return absNumber;
    }
}
