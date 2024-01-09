public class ArrayOps {
    public static void main(String[] args) {
        int[] arr2 = new int[] {7, 5, 4, 3, -12};
        int[] arr1 = new int[]{2,8,3,7,8};

        //System.out.println(findMissingInt(intArray));
        System.out.println(secondMaxValue(arr1));

        // System.out.println(containsTheSameElements(arr1, arr2));
        //System.out.println(isSorted(arr2));

    }
    
    public static int findMissingInt (int [] array) {
        boolean has_missing_found = false;
        int missing_val = -1;
        for (int i = 1; i <= array.length && !has_missing_found; i++) {
            int j = 0;
            while(j < array.length && array[j] != i) {
                j++;
            }

            if (j == array.length) {
                has_missing_found = true;
                missing_val = i;
            }

        }
        return missing_val;
    }

    public static int secondMaxValue(int [] array) {
        int max = Math.max(array[0],array[1]);
        int second_max = Math.min(array[0], array[1]);

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max){
                second_max = max;
                max = array[i];
            }
        }

        return second_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {

        for (int i = 0; i < array1.length; i++) {
            boolean has_found = false;

            for (int j = 0; j < array2.length && !has_found; j++) {
                if (array1[i] == array2[j]){
                    has_found = true;
                }
            }

            if (has_found == false){
                return has_found;
            }

            has_found = false;

        }

        for (int i = 0; i < array2.length; i++) {
            boolean has_found = false;

            for (int j = 0; j < array1.length && !has_found; j++) {
                if (array2[i] == array1[j]){
                    has_found = true;
                }
            }

            if (has_found == false){
                return has_found;
            }

            has_found = false;

        }
        return true;
    }

    public static boolean isSorted(int [] array) {

        if (array.length == 1){
            return true;
        }

        boolean is_increasing = true;
        if (array[1] < array[0]) {
            is_increasing = false;
        }

        for (int i = 1; i < array.length && is_increasing; i++) {
            if (array[i] < array[i-1]){
                return false;
            }
        }

        if (is_increasing == true) {
            return true;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]){
                return false;
            }
        }

        return true;
    }

}
