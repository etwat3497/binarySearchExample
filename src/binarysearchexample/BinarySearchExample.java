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
public class BinarySearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] sortedArray = {1,5,15,35,99,104,263};
        
        int searchNum = 263;
        int location = Searches.binarySearch(sortedArray, 0, sortedArray.length-1, searchNum);
        
        for(int i=0; i<sortedArray.length;i++){
            System.out.println(sortedArray[i]);
        }
        System.out.println("The item is at location "+location);
        
    }
    
}
