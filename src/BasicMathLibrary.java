/**
 * Assignment 2: Add a Basic Math Library
 * Create BasicMath.Java file and class in ecliple in your default package
 * 1. create a method to add two integers together and return an integer
 * 2. create a method to add two doubles together and return a double
 * 3. create a method to add two floats together and return a float
 * 4. create a method to substract two integers together and return an integer
 * 5. create a method to substract two doubles together and return a double
 * 6. create a method to substract two floats together and return a float
 * 7. create a method to multiply two ints together and return an int
 * 8. create a method to multiply two floats together and return a float
 * 9. create a method to multiply two doubles together and return a double
 * 10. create a method to divide two ints together and return an int
 * 11. create a method to divide two floats together and return a float
 * 12. create a method to divide two doubles together and return a double
 * 13. In Tests.Java - Write
 * 14. Test_MathAdd(); to test your math on integers
 * 15. Test_MathSub(); to test your math on integers
 * 16. Test_MathMul(); to test your math on integers
 * 17. Test_MathDiv(); to test your math on integers
 * 18. Extra Points: Write tests for floats and doubles too
 * 19. Extra Points: repeat steps 1 through 13, but modify so that each method also accepts an array of items for that given argument data type
 * 20. Create Test.java static void Test_MathRunAll() method
 * 21. Using Keyboard.Java or Scanner
 * */


public class BasicMathLibrary {
    public static int AddInt(int a, int b) {
        return a + b;
    }

    public static float AddFload(float a, float b) {
        return a + b;
    }

    public static double AddDouble(double a, double b) {
        return a + b;
    }

    public static int SubstractInt(int a, int b) {
        return a - b;
    }

    public static float SubstractFload(float a, float b) {
        return a - b;
    }

    public static double SubstractDouble(double a, double b) {
        return a - b;
    }

    public static int MultiplyInt(int a, int b) {
        return a * b;
    }

    public static float MultiplyFload(float a, float b) {
        return a * b;
    }

    public static double MultiplyDouble(double a, double b) {
        return a * b;
    }

    public static int DivideInt(int a, int b) {
        return a / b;
    }

    public static float DivideFload(float a, float b) {
        return a / b;
    }

    public static double DivideDouble(double a, double b) {
        return a / b;
    }
}
