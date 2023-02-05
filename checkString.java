public class checkString implements StringChecker {
    public boolean checkString(String s) {
        if (s.length()<5){
        return false;
        }
        else {
            return true;
    }
}
}