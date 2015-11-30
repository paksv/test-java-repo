package tcdemo;

import java.util.Comparator;

public class Executor {

    public void execute(String[] args, Comparator<String> action, String mainClassName) {
        if (args.length < 2){
            System.err.printf("Usage tcdemo.%s <String1> <String2>%n", mainClassName);
            System.exit(2);
        }

        System.out.println(action.compare(args[0], args[1]));
    }

}
