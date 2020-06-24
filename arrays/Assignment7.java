package com.wipro.arrays;

class Assignment7 {
public static void main(String[] args) 
{
  int[] array= {1,22,3,3,4,9,10,20,30,8,2,8};
  
  int len = array.length;  //length

   int[] temp = new int[len];   //temporary array

        int j = 0;   //array length after removing 

        for (int i=0; i<len-1; i++)
 {  
            if (array[i] != array[i+1])
 
            {  
                temp[j++] = array[i];   //storing in temp
             }  
         }  
        
 temp[j++] = array[len-1];     
          
        for (int i=0; i<j; i++)  //modifying original array
 {  
            array[i] = temp[i];  
        }  
      
 for(int i=0;i<j-1 ;i++) 
 {
        System.out.print(array[i]+ "\t" ); //printing new array after removing
       }
}

}