class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] arr = new int[num1.length + num2.length];
        for (int i=0; i < num1.length; i++){
            arr[i] = num1[i];
        }
        for (int i=0; i < num2.length; i++){
            arr[num1.length+i] = num2[i];
        }
        int len = arr.length;
        Arrays.sort(arr);
        if(len%2 == 0){
            return (arr[len/2] + arr[len/2 -1])/2.0;
        }
        else{
            return arr[len/2];
        }
    }
}
