//ACHILLE Sagang Tanwouo AND Diane Niyibaruta

// In the first part I import the modul for enter the varaibles that we need for IMC

import java.util.Scanner;
// And I creat the class that we need for our method 

public class A{
    //creation of our method 

    public static void main(String[] args)

     {
        // we create an input which neccesaire to introduice the vraiable neccesary for IMC calcul 
        Scanner clavier = new Scanner(System.in);
         System.out.println("enter your name here:");
         String name= clavier.nextLine();
        //we ask to the system to print to the user the information 
         System.out.println("enter your weight please :");
         float weight= clavier.nextFloat();
        
         System.out.println("enter your height in cm please:");
         float height= clavier.nextFloat();
//Here we use the IMC formula .
         float division= weight / (height * height);
         System.out.println( name+ " your MBI is "+ division );

//we make a condition here because when someone have a BMI> 30 He consider obesy 
//so if during the calcul the person have a BMI>30  we have a print which indicate or not  
         if(division>=30)
         {
             System.out.println(" you are obesy");
         }
         else if (division < 30)
        System.out.println("you have a good BMI");
//this methode is neccesary or is consisted to main class so is necesary to make work the class p.java
        P pp= new P();
     }
} 
 


