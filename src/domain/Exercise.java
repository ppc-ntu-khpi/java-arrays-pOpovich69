package domain;

public class Exercise {
    //Метод який повертає оброблений масив
    public static int[] Calculate(int quantityElements) {
        int[] arr = new int[quantityElements];
        arr[arr.length/2] = 0; //Елемент по середені дорівнює 0
        int j = 0;
        //Пробігає по першій половині масиву
        for(int i = (arr.length / 2); i >= 0; i--){
            arr[i] = j;
            j++;
        }
        j = 0;
        //Пробігає другу половину масиву
        for(int i = (arr.length / 2); i < arr.length; i++){
            arr[i] = j;
            j++;
        }
        return arr;
    }
}
