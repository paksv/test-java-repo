package tcdemo;

public class Compare {

    // version: 1

    public static void main(String[] args) {
        new Executor().execute(args, new CompareAction(), Compare.class.getName());
        System.out.println(2);
    }
}
