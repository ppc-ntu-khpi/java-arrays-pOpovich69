package domain;

public class Exercise {
    public static int[] Calculate(int arrElem) {
        int[] arr = new int[arrElem];
        arr[arr.length/2] = 0;
        int j = 0;
        for(int i = (arr.length / 2); i >= 0; i--){
            arr[i] = j;
            j++;
        }
        j = 0;
        for(int i = (arr.length / 2); i < arr.length; i++){
            arr[i] = j;
            j++;
        }
        return arr;
    }
}
