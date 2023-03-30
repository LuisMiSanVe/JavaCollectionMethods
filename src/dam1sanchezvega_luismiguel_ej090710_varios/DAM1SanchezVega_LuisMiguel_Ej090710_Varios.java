/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dam1sanchezvega_luismiguel_ej090710_varios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author alumnom
 */
public class DAM1SanchezVega_LuisMiguel_Ej090710_Varios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos Arrays y Listas para probar los métodos vistos
        ArrayList<Integer> arrl = new ArrayList<>(10);
        Integer[] arr = new Integer[10];
        
        // ADD-ALL
        // Metemos elementos al array
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.round(Math.random()*10));
        }
        // Mostramos los elementos de cada conjunto antes y después
        System.out.println("ANTES DEL ADD-ALL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Collections.addAll(arrl, arr);
        
        System.out.println("DESPUÉS DEL ADD-ALL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // SHUFFLE
        // Mostramos los elementos de cada conjunto antes y después
        System.out.println("\nANTES DEL SHUFFLE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Collections.shuffle(arrl);
        
        System.out.println("\nDESPUÉS DEL SHUFFLE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // FILL
        // Mostramos los elementos de cada conjunto antes y después
        System.out.println("\nANTES DE REEMPLAZAR CON FILL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Arrays.fill(arr,5);
        Collections.fill(arrl, 5);
        
        System.out.println("\nDESPUÉS DE REEMPLAZAR CON FILL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // BINARY-SEARCH        
        // Si sale positivo ha encontrado el número y si es negativo no lo ha encontrado
        System.out.println("\nBUSQUEDA CON BINARYSEARCH");
        System.out.println("Array------------");
        System.out.print(Arrays.binarySearch(arr, (int) (Math.round(Math.random()*10))));
        System.out.println("\nArrayList--------");
        System.out.print(Collections.binarySearch(arrl, (int) (Math.round(Math.random()*10))));
        
        System.out.println("");
        
        // AS-LIST
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\nARRAY CONVERTIDO EN ARRAYLIST CON ASLIST");
        for(Integer i:lista){System.out.print(i + ", ");}
        // Devuelvo la clase a la que pertenece para comprobarlo
        System.out.println("\n" + lista.getClass());
        
        System.out.println("");
        
        // TO-ARRAY
        Integer[] array = new Integer[10];
        arrl.toArray(array);
        System.out.println("\nARRAYLIST CONVERTIDO EN ARRAY CON TOARRAY");
        for(Integer i:lista){System.out.print(i + ", ");}
        // Devuelvo la clase a la que pertenece para comprobarlo
        System.out.println("\n" + array.getClass());
        
        System.out.println("");
        
        // REVERSE
        // Reemplazo los elementos de los conjuntos
        arrl.clear();
        for(int i = 0 ; i<=10;i++){
            arrl.add((int) (Math.round(Math.random()*10)));
        }
        System.out.println("\nANTES DE DARLE LA VUELTA CON REVERSE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Collections.reverse(arrl);
        
        System.out.println("\nDESPUÉS DE DARLE LA VUELTA CON REVERSE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // SPLIT
        // Creamos el String y el Array
        String cadenaJunta = "Elemento1/Elemento2/Elemento3";
        String[] arrCadenaSeparada = cadenaJunta.split("/");
        System.out.println("\nCADENA ORIGINAL");
        System.out.println(cadenaJunta);
        System.out.println("CADENA SEPARADA EN UN ARRAY CON SPLIT");
        for(String i:arrCadenaSeparada){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // JOIN
        // Creamos el Array y el String
        String[] arrCadenaJunta = {"Dato1","Dato2","Dato3"};
        String cadenaSeparada = String.join("/", arrCadenaJunta);
        System.out.println("\nARRAY ORIGINAL");
        for(String i:arrCadenaJunta){System.out.print(i + ", ");}
        System.out.println("\nARRAY JUNTO EN UN STRING CON JOIN");
        System.out.println(cadenaSeparada);
        
        System.out.println("");
        
    }
}
