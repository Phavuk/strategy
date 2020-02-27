public class Hexadecimal implements Strategy {
    @Override
    public String numConversion(int num) {
        return Integer.toHexString(num);
    }
}
