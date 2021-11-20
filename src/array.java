public class array {
    public static void main(String[] args) {
        String[] arrayStr = new String[2];
        // make an array with alocating space with 2 length

        arrayStr[0] = "Pertama";
        arrayStr[1] = "Kedua";

        for(int i = 0 ; i < arrayStr.length; i++){
            System.out.println(arrayStr[i]);
        }

        int[] numbers = {1, 5, 2, 6, 10};

        // for(int i = 0; i < numbers.length; i++){
        //     for(int j = 0; j < numbers.length; j++){
        //         if(numbers[j] > numbers[j + 1]){
        //             int temp = numbers[j];
        //             numbers[j] = numbers[j+1];
        //             numbers[j+1] = temp;
        //         }
        //     }
        // }
        bubbleSort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.println("angka ke " + i + " adalah " + numbers[i]);
        }


        
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        
        }
           
    }

    
}
