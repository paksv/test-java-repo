package tcdemo;

import java.io.IOException;

public class Compare {

    public static void main(String[] args) throws IOException {
        new Executor().execute(args, new WindowsPathComparer(), Compare.class.getName());
    }

}
