package tcdemo;

public class Compare {

    // version: 2

    public static void main(String[] args) {
        new Executor().execute(args, new CompareAction(), Compare.class.getName());
        System.out.println(2);
    }
}
