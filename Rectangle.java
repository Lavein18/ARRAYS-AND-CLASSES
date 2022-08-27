/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author 21cse113
 */
 class Rectangle {
   float length = 1.0f;
   float width = 1.0f;
   
   Rectangle(float length , float width)
   {
       this.length = length;
       this.width = width;
   }
   float getLength ()
   {
       return length;
   }
   void setLength (float length)
   {
       this.length = length;
   }
   float getWidth ()
   {
       return width;
   }
   void setWidth(float width)
   {
       this.width = width;
   }
   double getArea()
   {
       return (length*width);
   }
   double getPerimeter()
   {
       return (2*(length+width));
   }
   @Override
   public String toString()
   {
       return ("Rectangle" + " [Length = "+length + ", width = "+width + " ] ");
   }
   
   
}
public class Exp1
{
    public static void main(String args[])
    {
        Rectangle obj = new Rectangle(2,4);
        float length = 0.0f,width = 0.0f;
        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Length : "+obj.getLength());
        System.out.println("Width : "+obj.getWidth());
        System.out.print("Enter New length value : ");
        length = scan.nextFloat();
        obj.setLength(length);
        System.out.print("Enter New width value : ");
        width = scan.nextFloat();
        obj.setWidth(width);
        System.out.println("Width  : "+obj.getWidth());
        System.out.println("Height : "+obj.getLength());
        System.out.println(obj);
        System.out.println("Area      : " + obj.getArea());
        System.out.println("Perimeter : " + obj.getPerimeter());
        obj.getLength();
    }
}
