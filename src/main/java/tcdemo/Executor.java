package tcdemo;

public class Executor {

    public void execute(String[] args, Action action, String mainClassName) {
        boolean validArgs = true;
        if (args.length == 0){
            validArgs = false;
        }
        int num1 = Integer.MIN_VALUE+1;
        int num2 = Integer.MIN_VALUE+1;
        try {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
        } catch (Exception ex){
            validArgs = false;
        }

        if (!validArgs){
            System.err.printf("Usage tcdemo.%s <number1> <number2>%n", mainClassName);
            System.exit(2);
        }

        System.out.println(action.action(num1, num2));
    }

}
