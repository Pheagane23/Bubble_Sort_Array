/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort_array;
//an array thats going to sort the values 2 values at a time.Starting from left to right (0-0<)//
/**
 *
 * @author Phea
 */
public class BubbleSort_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The logic is going to be contained in a "for" and "if" statements
        int number[] = {4,2,3,9,5}; //array decleration //
                      //0,1,2,3 ,4//
         int temp;
         boolean fixed = false;
         while(fixed==false){
          fixed=true;   
       
        for(int i=0; i< number.length-1; i++){
       
            if(number[i]>number[i+1]){
             //if 4    >      2
             temp = number[i+1];
               // store 4 in temp
               number[i+1]= number[i];
               //put 4 in 2's place//
               number[i]= temp;
              fixed = false; 
            
        }
    }
    
}
         for(int i=0; i< number.length; i++){
             System.out.println(number[i]);
         }
    }
}
