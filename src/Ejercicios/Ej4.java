
package Ejercicios;

/*
 * @author Alumno_2
 */
public class Ej4 {

    /*
     * Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, 
     * el penúltimo, el tercero, etc.
     */
    public static void main(String[] args) {
        int v[];
        v=Vectores.insertarleerVector(10);
        
        for (int i=0 ;i<(v.length/2 );i++)
        {
            System.out.print(v[i]+" ");
            System.out.println(v[v.length-1]-i);
        }
    }
}
