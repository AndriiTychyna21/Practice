public class Task {
    public static int[][] Summary(int[][] ar1, int[][] ar2){              //A method that calculates the sum of matrices (Also returns a matrix)
        int[][] result = new int[3][3];                                   //We create the resulting matrix, which we will return later
        for (int i=0; i<result.length; i++){                              //A loop that iterates through the matrix row by row
            for (int  j=0; j<result[i].length; j++){                      //A loop that iterates through the matrix column by column
                result[i][j] = ar1[i][j] + ar2[i][j];                     //We add the elements of the matrices located in the same places; we write the sum to the result in the same place
            }
        }
        return result;                                                    //Returning the result
    }

    public static void ShowResult(int[][] ar){                            //A method that displays the matrix on the screen
        for (int i=0; i<ar.length; i++){                                  //A loop that iterates through the matrix row by row
            for (int  j=0; j<ar[i].length; j++){                          //A loop that iterates through the matrix column by column
                System.out.print(ar[i][j] + " ");                         //We display the element, create a space between them
            }
            System.out.println();                                         //Output of the line is finished, transfer the output to the next line
        }
    }                                                                     //No "return" because of void method

    public static int SumOfElements(int[][] ar){                          //The which method calculates the sum of all elements in the matrix
        int sum = 0;                                                      //We create a counter that will add each element in turn. At the beginning, it is equal to 0, because we have not yet counted any element
        for (int i=0; i<ar.length; i++){                                  //A loop that iterates through the matrix row by row
            for (int  j=0; j<ar[i].length; j++){                          //A loop that iterates through the matrix column by column
                sum += ar[i][j];                                          //We add an element to the counter ("sum += ar[i][j];" is equal to "sum = sum + ar[i][j];")
            }
        }
        return sum;                                                       //return the counter
    }

    public static void main(String[] args) {
        int[][] array1={{1, 2, 3},                                        //We declare and initialize two matrices
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] array2={{5, 7, 9},
                {11, -5, 3},
                {17, 5, 11}
        };
        int [][] result = Summary(array1, array2);                        //We declare another matrix, initialize it with the result of the method, that summing our two previous matrices
        ShowResult(result);                                               //We show the result on the screen
        System.out.println(SumOfElements(result));                        //Method SumOfElements returns an integer, which means it can be printed using System.out.println()
    }
}
