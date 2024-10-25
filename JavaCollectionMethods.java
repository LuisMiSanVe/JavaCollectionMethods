/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollectionmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author alumnom
 */
public class JavaCollectionMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize the collections to work with
        ArrayList<Integer> arrl = new ArrayList<>(10);
        Integer[] arr = new Integer[10];
        
        // ADD-ALL
        // Set the elements to the array
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.round(Math.random()*10));
        }
        // Show array's content before and after
        System.out.println("BEFORE ADD-ALL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Collections.addAll(arrl, arr);
        
        System.out.println("AFTER ADD-ALL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // SHUFFLE
        // Show array's content before and after
        System.out.println("\nBEFORE SHUFFLE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Collections.shuffle(arrl);
        
        System.out.println("\nAFTER SHUFFLE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // FILL
        // Show array's content before and after
        System.out.println("\nBEFORE FILL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Arrays.fill(arr,5);
        Collections.fill(arrl, 5);
        
        System.out.println("\nAFTER FILL");
        System.out.println("Array------------");
        for(Integer i:arr){System.out.print(i + ", ");}
        System.out.println("\nArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // BINARY-SEARCH        
        // If possitive, the number is found, if negative, it isn't
        System.out.println("\nBINARYSEARCH");
        System.out.println("Array------------");
        System.out.print(Arrays.binarySearch(arr, (int) (Math.round(Math.random()*10))));
        System.out.println("\nArrayList--------");
        System.out.print(Collections.binarySearch(arrl, (int) (Math.round(Math.random()*10))));
        
        System.out.println("");
        
        // AS-LIST
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\nARRAY CONVERTED INTO ARRAYLIST WITH ASLIST");
        for(Integer i:lista){System.out.print(i + ", ");}
        // Return the class to check the change
        System.out.println("\n" + lista.getClass());
        
        System.out.println("");
        
        // TO-ARRAY
        Integer[] array = new Integer[10];
        arrl.toArray(array);
        System.out.println("\nARRAYLIST CONVERT INTO ARRAY WITH TOARRAY");
        for(Integer i:lista){System.out.print(i + ", ");}
        // Return the class to check the change
        System.out.println("\n" + array.getClass());
        
        System.out.println("");
        
        // REVERSE
        // Replace collection's elements
        arrl.clear();
        for(int i = 0 ; i<=10;i++){
            arrl.add((int) (Math.round(Math.random()*10)));
        }
        System.out.println("\nBEFORE REVERSE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        Collections.reverse(arrl);
        
        System.out.println("\nAFTER REVERSE");
        System.out.println("ArrayList--------");
        for(Integer i:arrl){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // SPLIT
        // Initialize String and the array
        String cadenaJunta = "Element1/Element2/Element3";
        String[] arrCadenaSeparada = cadenaJunta.split("/");
        System.out.println("\nORIGINAL STRING");
        System.out.println(cadenaJunta);
        System.out.println("STRING CONVERT INTO ARRAY WITH SPLIT");
        for(String i:arrCadenaSeparada){System.out.print(i + ", ");}
        
        System.out.println("");
        
        // JOIN
        // Initialize the array and the String
        String[] arrCadenaJunta = {"Data1","Data2","Data3"};
        String cadenaSeparada = String.join("/", arrCadenaJunta);
        System.out.println("\nORIGINAL ARRAY");
        for(String i:arrCadenaJunta){System.out.print(i + ", ");}
        System.out.println("\nARRAY CONVERT INTO STRING WITH JOIN");
        System.out.println(cadenaSeparada);
        
        System.out.println("");
        
    }
}
