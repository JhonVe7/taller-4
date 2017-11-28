#include <iostream>
#include <conio.h>
/*
*
*TALLER 4 - Estructura de Datos- punto 1
*	@author JhonVe7
*	@date 25-11-2017
*	@version 2
*
*/
using namespace std;

int main(){
//Define el tamaño del vector 
    int n, temp;
cout<<" Ingrese el tamaño del vector "<<endl;    
cin >> n;
int vector[n];
cout<<" Ingrese los numeros a ordenar "<<endl;
   for(int i=0;i<n;i++){
      cin>>vector[i];
      cout<<i+1<<" -> ";
      cout<<endl;
   }
}
// metodo de intecambio por medio de un aux
for(int i=0;i<n;i++){
   for(j=i+1;j<n;j++){
           if(vector[j]<vector[i]){
               temp=vector[j];
               vector[j]=vector[i];
               vector[i]=temp;
           }
       }
   }
// imprime los numeros del vector
 for(i=0;i<n;i++){
       cout<<vector[i]<<" ";
   }
   return 0;
}

