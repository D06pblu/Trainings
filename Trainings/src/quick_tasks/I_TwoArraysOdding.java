package quick_tasks;

import java.util.Arrays;

/*
два массива, отсортированных по возрастанию, надо объединить в один, тоже отсортированный по возрастанию, но чтобы эта
сортировка делалась на этапе объединения, а не потом
[0,2,2,5,7] & [1,3,4,6,8]
 */
public class I_TwoArraysOdding {
    static int[] a = {0,2,3, 6, 7,10,15};
    static int[] b = {1,3,4};

    public static int[] arraysOdding(int[] a, int[] b) {
        int aIndex = 0;
        int bIndex = 0;
        int[] result = new int[a.length + b.length];

        for (int i=0; i<=result.length; i++) {
            if (aIndex<a.length && bIndex<b.length){
                if ( a[aIndex] <= b[bIndex]) {
                    result[i] = a[aIndex];
                    aIndex++;
                }
                else {
                    result[i] = b[bIndex];
                    bIndex++;
                }
            }
            else if (aIndex<a.length){
                result[i] = a[aIndex];
                aIndex++;
            }
            else if (bIndex<b.length){
                result[i] = b[bIndex];
                bIndex++;
            }

        }
        return result;
    }

//    public static int[] mergeArrays(int[] a1, int[] a2) {
//        int [] resultArr = new int[(a1.length) + (a2.length)];
//        int loopCount = 0;
//        int a1Count = 0;
//        int a2Count = 0;
//
//
//        while (loopCount < resultArr.length){
//            if (a1[a1Count] < a2[a2Count]){
//                loopCount++;
//                resultArr[loopCount] = a1[a1Count];
//                a1Count++;
//            } else {
//                resultArr[loopCount] = a2[a2Count];
//                loopCount++;
//                a2Count++;
//            }
//        }
//        return resultArr;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraysOdding(a, b)));
    }
}
