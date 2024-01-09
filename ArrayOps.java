public class ArrayOps {
    public static void main(String[] args) {
        int[] arr2 = new int[] {7, 5, 4, 3, -12};
        int[] arr1 = new int[]{1,2,3};

        System.out.println(findMissingInt(arr1));
        System.out.println(secondMaxValue(arr1));

        // System.out.println(containsTheSameElements(arr1, arr2));
        //System.out.println(isSorted(arr2));

    }
    
    public static int findMissingInt (int [] array) {

        // init variable holds if the missing value was found
        boolean has_missing_found = false;

        // the value of the missing value
        int missing_val = -1;

        // for every possible value 0 <= i <= array.length
        for (int i = 0; i <= array.length && !has_missing_found; i++) {

            // init a variable that holds the index of the current value in the array
            int j = 0;

            // go to the next index if the value wasnt found and it didnt finish search
            while(j < array.length && array[j] != i) {
                j++;
            }

            // if finished searching and the value wasnt found
            if (j == array.length) {

                // update that the value was found
                has_missing_found = true;

                // update the value of the missing value
                missing_val = i;
            }

        }

        // return the missing value
        return missing_val;
    }

    public static int secondMaxValue(int [] array) {

        // init the first max from the first 2 elements
        int max = Math.max(array[0],array[1]);

        // init the first max from the first 2 elements
        int second_max = Math.min(array[0], array[1]);

        // from the second element to the end of the array
        for (int i = 1; i < array.length; i++) {

            // check if there is new max
            if (array[i] >= max){

                // update the new max and the second max value
                second_max = max;
                max = array[i];
            }
        }

        // return the second max
        return second_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {


        // ceck if all the elements in array 1 are in array 2
        for (int i = 0; i < array1.length; i++) {

            // set value that the current element wasnt found in the second array
            boolean has_found = false;

            // check if the current element of array 1 is in array 2
            for (int j = 0; j < array2.length && !has_found; j++) {

                // check the values of the elements
                if (array1[i] == array2[j]){

                    // update that the current value was found
                    has_found = true;
                }
            }

            // return false if one of the elements isnt at the second array
            if (has_found == false){
                return has_found;
            }

            // reset the value for the next element
            has_found = false;

        }


        // check if every value of the second array is at the first one
        for (int i = 0; i < array2.length; i++) {

            // set value that the current element wasnt found in the second array
            boolean has_found = false;

            // check if the current element of array 2 is in array 1
            for (int j = 0; j < array1.length && !has_found; j++) {

                // check the values of the elements
                if (array2[i] == array1[j]){

                    // update that the current value was found
                    has_found = true;
                }
            }

            // return false if one of the elements isnt at the second array
            if (has_found == false){
                return has_found;
            }

            // reset the value for the next element
            has_found = false;

        }

        // all the elements of array 2 are in array 1
        return true;
    }

    public static boolean isSorted(int [] array) {

        // the array is sortes when it has 1 element
        if (array.length == 1){
            return true;
        }

        // check if the array should be increasing or decreasing by the first 2 elements
        // set the value if increasing or decreasing
        boolean is_increasing = true;
        if (array[1] < array[0]) {
            is_increasing = false;
        }

        // check for increasing array
        for (int i = 1; i < array.length && is_increasing; i++) {

            // when it isnt increasing
            if (array[i] < array[i-1]){
                // not sorted
                return false;
            }
        }

        // the array is increasingly sorted
        if (is_increasing == true) {
            return true;
        }

        // check for decreasing array
        for (int i = 1; i < array.length; i++) {

            // return false if the array isn't decreasingly sorted
            if (array[i] > array[i-1]){
                return false;
            }
        }

        // the array is decreasingle sorted
        return true;
    }

}
