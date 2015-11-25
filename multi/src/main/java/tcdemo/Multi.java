package tcdemo;

import java.io.IOException;

public class Multi {

    public static void main(String[] args) throws IOException {
        new Executor().execute(args, new MultiAction(), Multi.class.getName());
    }

}
