public class BinaryGap {

    public static void main(String[] args){
        System.out.println(Solution(9));
        System.out.println(Solution(529));
        System.out.println(Solution(20));
        System.out.println(Solution(1041));
        System.out.println(Solution(32));
    }

    public static int Solution(int N){

        int solution = 0;
        int zeroCounter = 0;

        char[] binaryNumber = Integer.toBinaryString(N).toCharArray();

        for(char element: binaryNumber){
            switch (element){
                case '0':
                    zeroCounter ++;
                    break;

                case '1':
                    if(zeroCounter > solution){
                        solution = zeroCounter;
                        zeroCounter = 0;
                    }
                    break;
            }
        }
        return solution;
    }
}

