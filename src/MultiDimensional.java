public class MultiDimensional {
    public static void main(String[] args) {
        int[] oneDimensionalArray = {12, 49, 922};
        System.out.println(oneDimensionalArray[1]);

        int[][] multiDimension = {
            {12, 49, 922},
            {23, 56, 78, 12},
            {12, 35, 33}
        };

        System.out.println(multiDimension[0][2]);

        double[][] array = new double[4][2];

        array[3][1] = 2.6;
        System.out.println(array[3][1]);

        for(int i =0 ; i < multiDimension.length; i++){
            for(int j = 0; j < multiDimension[i].length; j++){
                if(multiDimension[i][j] % 2 == 0){
                    System.out.print("1" + "\t");
                }else {
                    System.out.print("0" + "\t");
                }
                
            }
            System.out.println();
        }
    }
}
