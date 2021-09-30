
package practica1maestra;


public class Calificaciones extends Alumos 
{
    int i;
     double prom;
    int pos;
    int pos1;
    public Calificaciones (int p)
    {
        i=p;
        double calif;
        for(int j=1; j<=3; j++)
        {
            System.out.println("introduce la "+j+" calificacion");
            calif=n.nextDouble();
            prom=prom+calif;
        }
        prom=prom/3;
       
        
    }
    
    public void Llenarcalif()
    {
        calificaciones[i]=prom;
    }
    
      public void Imprimir()
    {
        for(int i=0; i<calificaciones.length; i++)
        {
            System.out.print(calificaciones [i]+"   ");
        }
        System.out.println("");
    }
      
      public double BuscarMayor()
      {
          double mayor=calificaciones[0];
          pos=0;
          for (i=0;i<calificaciones.length; i++)
          {
              if(calificaciones[i]>mayor)
              {
                  mayor=calificaciones[i];
                  pos=i;
              }
          }
          return mayor;
      }
      public int Enviarpos()
      {
          return pos;
      }
      
        public double BuscarMenor()
      {
          double menor=calificaciones[0];
          pos1=0;
          for (i=0;i<calificaciones.length; i++)
          {
              if(calificaciones[i]<menor)
              {
                  menor=calificaciones[i];
                  pos=i;
              }
          }
          return menor;
      }
            public int Enviarposmen()
      {
          return pos1;
      }
}
