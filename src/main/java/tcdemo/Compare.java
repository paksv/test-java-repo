package tcdemo;

public class Compare {

    public static void main(String[] args) {
        new Executor().execute(args, new CompareAction(), Compare.class.getName());
        System.out.printlb(1);
    }
}
