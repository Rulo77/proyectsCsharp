
package practica1maestra;

public class Nombres extends Alumos 
{
    public Nombres (int x)
    {
       Inicializar(x); 
    }
    
    public void LlenarNombres(int i)
    {
        System.out.println("Nombre del alumno");
        nombre[i]= n.next();
    }
    
    public void Imprimir()
    {
        for(int i=0; i<nombre.length; i++)
        {
            System.out.print(nombre[i]+"   ");
        }
        System.out.println("");
    }
    
    public String Enviarnom(int p)
    {
        return nombre[p];
    }
}
