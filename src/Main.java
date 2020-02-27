public class Main {
    public static void main(String[] args) {

        Context context1 = new Context(new Binary());
        System.out.println(context1.executeStrategy(503));

        Context context2 = new Context(new Binary());
        System.out.println(context2.executeStrategy(102));

        Context context3 = new Context(new Binary());
        System.out.println(context3.executeStrategy(13));

    }
}
