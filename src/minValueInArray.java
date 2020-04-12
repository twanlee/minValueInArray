public class minValueInArray {
    public static int minValueInArray (int[] array){
        int min = array[0];
        for( int i=0; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("The min in array value is: " + minValueInArray(arr));
    }
}
