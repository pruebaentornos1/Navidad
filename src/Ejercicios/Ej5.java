
package Ejercicios;
/*
 * @author Alumno_2
 */
public class Ej5 {

    /*
     * Leer por teclado dos arrays de 10 números enteros y mezclarlos en una 
     * tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc
     */
    public static void main(String[] args) {
        int v[]=new int[10], w[]=new int[10];
        int z[]=new int[v.length+w.length];
        
        System.out.println("Introduce los elementos del vector v");
        v=Vectores.insertarleerVector(10);
        System.out.println("Introduce los elementos del vector w");
        w=Vectores.insertarleerVector(10);
                
        for(int i=0,indZ=0;i<v.length;i++)
        {
            z[indZ]=v[i];
            indZ++;
            z[indZ]=w[i];
            indZ++;
        }
        Vectores.mostrarVector(z);
    }
}
