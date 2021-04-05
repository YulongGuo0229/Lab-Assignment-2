import java.util.Arrays;


public class TwoSum {
    void twoSum(int[] sums,int sum) {
        int s;
        int flag = 0;

        int[] arr = new int[sums.length];
        for (int i = 0; i < sums.length; i++)//Set a new array as the copy of original array.
            arr[i] = sums[i];

        Arrays.sort(sums);

        int x = 0, y = 0;
        if (sums[0] + sums[1] <= sum && sums[sums.length - 1] + sums[sums.length - 2] >= sum)
            OuterLoop:for (int i = 0; i < sums.length - 1; i++) {
                for (int j = i + 1; j < sums.length; j++) {
                    s = sums[i] + sums[j];
                    if (sum == s) {
                        x = sums[i];
                        y = sums[j];
                        flag = 1;
                        break OuterLoop;
                    }
                }
            }
        else {
            flag = 2;
            System.out.println("The output should be -1. Because the sum of two smallest numbers are bigger than target or the sum of two biggest numbers are smaller than target.");
        }


        if (flag == 0)
            System.out.println("The output should be -1. Because num is not allowed to be used twice.");


        if (flag == 1) {
            int index1 = PrintArray.printArray(arr, x);//Find the target value in original array (unsorted array).
            int index2 = PrintArray.printArray(arr, y);
            s = x + y;
            if (index1 == index2) {
                int index3 = 0;
                for (int j = index1; j < arr.length; j++) {
                    if (arr[j] == y) {
                        index3 = j;
                    }
                }
                System.out.println("The output should be [" + index1 + "," + index3 + "]. Because nums[" + index1 + "]+nums[" + index3 + "]=" + x + "+" + y + "=" + s);
            } else {
                System.out.println("The output should be [" + index1 + "," + index2 + "]. Because nums[" + index1 + "]+nums[" + index2 + "]=" + x + "+" + y + "=" + s);
            }
        }
    }
}