public class MathOperations {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        int resultInt = mathOps.add(5, 7);
        System.out.println("Sum of two integers: " + resultInt);

        double resultDouble = mathOps.add(3.5, 2.2, 1.3);
        System.out.println("Sum of three doubles: " + resultDouble);

        String resultString = mathOps.add("Welcome ", "Home!");
        System.out.println("Concatenated string: " + resultString);
    }
}
