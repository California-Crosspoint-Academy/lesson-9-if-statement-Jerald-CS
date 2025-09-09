import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int i = 10, j = 3;
        boolean true_false; 
        //question 1
        //true_false = (j > i); true_false set to false j is less then i

        //question 2
        //true_false = (i > j); true_false set to true i is greater than j

        //question 3
        //true_false = (i == j); true_false set to false because i doesnt equal j

        //question 4
        //true_false = ( (j <= i) || (j >= i ) ); true_false true because i is greater than j and it is a or so true it doesnt matter the other is false

        //question 5
        //true_false = ( (i > j) && (j == 0) ); true_false false because j does not equal 0 and it is a and statement

        //question 6
        //true_false = ( (j < 50) || (j != 33) ); true_false set to true because j is less than 50 and it is a and statement

        //question 7
        //true_false = ( !(j >= 0) || (i <= 50) ); true_false true because i is less than 50 and it is a or statement 

        //question 8
        //true_false = ( !(! (!true)) ); true_false is false becase it starts true then goes false true then false

        //question 9
        //true_false = (5 <= 5); true_false true because 5 is equal to 5

        //question 10
        //true_false = (j != i); true_false true because j does not equal i

        //question 11
        int m = 33;
        boolean b = m <= 44; //sets b to true because m is less than 44
        System.out.println(b); //prints true 
 
        //question 12
        int r = 10;
        boolean books = r >= 17; //makes boolean books = false because r is less then 17
        System.out.println(books); //prints false 
        
        //question 13
        //!( (2>3) || (5==5) && (7>1) && (4<15) || (35<=36) && (89!=34)) middle section is true and since it all being or'ed it will all be true but there is a ! on the outside meaning it flips it making it false
        
        //question 14
        //prints not equal because BUS is capitalized and in the if it is if "school bus" is in written in the string not "school BUS" so it prints "Not equal"
        
        //question 15
        //prints equal because there in the if statement it says it ignores case so it prints equal because the string is school BUS
        
        //question 16
        //prints 200 and 20 because the m++ controlled by if and since j doesnt equal 18 it doesnt execcute m++ and just does j++ because it isnt part of if so now 19 becomes 20 so it prints 200 and 20
        
        //question 17
        int g = 34;
        boolean back = g != 34;
        System.out.println(back);
        
        //question 18
        int king = 24;
        boolean backpack = (king % 2 == 0);
        System.out.println(backpack);
        
        //question 19
        Scanner input = new Scanner(System.in);

        //prompt for users
        System.out.print("Enter your password: "); //ask the users to enter a password
        String password = input.nextLine();

        // Check the password
        if (password.equals("XRay")) { //if you write xray then prints passwork successfully
            System.out.println("Password entered successfully.");
        } 
        else 
        {
            System.out.println("Incorrect password"); //if not then print incorrect password 
        }

        input.close();
        
        //question 20
        //prints two becaause 79 is greater than 50. then since k (79) is greater than 60 it doesnt fit the if and goes to the else which prints two

    }
}
