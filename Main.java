import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input an unsorted array. Use 'Space' to split the numbers.");
        Scanner scanner1=new Scanner(System.in);
        String str=scanner1.nextLine();//Scan all chars from User's keyboard.
        String[] arr=str.split(" ");//Remove all the Spaces and turn str into Arrays.
        int[] a=new int[arr.length];//Initialize Array a
        for(int i=0; i<a.length;i++)
        {
            a[i] = Integer.parseInt(arr[i]);//Turn string into int
        }
        System.out.println("Please input a target.");
        Scanner scanner2 = new Scanner(System.in);
        int t=scanner2.nextInt();

        TwoSum ts=new TwoSum();
        ts.twoSum(a, t);
    }

}
