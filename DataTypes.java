class DataTypes
{
    public static void main(String args[]) 
    {
        boolean isMale = true; // Bytes - 1
        byte byteValue = 127; // Range [-128 to 127] Byte - 1
        short shortValue = 4000 // Bytes - 2
        char favouriteAlphabet = 'A'; // Bytes - 2
        int age = 21; // Bytes - 4
        long longValue = 10000000000l; // Bytes - 8
        float weight = 61.5f; // Bytes - 4
        double newWeight = 63.7; // Bytes - 8
        String name = "Imran";

        System.out.println(name + " was " + age + " year old and " + weight + ", but his new weight is " + newWeight + " and his favourite Alphabet is " + favouriteAlphabet);
        
    }
}