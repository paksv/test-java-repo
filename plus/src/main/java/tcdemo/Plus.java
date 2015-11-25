package tcdemo;

public class Plus {

    public static void main(String[] args) {
        new Executor().execute(args, new PlusAction(), Plus.class.getName());
    }
}
