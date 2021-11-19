package Primitives;

public class CompoundAssigment {
    // +=  -=  *=  /=  %=
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = num1 + 7;
        num1+= num2;
        System.out.println(num1);
    }

}
