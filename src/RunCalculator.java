import java.util.ArrayList;

public class RunCalculator {
    ArrayList<String> Argumentslist = new ArrayList<String>();

    RunCalculator(ArrayList<String> arguments) {
        Argumentslist = arguments;
    }

    public String Run() {
        /*Remove Argument*/
        Argumentslist.remove(0);

        /*Do Multiply and Divide first Then Add and Subtract*/
        for (int i = 0; i < Argumentslist.size(); i++) {
            switch (Argumentslist.get(i)) {
                case "*": {
                    double value1 = Double.valueOf(Argumentslist.get(i - 1));
                    double value2 = Double.valueOf(Argumentslist.get(i + 1));
                    Argumentslist.set(i, String.valueOf(BasicMathLibrary.MultiplyDouble(value1, value2)));
                    Argumentslist.remove(i + 1);
                    Argumentslist.remove(i - 1);
                    i--;
                    break;
                }
                case "/": {
                    double value1 = Double.valueOf(Argumentslist.get(i - 1));
                    double value2 = Double.valueOf(Argumentslist.get(i + 1));
                    Argumentslist.set(i, String.valueOf(BasicMathLibrary.DivideDouble(value1, value2)));
                    Argumentslist.remove(i + 1);
                    Argumentslist.remove(i - 1);
                    i--;
                    break;
                }
                default: {
                    break;
                }
            }
        }

        for (int i = 0; i < Argumentslist.size(); i++) {
            switch (Argumentslist.get(i)) {
                case "+": {
                    double value1 = Double.valueOf(Argumentslist.get(i - 1));
                    double value2 = Double.valueOf(Argumentslist.get(i + 1));
                    Argumentslist.set(i, String.valueOf(BasicMathLibrary.AddDouble(value1, value2)));
                    Argumentslist.remove(i + 1);
                    Argumentslist.remove(i - 1);
                    i--;
                    break;
                }
                case "-": {
                    double value1 = Double.valueOf(Argumentslist.get(i - 1));
                    double value2 = Double.valueOf(Argumentslist.get(i + 1));
                    Argumentslist.set(i, String.valueOf(BasicMathLibrary.SubstractDouble(value1, value2)));
                    Argumentslist.remove(i + 1);
                    Argumentslist.remove(i - 1);
                    i--;
                    break;
                }
                default: {
                    break;
                }
            }
        }

        return Argumentslist.get(0);
    }
}
