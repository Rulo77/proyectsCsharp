
package ejemploarreglos;

import java.util.Arrays;


public class Numeros extends Padre
{
    int x;
    int i;
    int []numeritos;
    public Numeros()
            {
                System.out.println("Introduce la dimencion del arreglo numeros");
                x=n.nextInt();
                numeritos= new int[x];
                Llenar();
                 Buscar();
            }
    
    private void Llenar()
    {
        for(i=0;i<numeritos.length;i++)
        {
            System.out.println("introduce el "+(i+1)+" numero");
            numeritos[i]=n.nextInt();
        }
        System.out.println("Arreglo lleno");
        Imprimir();
    }
    private void Imprimir()
    {
        System.out.println("Imprimiendo arreglo.......");
         for(i=0;i<numeritos.length;i++)
        {
            System.out.print(numeritos[i]+ "   ");
            
        }
         System.out.println("");
        
    }
    
    private void Buscar()
    {
        int y;
        int cont=0;
        System.out.println("Introduce el numero a buscar");
        y=n.nextInt();
        
          for(i=0;i<numeritos.length;i++)
          {
              if(numeritos[i]==y)
              {
                  System.out.println("El numero se encuentra en la posicion "+(i+1));
                  cont++;
              }
          }
          if(cont==0)
          {
              System.out.println("El numero "+y+ " no se encuentra en el arreglo");
          } 
          OrdenarMen_May();
    }

    private void OrdenarMen_May()
    {
        Arrays.sort(numeritos);
        Imprimir();
        OrdenarMay_Men();
    }
    
    private void OrdenarMay_Men()
    {
        
        
    }
}
