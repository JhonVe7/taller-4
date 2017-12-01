#include <vector>
#include <string>
#include <sstream>
#include <iostream>
/*
*
*TALLER 4 - Data Estructure- N° 2
*	@author JhonVe7
*	@date 27-11-2017
*	@version 2
*
*/
 using namespace std;

 //Method InsertionSort
 void InsertionSort(int array[] , int Tm){ 

	 int pos;
	 int aux;

	 for (int i = 0; i < Tm; ++i) {

		 pos = i;
		 aux = array[i];

		 while((pos>0)&&(array[pos - 1] > aux)){

			 array[pos] = array[pos-1];
			 pos--;

		 }

		 array[pos] = aux;
	}

 }
//method to print array
  void Imprimir_Arreglo(int array[], int tam){ 
  	for(int i = 0 ; i < tam ; i++){
 		cout << "["<<array[i]<<"]";
	 }
  }
//Main method
 int main(){

	 	int x;
	  	string Cadena;
	    vector<int> vect;

	    cout <<"ingrese el tamaño del arreglo: " << endl;
	    cin >> x;
	    int Vector[x];
	    cout << "Digite la cadena de caracteres separado por comas: \n";
	    cin >> Cadena;
	    stringstream Separated(Cadena);

	    int i;

	    while (Separated >> i){
	         	 vect.push_back(i);
	         if (Separated.peek() == ',')
	        	 Separated.ignore();
	    }

	    int Tm = vect.size();
	    cout << "Tamaño del vector " << Tm << endl;
	    for (i=0; i< Tm; i++){

	     	Vector[i] = vect.at(i);

	    }

	    InsertionSort(Vector, Tm); //call method
	    cout << "El vector ordenado es " << endl;

	    Imprimir_Arreglo(Vector,x);//call method to print

	    system("PAUSE");
	    return 0;

 }
