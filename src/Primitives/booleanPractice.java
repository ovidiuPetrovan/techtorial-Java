package Primitives;

public class booleanPractice {
    public static void main(String[] args) {
         boolean isHungry = true ;
        boolean isLightOn =false;
        System.out.println(isHungry);
        System.out.println(isHungry==isLightOn);
       boolean isLight =true;
               isLight = isHungry;
        // find the sum of digits from given number
        //123--> sout(sum is >> sum
        // 123%10--> 3
        // 12%10-->2
        // 1% 10-->1
        int mynumber = 123;
        int digit3= mynumber % 10;
        mynumber = mynumber / 10;

        int digit2 = mynumber %  10;
        mynumber = mynumber / 10;
        int digit1 = mynumber % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);


    }

    }

