/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
/**
 *
 * @author julio
 */
public class JavaApplication1 {
    
     public  int resultado =0;
     int numrev;
     int []num =new int[10];
    int num2;
           int i=0; 
           10 l 
     public int reversa(int num1){
         while( num1>0){
            num2=num1%10;
            num[i]=num2;
            i++;
            num1=num1/10;
             }
         if(num[4]!=0){
           int numrev= num[0]*1000 +(num[1]*100)+ num[2]*10;
         }
         int numrev= num[0]*100 +(num[1]*10)+ num[2]*1;
             
         
        return numrev; 
     }
     
     
     
     
     
 
    
    public int[] primos(int n, String h){
        int []arreglo =new int[100];
          boolean band=false;
        
       for(int a=2;a<n;a++){		
	for(int x=2;x<a-1;x++){
		if(a%x==0 ){
            band= true;
            
        }}
                if(band==false){
                   System.out.println(a);
                   //a%10=n ;
                    arreglo[a-2]=a;
                }
                
         band=false;
        
	}
           
           
         return arreglo; 
        }
        
    static int suma(int a, int b){
    
    return a+b;
    
    }
    
          public static void main(String[] args) {
              
              JavaApplication1 w = new JavaApplication1();
              
              
  
              
               System.out.println("Antes de ejecutar funcion : "+w.resultado);
         int [] p = w.primos( 20, "Hola mundo");  
        
             for(int b=0;b<w.resultado;b++){
                 
              System.out.println(p[b]);
             }
            System.out.println("Numero al reves : "+ w.reversa(1234));
        }
    }
   
        
         
    
    

