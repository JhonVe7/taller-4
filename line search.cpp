#include <iostream>
#include <cstdlib>
/*
*
*TALLER 4 - Data Estructure- N° 5
*	@author JhonVe7
*	@date 25-11-2017
*	@version 2
*
*/
 using namespace std;
// method lineaSearch
 int linearSearch(int array[],int tam, int valor){
 	for(int i = 0 ; i < tam ; i++){
 		if(valor == array [i]){
		 return i ;
		 }
	 }
	return -1;
 }
  int arreglo(int array[], int tam){
  	for(int i = 0 ; i < tam ; i++){
 		cout <<" ["<<array[i]<<"] \n";
	 }
  }
 // application of the method
 int main (){
 	
 	int x;
 	int y;
 	cout <<"ingrese el tamaño del arreglo: " << endl;
 	cin >> x;
 	cout <<"ingrese numero que desea buscar: " << endl;
 	cin >> y;
 	
 	int a[] = {1+ rand()% 50};
	int result = linearSearch(a,x,y);
		
	arreglo(a,x);
	
 	if(result >= 0){
 		cout << "El numero " << a[result]<< " se encontro"
		 " en el indice " << result << endl;
	 }
	 else{
	 	cout << "El numero " << y <<" no se encontro. "<< endl;
	 }
 }
