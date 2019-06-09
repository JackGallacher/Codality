public class CyclicRotation {
    public static void main(String[] args){

        for(int i: Solution(new int[]{3,8,9,7,6}, 3)){
            System.out.println(i);
        }
    }

    public static int[] Solution(int[] A, int K){

        for(int i = 0; i <= K; i++){
            for(int j = A.length -1 ; j > 0; j--){
               int temp = A[j];
               A[j] = A[j - 1];
               A[j - 1] = temp;
            }
        }
        return A;
    }
}
