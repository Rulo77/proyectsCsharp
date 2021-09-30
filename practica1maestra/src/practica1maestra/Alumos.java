
package practica1maestra;

import java.util.Scanner;


public class Alumos 
{
    Scanner n= new Scanner(System.in);
    static String [] nombre;
    static double [] calificaciones;
    
 protected void Inicializar(int x)
 {
     nombre=new String[x];
     calificaciones= new double [x];
 }
    
}
