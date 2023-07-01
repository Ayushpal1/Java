import java.util.Arrays;

class IntersectionArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,6,8,10};
        Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x)).distinct().forEach(System.out::println);
    }
}
