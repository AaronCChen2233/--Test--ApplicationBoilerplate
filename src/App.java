public class App {
    private static boolean _shouldTerminate = false;

    private static boolean _shouldRunTests = false;

    private static boolean _runCalculator = false;

    private static CommandLine commandLine;

    private static RunCalculator runCalculator;


    public static void main(String[] args) {
        commandLine = new CommandLine(args);
        runCalculator = new RunCalculator(commandLine.Argumentslist);
        /*-runtest 5*/
        _shouldRunTests = commandLine.doesArgumentExists("-runtest");
        _runCalculator = commandLine.doesArgumentExists("-calculator");

        if (_shouldRunTests) {
            Test.Test_Console_RunAll(Integer.valueOf(commandLine.Arguments[1]));
            Test.Test_Math_RunAll(Integer.valueOf(commandLine.Arguments[1]));
        }

        if (_runCalculator) {
            try{
                Console.println("Calculator result is " + runCalculator.Run());
            }catch (Exception ex){
                Debug.logException("Format error or you divide 0");
                Debug.logInfo("EX: -calculator 5 + 3 + 9");
            }
        }

        do {
            Console.print("Exit?(Y/N)");
            _shouldTerminate = Keyboard.nextLine().toLowerCase().equals("y");
        } while (!_shouldTerminate);
    }
}
