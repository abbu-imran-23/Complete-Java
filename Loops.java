class Loops
{
    public static void main(String args[]) 
    {
        // for loop
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

        // while loop
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }

        // do while loop - Executes atleast once
        int j = 5;
        do {
            System.out.println(j);
            j++;
        } while(j<=4);

        //  ForEach Loop
        int arr[] = {10,20,30,40,50};
        for(int num: arr) {
            System.out.println(num);
        }
    }
}