public class OddOccuranceInArray {

    public static void main(String[] args){

        System.out.println(Solution(new int[]{9,3,9,3,9,7,9}));
        System.out.println(Solution(new int[]{10,10,10,5,10,10,10}));
        System.out.println(Solution(new int[]{1,2,2}));
        System.out.println(Solution(new int[]{8,1,1,1,1,1,1,1,1}));
        System.out.println(Solution(new int[]{1,1,1,1,1,1,1,1,77}));
    }

    public static int Solution(int[] A){
        int solution = 0;
        for(int i = 0; i < A.length; i++){
            solution = solution ^ A[i];
        }
        return solution;
    }
}
