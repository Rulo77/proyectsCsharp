
package ejemploarreglos;

import java.util.Arrays;

public class Nombres extends Padre
{
    int x;
    int i;
    String [] nombresitos;
    public Nombres()
            {
                System.out.println("Introduce la dimencion del arreglo nombres");
                x= n.nextInt();
                  nombresitos= new String [x];
                Llenar();
                 Buscar();
            }
     private void Llenar()
    {
        for(i=0;i<nombresitos.length;i++)
        {
            System.out.println("introduce el "+(i+1)+" nombre");
            nombresitos[i]=n.next();
        }
        System.out.println("Arreglo lleno");
        Imprimir();
    }
     
      private void Imprimir()
    {
        System.out.println("Imprimiendo arreglo.......");
         for(i=0;i<nombresitos.length;i++)
        {
            System.out.print(nombresitos[i]+ "   ");
            
        }
         System.out.println("");
        
    }
      
       private void Buscar()
    {
        String y;
        int cont=0;
        System.out.println("Introduce el nombre a buscar");
        y=n.next();
        
          for(i=0;i<nombresitos.length;i++)
          {
              if(nombresitos[i].compareTo (y)==0 )
                  
                
              {
                  System.out.println("El nombre se encuentra en la posicion "+(i+1));
                  cont++;
              }
          }
          if(cont==0)
          {
              System.out.println("El nombre "+y+ " no se encuentra en el arreglo");
          } 
          OrdenarMen_May();
    }

  private void OrdenarMen_May()
    {
        Arrays.sort(nombresitos);
        Imprimir();
   
    }
    
    
}
