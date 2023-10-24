class ConditionalStatements
{
    public static void main(String args[])
    {
        int yourAge = 18;
        int ageEligibleToVote = 18;

        if(yourAge >= ageEligibleToVote) {
            System.out.println("You are eligible to vote!");
        }
        else {
            System.out.println("Sorry, you can't vote yet.");
        }

        // Ternary Operator
        String votingStatus = (yourAge >= ageEligibleToVote) ? "You are eligible to vote!" : "Sorry, you can't vote yet.";
        System.out.println(votingStatus);

        // Switch Statement
        int day = 3;
        switch(day) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("None Matched!");
                break;
        }
        
    }
}