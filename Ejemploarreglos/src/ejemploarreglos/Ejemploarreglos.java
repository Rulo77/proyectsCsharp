
package ejemploarreglos;

import java.util.Scanner;


public class Ejemploarreglos 
{
 
    Scanner n=new Scanner(System.in);
    public static void main(String[] args)
    {
        Ejemploarreglos a= new Ejemploarreglos();
        a.Menu();
        
    }
    
    public void Menu ()
 {
     int opc;
     Numeros num;
     Nombres nom;
     
   System.out.println("selecciona una opción \n1.Numeros \n2.Nombres");
   opc=n.nextInt();
   
   switch (opc)
   {
       case 1:
           num=new Numeros();
           break;
           
       case 2:
           nom=new Nombres();
           break;
           
       default:
           break;
   }
   }

  }
    

