import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/*
*
*TALLER 4 - Estructura de Datos- punto 3
*	@author JhonVe7
*	@date 25-11-2017
*	@version 4
*
*/


public class merge{
	
//Metodo para imprimir el arreglo
public static void imprimir(int[] array){
	for (int i = 0; i < array.length; i++) {
	    System.out.print("[" + array[i] + "]");
	 }
}

//Metodo 
public static void MergeSort(int a[]){
   if(vec.length<=1) return;
     int mitad= a.length/2;
     int izq[]=Arrays.copyOfRange(a, 0, mitad);
     int der[]=Arrays.copyOfRange(a, mitad, a.length);
          MergeSort(izq);
          MergeSort(der);       
          combinar(a, izq, der);
  }
  //metodo
  public static void combinar(int a[], int izq[],int der[]){
          int x=0;
          int y=0;
          for(int i=0;i<a.length;i++){
                  if(x>=izq.length){
                          a[i]=der[y];
                          y++;
                          continue;
                  }
                  if(y>=der.length){
                          a[i]=izq[x];
                          x++;
                          continue;
                  }
                  if(izq[x]<der[y]){
                          a[i]=izq[x];
                          x++;
                  }else{
                          a[i]=der[y];
                          y++;
                  }
          }
  }
// main, inicio del programa
  public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	merge c = new merge() ;
	System.out.println("\n"+"Metodo Merge Sort")	
	bw.write("escriba el tamaño del arreglo \n");
	bw.flush();	
	int x = Integer.parseInt(br.readLine());
	bw.write("escriba los numeros separados por comas (,) \n");
	bw.flush();

	String a= br.readLine();
		String [] Particion = a.split(",");
		int array [] = new int [x]; 
	
	for (int i = 0; i < array.length; i++) {
		  array[i]=Integer.parseInt(Particion[i]);
	}
		
		;
		c.imprimir(array);
		c.MergeSort(array);
		c.imprimir(array);
		
  }

}

