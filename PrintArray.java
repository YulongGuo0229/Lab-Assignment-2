public class PrintArray {
    public static int printArray(int[] array,int value){
        for(int i = 0;i<array.length;i++){
            if(array[i]==value){
                return i;//For this function, I use for loop to find the indices of value in original array and return indices.
            }
        }
        return -1;//return -1 if array[i] is not equal to value.
    }
}
