package tcdemo;

public class Compare {

    public static void main(String[] args) {
        new Executor().execute(args, new LinuxPathComparer(), Compare.class.getName());
    }
}
