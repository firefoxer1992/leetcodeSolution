package com.leetcode.array;


/**
 *  * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *  *
 *  * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *  *
 *  * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 *  *
 *  * Example 1:
 *  *
 *  * Input: [[1,1,0],[1,0,1],[0,0,0]]
 *  * Output: [[1,0,0],[0,1,0],[1,1,1]]
 *  * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 *  * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *  *
 *  * Example 2:
 *  *
 *  * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 *  * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *  * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 *  * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *  *
 */
public class LeetCode832 {
    public int[][] flipAndInvertImage(int[][] A) {

        if(A==null) {
            return A;
        }
        //A.length表示行数。A[i].length表示列数
        int  row=A.length;
        int column=A[0].length;
        for(int i=0;i<row;i++) {
            //二维数组的每一行上的数据对称互换。只需要遍历一半就可以了。
            for(int j=0;j<column/2 ;j++) {
                if( !(A[i][j]==1  || A[i][j]==0)  ) {
                   return  A;
                }
                int temp=A[i][j];
                A[i][j]=A[i][column-j-1];
                A[i][column-j-1]=temp;
            }
        }


        //取反。0变成1，1变成0.
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                if(A[i][j] ==1) {
                    A[i][j]=0 ;
                }else if(A[i][j] ==0) {
                    A[i][j]=1;
                }else {
                    return  A;
                }
            }
        }

         printArray(A);
         return A;
    }

    public void printArray(int A[][]){
        if(A==null) {
            return;
        }
        for(int i=0;i<A.length;i++) {
            for (int j=0;j<A[i].length;j++) {
                System.out.print(A[i][j]);
            }
            System.out.println("");
        }
    }


    public int changeNumber(int number){
        return  number==1? 0:1;
    }
}
