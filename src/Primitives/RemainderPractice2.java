package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
 // Find the sum of digits from the given number
        //  123--> 1+2+3= 6==> sout(sum is --> <sum>)

        // 123 % 10 --> 3
        // 12 / 10 --> 2
        // 1 % 10 --> 1

        int myNumber = 123;
        int digit3 = myNumber % 10 ;
        myNumber = myNumber/10;
        int digit2 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit1 = 1;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);



    // find the product of digits from given number
    // 456 ==> 4*5*6 = 120 sout(the product is= + product)

    int num = 456;
    int d1 = num % 10;
    num = num / 10;
    int d2 = num %10;
    num = num /10;
    int d3 = num % 10;
    int product = d1 * d2 * d3;
    System.out.println("The total="+product);
        System.out.println("the product is:" + (d1 + d2+ d3));


}}
