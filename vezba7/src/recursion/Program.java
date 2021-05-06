package recursion;

import java.math.BigInteger;
import java.util.Random;

public class Program {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static int sumN(int n){
        if(n == 0){
            return 0;
        }

        return n + sumN(n-1);
    }

    public static int sum(int[] array){
        return sumBinary(array, 0, array.length - 1);
    }

    public static int sum(int[] array, int n){
        if(n <= 0){
            return 0;
        }

        return array[n-1] + sum(array, n-1);
    }

    public static int sumBinary(int[] array, int low, int high){
        if(low > high){
            return 0;
        }

        if(low == high){
            return array[low];
        }

        int mid = (low+high)/2;
        return sumBinary(array, low, mid) + sumBinary(array, mid+1, high);
    }

    public static BigInteger powLoop(BigInteger x, long n){
        for (int i = 0; i < n; i++) {
            x = x.multiply(x);
        }
        return x;
    }

    public static BigInteger pow(BigInteger x, long n){
        if(n==0){
            return BigInteger.ONE;
        }

        if (n % 2 == 0){
            return pow(x, n/2).multiply(pow(x, n/2));
        }else{
            return x.multiply(pow(x, n/2).multiply(pow(x, n/2)));
        }
    }

    public static void testSum(){
        Random rnd = new Random();
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
        int x = sum(array);
        System.out.println(x);
    }

    public static void testPow(){
        BigInteger x1 = BigInteger.valueOf(12468).pow(1245);
        BigInteger x = pow(BigInteger.valueOf(12468), 1245);

        System.out.println(x);
        System.out.println(x1.equals(x));
    }


    public static int find(int[] array, int target){
        return binarySearch(array, target, 0, array.length-1);
    }

    public static int binarySearch(int[] array, int target, int low, int high){
        if(low > high){
            return -1;
        }

        int mid = (low + high)/2;

        if(array[mid] == target){
            return mid;
        }
        else if(array[mid] > target){
            return binarySearch(array, target, low, mid-1);
        }
        else{
            return binarySearch(array, target, mid+1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8};

        System.out.println(find(array, 1));
        System.out.println(find(array, 8));
        System.out.println(find(array, 3));
        System.out.println(find(array, 5));
    }
}
