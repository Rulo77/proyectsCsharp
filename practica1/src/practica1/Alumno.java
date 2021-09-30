package practica1;

import java.util.Scanner;

public class Alumno {

    String [] alumno;
    int [] promedio;
    int i;
    int a;
    int b;
    int c;
    int prom;
     Scanner n = new Scanner(System.in);
    public Alumno() {
       
        int x;
       
      
        System.out.println("cuantos alumnos desea capturar");
        x = n.nextInt();
        alumno = new String[x];
       
        for (i = 0; i < alumno.length; i++) {
            System.out.println("Nombre de " + (i + 1) + " aumno");
            alumno[i] = n.next();
            
             System.out.println("capture la calificacion 1: ");
          a=n.nextInt();
        System.out.println("capture la calificacion 2: ");
          b=n.nextInt();
           System.out.println("capture la calificacion 3: ");
          c=n.nextInt();
           prom= (a+b+c)/3;
              
        }
       
        Imprimir();
    }

    
   
    
    private void Imprimir() {

      System.out.println("Imprimiendo arreglo.......");
         for(i=0;i<alumno.length;i++)
        {
            System.out.print(alumno[i]+ "   "+prom+ "  ");
            
        }
         System.out.println("");   
        
    }
}
