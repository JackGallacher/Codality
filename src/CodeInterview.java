import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class CodeInterview {

    public static void main(String[] args){
        System.out.println(Solution(new int[]{6,10,1,2,6,6, 7}));
    }

    public static int Solution(int[] A){


        //int[] difference = new int[A.length - 1];

        /*for(int i = 0; i < A.length; i++){
            difference[i] = A[i + 1] - A[i];
        }*/



        /*for(int i = 0; i < A.length - 1; i++){
            difference = A[i + 1] - A[i];
            System.out.println(difference);
        }*/

        Arrays.sort(A);

        int quasiConstantCount = 0;
        int solution = 0;
        int difference = 0;
        int previousValue = 0;
        int differenceCount = 0;

        for(int currentValue : A[1, A.length]){
            difference = currentValue - previousValue;
            previousValue = currentValue;


            if(difference < 2){
                quasiConstantCount ++;
                differenceCount += difference;
                if(differenceCount < 2){
                    solution = quasiConstantCount;
                }
            }
            else{
                quasiConstantCount = 0;
                differenceCount = 0;
            }

        }
        return solution + 1;
    }



    /*public static int Solution(int N){

        int solution;

        String intAsString = Integer.toString(N);
        Integer[] solutionArray = new Integer[intAsString.length()];
        StringBuilder solutionArrayAsString = new StringBuilder();

        for(int i = 0; i < intAsString.length(); i++){
            solutionArray[i] = intAsString.charAt(i) - '0';
        }
        Arrays.sort(solutionArray, Collections.reverseOrder());
        for(int i : solutionArray){
            solutionArrayAsString.append(i);
        }

        solution = Integer.parseInt(solutionArrayAsString.toString());
        return solution;
    }*/

    /*public static int Solution(Tree binaryTree){
        return returnVisibleNodes(binaryTree, 0);
    }

    public static int returnVisibleNodes(Tree binaryTree, int currentMax){

        int solution = 0;

        if(binaryTree == null){
            return 0;
        }

        if(binaryTree.x >= currentMax){
            solution = 1;
            currentMax = binaryTree.x;
        }

        return solution + returnVisibleNodes(binaryTree.l, currentMax) + returnVisibleNodes(binaryTree.r, currentMax);

    }*/




}
