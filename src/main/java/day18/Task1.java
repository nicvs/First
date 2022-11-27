package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {402, -50, -249, 215, 665, 311};

        System.out.println(recursionSum(numbers,numbers.length));

    }
    public static int recursionSum(int[] numbers, int length){
        if (length-1 < 0){
            return 0;
        }
        return numbers[length-1]+recursionSum(numbers,length-1);
    }
}
