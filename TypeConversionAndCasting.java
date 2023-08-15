class TypeConversionAndCasting
{
    public static void main(String args[]) 
    {
        // Conversion (Implicit)
        int weight = 62;
        float newWeight = weight;
        System.out.println(newWeight);

        byte byteValue = 127;
        int newByteValue = byteValue;
        System.out.println(newByteValue);

        // Casting (Explicit)
        float height = 62.4f;
        int heightRoundOff = (int)height;
        System.out.println(heightRoundOff);

        // Type Promotion
        byte num1 = 10;
        byte num2 = 30;
        int result = num1 * num2; // 300 is out of byte range but Java promotes to int
        System.out.println(result);
    }
}