/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndClasses;
import java.util.Scanner;
/**
 *
 * @author 21cse113
 */
class COMPLEX
{
    double a1 = 0.0d;
    double a2 = 0.0d;
    double b1 = 0.0d;
    double b2 = 0.0d;
   
    double z1 = 0.0d;
    double z2 = 0.0d;
    int val = 0;
    void putComplex()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a1 : ");
        a1 = scan.nextDouble();
        System.out.println("Enter b1 : ");
        b1 = scan.nextDouble();
        System.out.println("Enter a2 : ");
        a2 = scan.nextDouble();
        System.out.println("Enter b2 : ");
        b2 = scan.nextDouble();
       
    }
    void getComplex(int val)
    {
        if(val==1)
        {
            System.out.println(a1 + "+" + b1+" i");
        }
        else if(val==2)
        {
            System.out.println(a2 + "+" + b2 + " i");
        }
        else if(val==3)
        {
            System.out.println(z1 + "+" + z2 + " i");
        }
    }
    void add()
    {
        this.z1 = a1 + a2;
        this.z2 = a2 + b2;
    }
    void sub()
    {
        this.z1 = a1 - a2;
        this.z2 = a2 - b2;
    }
    void multiply()
    {
        this.z1 = (a1*a2)-(b1*b2);
        this.z2 = (a1*b2) + (a2*b1);
    }
    void divide()
    {
        this.z1 = ((a1*a2)+(b1*b2))/((a2*a2)+(b2*b2));
        this.z2 = ((a2*b1)-(a1*b2))/((a2*a2)+(b2*b2));
    }
    @Override
    public String toString()
    {
        return "\nNumber one : " +a1 +" + " + b1 +"i" + "\nNumber two : " +a2 +" + " + b2 +"i" + "\nResult : " +z1 +" + " + z2 +"i";
    }
}
public class Exp2 {
    public static void main(String args[])
    {
        COMPLEX obj = new COMPLEX();
        Scanner scan = new Scanner(System.in);
        int num,tnum;
        while(true)
        {
         System.out.println("1 - Enter Data \n2 - Perform calculations \n3 - Print a number \n4 - Print everything \nEnter number : ");
         num = scan.nextInt();
         switch(num)
         {
             case 1:
                 obj.putComplex();
                 break;
             case 2:
                 System.out.println("1 - add\n2 - sub\n3 - Multiply \n4 - Divide\nEnter a number : ");
                 tnum = scan.nextInt();
                 switch(tnum)
                 {
                     case 1 :
                         obj.add();
                         break;
                     case 2:
                         obj.sub();
                         break;
                     case 3 :
                         obj.multiply();
                         break;
                     case 4:
                         obj.divide();
                         break;
                     default:
                         break;
                 }
                 break;
             case 3:
                 System.out.println("1 - Number 1\n2 - Number 2 \n3 - Result\nEnter a number : ");
                 tnum = scan.nextInt();
                 obj.getComplex(tnum);
                 break;
             case 4:
                 System.out.println(obj);
           
         }
        }
    }
   
}

