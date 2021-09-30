
package practica1maestra;

import java.util.Scanner;


public class Datos 
{
    int x;
    int i;
    int pos;
    double califmen;
    String nomMay;
    String nomMen;
    double califmay;
    Scanner n= new Scanner(System.in);
    Nombres nom;
    Calificaciones cal;
    public Datos()
    {
        System.out.println("introduce la cantidad de alumnos");  
        x=n.nextInt();
        nom= new Nombres(x);
        Llenar();
    }
    public void Llenar()
    {
        for ( i=0; i<x; i++)
        {
            System.out.println("Introduce el "+(i+1)+" alumno");
            nom.LlenarNombres(i);
            System.out.println("introduce calificaciones");
            cal=new Calificaciones (i);
            cal.Llenarcalif();  
        }
        
        Imprimir();
    }
public void Imprimir()
{
    for(i=0; i<x; i++)
    {
       nom.Imprimir();
       cal.Imprimir();
    }
    
    
ImpMay();    
}
public void ImpMay()
{
   califmay=cal.BuscarMayor();
    pos=cal.Enviarpos();
    nomMay=nom.Enviarnom(pos);
    System.out.println("el promedio mayor es: "+ califmay+ " del alumno "+nomMay);
}

public void Impmen()
{
   califmen=cal.BuscarMenor();
    pos=cal.Enviarposmen();
    nomMen=nom.Enviarnom(pos);
    System.out.println("el promedio menor es: "+ califmen+ " del alumno "+nomMen);
} 
    
}
