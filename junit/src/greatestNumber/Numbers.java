package greatestNumber;


import java.util.Scanner;
public class Numbers {
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        //create a scanner object for input
        System.out.print("Enter the first number\n");
        int num1=scan.nextInt();//reads num1 from user
        System.out.print("Enter the second number\n");
        int num2=scan.nextInt();;//reads num2 from user
        System.out.print("Enter the Third number\n");
        int num3=scan.nextInt();;//reads num3 from user
        System.out.print("Enter the Fourth number\n");
        int num4=scan.nextInt();;//reads num3 from user
        GreatestFour(num1,num2,num3,num4);//calling the method
        scan.close();
    }
    static void GreatestFour(int num1, int num2, int num3,int num4){//method definition
        if(num1>num2){
            if (num1>num3) {
                if (num1 > num4) {
                    System.out.println(num1 + " is the large number");
                }
                else {
                    System.out.println(num4 + " is the large number");
                }
            }else  if(num3>num4) {
                System.out.println(num3 + " is the large number");
            }
            else{
                System.out.println(num4+" is the large number");
            }

        }else if (num2>num3){
            if (num2>num4){
                System.out.println(num2+" is the large number");
            }
            else
                System.out.println(num4+" is the large number");
        }else if (num3>num4){
            System.out.println(num3+" is the large number");
        }else 
            System.out.println(num4+" is the large number");
    }
    
}
