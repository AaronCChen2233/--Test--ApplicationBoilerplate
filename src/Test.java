public class Test {

    static int testTimes = 0;

    public static void Test_Console_RunAll(int times) {
        testTimes = times;
        Test_Console_Print();
        Test_Console_Println();
        Test_Console_NewLine();
        Test_Console_RepeatChar();
        Test_Console_RepeatString();
    }

    public static void Test_Math_RunAll(int times){
        testTimes = times;
        Test_MathAdd();
        Test_MathSub();
        Test_MathMul();
        Test_MathDiv();
    }

    public static void Test_Console_Print() {
        for (int i = 0; i < testTimes; i++) {
            Debug.logInfo("Test_Console_Print");
            Console.print(String.valueOf(i));
        }
    }

    public static void Test_Console_Println() {
        for (int i = 0; i < testTimes; i++) {
            Debug.logInfo("Test_Console_Println");
            Console.println(String.valueOf(i));
        }
    }

    public static void Test_Console_NewLine() {
        for (int i = 0; i < testTimes; i++) {
            Debug.logInfo("Test_Console_NewLine");
            Console.newLines(i);
        }
    }

    public static void Test_Console_RepeatChar() {
        for (int i = 0; i < testTimes; i++) {
            Debug.logInfo("Test_Console_RepeatChar");
            Console.repeatChar(i, 't');
        }
    }

    public static void Test_Console_RepeatString() {
        for (int i = 0; i < testTimes; i++) {
            Debug.logInfo("Test_Console_RepeatString");
            Console.repeatString(i, "TestString" + String.valueOf(i + 1));
        }
    }

    public static void Test_MathAdd() {
        int b = 100;
        int result = 0;
        for (int i = 0; i < testTimes; i++) {
            result = i + b;
            Debug.logInfo("Test_MathAdd");
            if (result == BasicMathLibrary.AddInt(i, b)) {
                Debug.logInfo(String.valueOf(i) + " + " + String.valueOf(b) + " = " + result + " -PASS");
            } else {
                Debug.logInfo(String.valueOf(i) + " + " + String.valueOf(b) + " = " + result + " -FAIL");
            }
        }
    }

    public static void Test_MathSub() {
        int b = 100;
        int result = 0;
        for (int i = 0; i < testTimes; i++) {
            result = i - b;
            Debug.logInfo("Test_MathSub");
            if (result == BasicMathLibrary.SubstractInt(i, b)) {
                Debug.logInfo(String.valueOf(i) + " - " + String.valueOf(b) + " = " + result + " -PASS");
            } else {
                Debug.logInfo(String.valueOf(i) + " - " + String.valueOf(b) + " = " + result + " -FAIL");
            }
        }
    }

    public static void Test_MathMul() {
        int b = 100;
        int result = 0;
        for (int i = 0; i < testTimes; i++) {
            result = i * b;
            Debug.logInfo("Test_MathMul");
            if (result == BasicMathLibrary.MultiplyInt(i, b)) {
                Debug.logInfo(String.valueOf(i) + " * " + String.valueOf(b) + " = " + result + " -PASS");
            } else {
                Debug.logInfo(String.valueOf(i) + " * " + String.valueOf(b) + " = " + result + " -FAIL");
            }
        }
    }

    public static void Test_MathDiv() {
        int b = 100;
        int result = 0;
        for (int i = 1; i <= testTimes; i++) {
            result = i / b;
            Debug.logInfo("Test_MathDiv");
            if (result == BasicMathLibrary.DivideInt(i, b)) {
                Debug.logInfo(String.valueOf(i) + " / " + String.valueOf(b) + " = " + result + " -PASS");
            } else {
                Debug.logInfo(String.valueOf(i) + " / " + String.valueOf(b) + " = " + result + " -FAIL");
            }
        }
    }


}
