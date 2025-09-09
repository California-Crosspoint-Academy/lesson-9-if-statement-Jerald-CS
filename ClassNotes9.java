public class ClassNotes9 {
    public static void main(String[] args) {
        int theGrade = 80; 
        if (theGrade >= 70) 
        { 
            System.out.println("You passed!"); 
        }
        else 
        { 
            System.out.println("You failed."); 
        }

        if (theGrade>=90)
        {
            System.out.println("You made an A.");
        }
            else if (theGrade>=80)
        {
            System.out.println("You made a B.");
        }
            else if (theGrade>=70)
        {
            System.out.println("You made a C.");
        }
            else if (theGrade>=60)
        {
            System.out.println("You made a D.");
        }
            else
        {
            System.out.println("Sorry, you failed.");
        }


    }
}