//Ryan Staffen 
//CSE 002 Section 111
//HW 11 Matrix Sorter

//This program sorts array slabs with 3 5 and 7 columns and any slabs with the formula s+j+1
//IT uses two methods, one to show all arrays of the slab, and one to find the smallest entry in the array
//It uses both a selection sort and an insertion sort

import java.util.Scanner;

public class MatrixSorter{
    
    public static void main(String[] args){
            int mat3d[][][];
            mat3d=buildMat3d();
            show(mat3d);
            System.out.println("The smallest entry in the 3D matrix is "+
          			findMin(mat3d));
            System.out.println("After sorting the 3rd matrix we get");
            sort(mat3d[2]);
            show(mat3d);
    }
    
    public static int findMin(array x[][][]){
        
        
        // I honestly dont have very much in these programs,  I had a lot of other work to do, so id take any
        //points youd be willing to give me out of sympathy,  thanks! and Good luck on your finals
    }
}