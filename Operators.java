class Operators
{
    public static void main(String args[]) {

        // Operators
        int num1 = 20;
        int num2 = 10;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);

        // Increment and Decrement [Pre and Post]
        int value = 10;

        // int preIncValue = ++value;
        int postIncValue = value++;
        // int preDecValue = --value;
        // int postDecValue = value--;

        // System.out.println(preIncValue);
        System.out.println(postIncValue);
        // System.out.println(preDecValue);
        // System.out.println(postDecValue);

        // Conditional Operators
        int value1 = 20;
        int value2 = 10;

        boolean result1 = value1 == value2;
        boolean result2 = value1 != value2;
        boolean result3 = value1 > value2;
        boolean result4 = value1 >= value2;
        boolean result5 = value1 < value2;
        boolean result6 = value1 <= value2;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        // Logical Operators
        int val1 = 10;
        int val2 = 20;
        int val3 = 5;
        boolean isMale = true;

        boolean res1 = (val1 > val3) || (val2 < val3);
        boolean res2 = (val1 > val3) && (val2 < val3);
        boolean nowIsMale = !isMale;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(nowIsMale);
    }
}