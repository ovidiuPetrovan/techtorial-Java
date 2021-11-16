package com.company;
public class Main {


    public static void main(String[] args) {
        //int value = 3;
        //if (value == 1) {
          //  System.out.println("Value was 1");

        //} else if (value == 2) {
          //  System.out.println(" Value was 2");
        //} else {
          //  System.out.println("Was not 1 or 2");
      //  }

        int switchValue = 3;
          switch (switchValue){
              case 1 :
                  System.out.println(" Value was 1");
              break;
              case 2 :
                  System.out.println(" Value was 2");
                  break;
              case 3:case 4:case 5:
                  System.out.println("was a 3, a 4 ,a 5");
                  System.out.println(" Actually it was a " + switchValue);
                  break;
              default:
                  System.out.println(" Was not 1 or 2");
                  break;

          }


          char charValue = 'F';
          switch (charValue){
              case 'A':
                  System.out.println("Value was A");
                  break;
              case 'B':
                  System.out.println("Value was B");
                  break;
                  case 'C':
                  System.out.println("Value was C");
                  break;
              case 'D':
                  System.out.println("Value was D ");
                  break;
              case 'E':
                  System.out.println("Value was E");
              default:
              System.out.println("Could not fin A, B, C , D or E");
              break;


          }
          String month = "juNE";
          switch (month.toLowerCase()){
              case "january":
                  System.out.println("january");
                  break;
              case "June":
                  System.out.println("june");
                  break;
              default:
                  System.out.println(" No months");
                  break;

          }

    }
}
