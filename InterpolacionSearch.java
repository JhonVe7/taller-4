import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Interpolacion {
	 
	public static void imprimeArray(int[] array){
		for (int i = 0; i < array.length; i++) {
	            System.out.print("[" + array[i] + "]");
	        }
	    }
	
	public static int BusquedaInterpolacion(int []vector, int buscar){
		int lowerBound = 0;
		int upperBound = vector.length - 1;
		int index = -1;
		int higherBound = vector.length-1;
		while (lowerBound < buscar && buscar < upperBound){
			
			int middlePoint  = lowerBound + ((higherBound - lowerBound)/(vector[higherBound]-vector[lowerBound]))
					* (buscar - vector[lowerBound]) ;
			
			if (buscar== vector[middlePoint]) 
				return middlePoint;
			
			if (vector[middlePoint] < buscar)
				lowerBound = middlePoint + 1;
			
			else
				higherBound= middlePoint -1;
			
	}
		return -1;
}



 public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));		
	
	Interpolacion c = new Interpolacion() ;
				
	bw.write("escriba el tamaño del arreglo");
	bw.flush();	
	int T = Integer.parseInt(br.readLine());
				
	bw.write("escriba los numeros del arreglo, recuerde que deben ir separados por comas (,) \n");
	bw.flush();
	String Arreglo= br.readLine();
	
	String [] Particion = Arreglo.split(",");
	int array [] = new int [T]; 
	
	bw.write("escriba el numero que desea buscar");
	bw.flush();	
	int buscar = Integer.parseInt(br.readLine());
			
	for (int i = 0; i < array.length; i++) {
	  array[i]=Integer.parseInt(Particion[i]);
	}
	int index= BusquedaInterpolacion(array, buscar);			
	c.imprimeArray(array);
	System.out.println("\n"+"Busqueda por Interpolación");

	System.out.println("es numero se encuentra en la posición o indice numero: "+index);
    
				
	  }
}




















import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Interpolacion {
	 

	
 static int BusquedaInterpolacion(int x, int []arr) {
	 int lowerBound = 0;
	 int higherBound = (arr.length - 1);
	 while (lowerBound <= higherBound && x >= arr[lowerBound] && x <= arr[higherBound]){
		 int middle = lowerBound + (((higherBound-lowerBound) /(arr[higherBound]-arr[lowerBound]))*(x - arr[lowerBound]));
		 if (arr[middle] == x)
	      return middle;
		 
		 if (arr[middle] < x)
			 lowerBound = middle + 1;
	      else
	    	  
	    	  higherBound = middle - 1;
	        }
	        return -1;
	    }



 public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));		
	
	Interpolacion c = new Interpolacion() ;
				
	bw.write("escriba el tamaño del arreglo");
	bw.flush();	
	int T = Integer.parseInt(br.readLine());
				
	bw.write("escriba los numeros del arreglo, recuerde que deben ir separados por comas (,) \n");
	bw.flush();
	String Arreglo= br.readLine();
	
	String [] Particion = Arreglo.split(",");
	int array [] = new int [T]; 
	for (int i = 0; i < array.length; i++) {
		  arrimport java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Interpolacion {
	 
	public static void imprimeArray(int[] array){
		for (int i = 0; i < array.length; i++) {
	            System.out.print("[" + array[i] + "]");
	        }
	    }
	
	public static int BusquedaInterpolacion(int []vector, int buscar){
		int lowerBound = 0;
		int upperBound = vector.length - 1;
		int index = -1;
		int higherBound = vector.length-1;
		while (lowerBound < buscar && buscar < upperBound){
			
			int middlePoint  = lowerBound + ((higherBound - lowerBound)/(vector[higherBound]-vector[lowerBound]))
					* (buscar - vector[lowerBound]) ;
			
			if (buscar== vector[middlePoint]) 
				return middlePoint;
			
			if (vector[middlePoint] < buscar)
				lowerBound = middlePoint + 1;
			
			else
				higherBound= middlePoint -1;
			
	}
		return -1;
}



 public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));		
	
	Interpolacion c = new Interpolacion() ;
				
	bw.write("escriba el tamaño del arreglo");
	bw.flush();	
	int T = Integer.parseInt(br.readLine());
				
	bw.write("escriba los numeros del arreglo, recuerde que deben ir separados por comas (,) \n");
	bw.flush();
	String Arreglo= br.readLine();
	
	String [] Particion = Arreglo.split(",");
	int array [] = new int [T]; 
	
	bw.write("escriba el numero que desea buscar");
	bw.flush();	
	int buscar = Integer.parseInt(br.readLine());
			
	for (int i = 0; i < array.length; i++) {
	  array[i]=Integer.parseInt(Particion[i]);
	}
	int index= BusquedaInterpolacion(array, buscar);			
	c.imprimeArray(array);
	System.out.println("\n"+"Busqueda por Interpolación");

	System.out.println("es numero se encuentra en la posición o indice numero: "+index);
    
				
	  }
}ay[i]=Integer.parseInt(Particion[i]);
		  System.out.print("["+array[i]+"]");
		}
	
	bw.write("\nEscriba el numero que desea buscar");
	bw.flush();	
	int buscar = Integer.parseInt(br.readLine());
			
	int index= BusquedaInterpolacion(buscar, array);			
	
	System.out.print("\n"+"Busqueda por Interpolación \n");
	
	if (index != -1) 
		System.out.println("es numero se encuentra en la posición o indice numero: "+index);
	
	else
	System.out.println("el numero no se encuentra dentro del arreglo");
    
				
	  }
}


