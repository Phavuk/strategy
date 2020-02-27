public class Binary implements Strategy {
    @Override
    public String numConversion(int num) {
        return Integer.toBinaryString(num);
    }
}
