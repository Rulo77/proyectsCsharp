
package practica001;

import java.util.Scanner;

public class Alumnos1
{
    //Declaramos las variables a usar con todo el programa (globales)
    Scanner n = new Scanner(System.in);
    int x;
    //Declaramos los arreglos a utilizar
    String [] nombres;
    float [] promedio;
    
    public void Alumnos1()
    {
        //pedimos la dimesión de los arreglos
        System.out.println("Bienvenido... ");
        System.out.println("¿Cuantos alumnos ingresará?");
        x=n.nextInt();
        //instanciamos el arreglo de nombres
        nombres = new String[x];
        Introducir();
    }
    
    private void Introducir()
    {
        //instanciamos el arreglo de promedio
        promedio = new float[x];
        for (int i =0; i<promedio.length ;i++)
        {
            //declaramos vaiables locales para llenar el arreglo de promedio
            int sum = 0;
            int cal;
            //procedemos a llenar el arreglo de nombres
            System.out.println("Introduzca el nombre de el "+(i+1)+" alumno");
            nombres[i]=n.next();
            //despues de introducir el nombre llenamos la posición correspondiente de promedio
            for(int j = 1;j<=3;j++)
            {
                System.out.println("Introduzca la "+j+" calificación");
                cal=n.nextInt();
                sum=sum+cal;
            }
            promedio[i]=sum/3;
        }
        Imprimir();
    }
    
    //imprimimos el nombre y promedio de cada alumno
    private void Imprimir()
    {
        System.out.println("Alumnos:");
        for(int i = 0;i<x; i++)
        {
            System.out.print(nombres[i]+"   ");
        }
        System.out.println("");
        
        for(int i = 0;i<x;i++)
        {
            System.out.print(promedio[i]+"   ");
        }
        System.out.println("");
        Mayor_Prom();
    }
    
    private void Mayor_Prom()
    {
        //declaramos la variabe que nos ayudará a saber el o los promedios más altos
        float y = 0;
        //validamos cual es el más alto
        for(int i = 0; i<x; i++)
        {
            if (promedio[i]>y)
            {
                y=promedio[i];
            }
        }
        
        //imprimimos el más alto
        for(int i = 0;i<x;i++)
        {
            if (promedio[i]==y)
            {
                System.out.println("El alumno con mayor promedio es: "+nombres[i]+" con un promedio de: "+promedio[i]);
            }
        }
        Prom_Men();
    }
    
    private void Prom_Men()
    {
        //declaramos la variable que nos auxilia a saber cual es el promedio menor
        float z = 10;
        
        //Validamos cual es el menor
        for(int i = 0; i<x; i++)
        {
            if (promedio[i]<z)
            {
                z=promedio[i];
            }
        }
        
        //imprimimos el menor
        for(int i = 0;i<x;i++)
        {
            if (promedio[i]==z)
            {
                System.out.println("El alumno con menor promedio es: "+nombres[i]+" con un promedio de: "+promedio[i]);
            }
        }
        Aprobados();
    }
    
    private void Aprobados()
    {
        //Validamos cuales son los aprobados y los imprime
        System.out.println("Aprobados:");
        for (int i = 0;i<x;i++)
        {
            if(promedio[i]>=8)
            {
                System.out.print(nombres[i]+" ");
            }
        }
        System.out.println("");
        for (int i = 0;i<x;i++)
        {
            if(promedio[i]>=8)
            {
                System.out.print(promedio[i]+" ");
            }
        }
        System.out.println("");
        Reprobados();
    }
    
    //Valida cuales son los reprobados y los imprime
    private void Reprobados()
    {
        System.out.println("Reprobados:");
        for (int i = 0;i<promedio.length;i++)
        {
            if(promedio[i]<8)
            {
                System.out.print(nombres[i]+" ");
            }
        }
        System.out.println("");
        for (int i = 0;i<x;i++)
        {
            if(promedio[i]<8)
            {
                System.out.print(promedio[i]+" ");
            }
        }
    }
}
