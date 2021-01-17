// this is the seconde class to calculate the perimatere and surface 



//we import modul neccesary to enter the values 
import java.util.Scanner;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
// creation of the class we use public to make the programe public if we want to mske privat we can use private
public class P {
    public P(){
        System.out.println(" if you want to calculate perimetr and surface please ");
        Scanner responde = new Scanner(System.in);
       
        System.out.println("enter your widght here:");
        float widght = responde.nextFloat();
//in this methode we use float for the decimal calues 
        System.out.println("enter your leght here :");
        float leght= responde.nextFloat();

        float perimeter = (widght*leght)*2;
        System.out.println(" your perimeter is " +perimeter);

        float surface= (widght*leght);
        System.out.println(" your surface is " +surface);

        
        




        



    }
    
}
