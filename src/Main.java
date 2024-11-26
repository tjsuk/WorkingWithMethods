static int numberValue = 10;
static int value = 0;

public static void main(String[] args) {
    /* int number1 = 11;
    int number2 = 12;
    long number3 = add(number2, number1);
    printResults(number1, number2, number3);
     */

    System.out.println(value);
    System.out.println("Original value before calling a changeValue method: " + numberValue);
    changeValue(numberValue);
    System.out.println("Original value after calling a changeValue method: " + numberValue);
    System.out.println(value);

    long result = add(2,2,2,2);
    double result2 = add(2.1f,3.2f);
    int x = 4;
    float y = 3.2f;
    double result3 = add(x,y);
    float result4 = add(x,y);
}

public static long add(int num1, int num2){
    return num1 + num2;
    // System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
}

public static long add(int num1, int num2, int num3){
    return num1 + num2 + num3;
}

public static long add(int num1, int num2, int num3, int num4){
    return num1 + num2 + num3 + num4;
}

public static double add(double num1, double num2){
    return num1 + num2;
}

public static float add(float num1, float num2){
    return num1 + num2;
}
//public static double add(int num1, float num2){
//    return num1 + num2;
//}

public static void printResults(int num1, int num2, long num3){
    System.out.println("Sum of " + num1 + " and " + num2 + " is " + num3 + ".");
}

public static void changeValue(int value){
    numberValue = 20;
    System.out.println("Value inside of ChangeValue method: " + value);
}

