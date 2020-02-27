public class Octal implements Strategy {
    @Override
    public String numConversion(int num) {
        return Integer.toOctalString(num);
    }
}
