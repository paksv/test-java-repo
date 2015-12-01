package tcdemo;

public class Compare {

    public static void main(String[] args) {
        new Executor().execute(args, new WindowsPathComparer(), Compare.class.getName());
    }
}
