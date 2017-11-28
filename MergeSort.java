import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
/*
*
*TALLER 3 - Estructura de Datos- punto 3
*	@author :P
*	@date 25-11-2017
*	@version 2
*
*/


public class merge{
	
	 public static void imprimir(int[] array){
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("[" + array[i] + "]");
	        }
	    }

	 
	  public static void MergeSort(int vec[]){
          if(vec.length<=1) return;
          int mitad= vec.length/2;
          int izq[]=Arrays.copyOfRange(vec, 0, mitad);
          int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
          ordenacionMergeSort(izq);
          ordenacionMergeSort(der);       
          combinarVector(vec, izq, der);
  }
  
  public static void combinar(int v[], int izq[],int der[]){
          int i=0;
          int j=0;
          for(int k=0;k<v.length;k++){
                  if(i>=izq.length){
                          v[k]=der[j];
                          j++;
                          continue;
                  }
                  if(j>=der.length){
                          v[k]=izq[i];
                          i++;
                          continue;
                  }
                  if(izq[i]<der[j]){
                          v[k]=izq[i];
                          i++;
                  }else{
                          v[k]=der[j];
                          j++;
                  }
          }
  }
  public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	merge c = new merge() ;
		
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
		
		System.out.println("\n"+"Metodo Merge Sort");
		c.imprimir(array);
		c.MergeSort(array);
		c.imprimir(array);
		

	
  }

}

