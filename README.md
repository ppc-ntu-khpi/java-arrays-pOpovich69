## Завдання
2) Заповнити масив довільного розміру числами в порядку зростання, починаючи з центру масиву, наприклад, [5,4,3,2,1,0,1,2,3,4,5]

## Клас TestResult
```java

package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] Array = Exercise.Calculate(7);
        for (int item: Array) {
            System.out.print(item + " ");
        }   
    }
}
```
## Клас Exercise в якому метод Calculate для виконання завдання
```java
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
```
## Результат виконання програми
![](https://github.com/ppc-ntu-khpi/java-arrays-pOpovich69/blob/master/img/done.png)
