package tcdemo;

import java.io.IOException;

public class Compare {

    public static void main(String[] args) {
        new Executor().execute(args, new LinuxPathComparer(), Compare.class.getName());
    }

}
