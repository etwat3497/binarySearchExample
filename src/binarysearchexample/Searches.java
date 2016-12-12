/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchexample;

/**
 *
 * @author etwat3497
 */
public class Searches {
    
    public static int binarySearch(int[] items, int start, int end, int goal){
        
        if(start>end){
            return(-1);
        }
        else{
            int mid = (start+end)/2;
            
            if(goal==items[mid]){
                return mid;
            }
            else if(goal<items[mid]){
                return(binarySearch(items, start, mid-1, goal));
            }
            else{
                return(binarySearch(items, mid+1, end, goal));     
            }
                    
        }
    }
}   

