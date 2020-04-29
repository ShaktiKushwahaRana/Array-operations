/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperations;
import java .util.*;
/**
 *
 * @author HP
 */
public class ArrayOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("enter the length of the array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("ENter the values in an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
       int fr[] =new int[arr.length];
       int ar[]=new int[arr.length];
       int visited=-10;int counter;
       for(int i=0;i<n;i++){
           counter=1;
           for(int j=i+1;j<n;j++){
           if(arr[i]==arr[j]&& arr[i]!=visited){
           counter+=1;
           fr[i]=counter;
           fr[j]=visited;
           ar[i]=arr[i];
           arr[j]=visited;
           ar[j]=visited;
           }
           if(arr[i]!=arr[j]){
           ar[i]=arr[i];
           fr[i]=counter;}
           }
           
           
        }/*for(int l=0;l<n;l++){
         for(int h=1;h<n;h++){
          if(fr[l]<fr[h]){
           int temp=fr[h];int t=ar[h];
          fr[h]=fr[l];ar[h]=ar[l];
          fr[l]=temp;ar[l]=t;}}}*/
        System.out.println("output:");
       for(int k=0;k<arr.length;k++){
           
         if(fr[k]!=visited && ar[k]!=visited){
          System.out.println(ar[k]+" "+fr[k]);
            }
           }
       
    
    
    
    }
    
}
