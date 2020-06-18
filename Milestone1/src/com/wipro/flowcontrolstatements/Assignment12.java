package com.wipro.flowcontrolstatements;

public class Assignment12 {
public static void main(String[] args){
        int n=29;
        boolean flag=false;
        for(int i=2;i<n/2;++i)
        {
        if(n % i==0)
        {
                flag=true;
                break;
        }
}
if(!flag)
        {
                System.out.println(n+ " is a Prime number");
        }
        else{
                System.out.println(n+ " is not a prime number");
        }
 }
}
