package tcdemo;

import java.util.Comparator;

public class Executor {

    public void execute(String[] args, Comparator<String> comparator, String mainClassName) {
        if (args.length < 2){
            System.err.printf("Usage tcdemo.%s <path1> <path2>%n", mainClassName);
            System.exit(2);
        }

        System.out.println(comparator.compare(args[0], args[1]));
    }

}
