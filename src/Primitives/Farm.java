package Primitives;

public class Farm {
    // in a farm  there  are 12 cows and 23 chickens
    // find the total of legs in the farm
    // if each caw  2345 and each chicken 23.99
    // find the total of these animals and print out
    public static void main(String[] args) {
        int chicken = 23;
        double chickens$=  23.99d;
        int cow = 12;
        int cow$ = 2345;
        int totalLegs = chicken*2 + cow*4;
        double TotalCaw$ = cow*cow$;
        double TotalChickens$ = chickens*chickens$;
        System.out.println("Total Legs: " + totalLegs);
        System.out.println("Total cost of animals =" + TotalCaw$ + TotalChickens$ );
    }
}
