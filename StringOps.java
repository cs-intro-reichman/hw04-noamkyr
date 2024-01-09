public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.println(camelCase(" Intro to coMPUter sCIEncE "));
        int [] a = allIndexOf("Hello World",'l');

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        System.out.println(camelCase("     Intro to coMPUter sCIEncE     "));
        System.out.println(capVowelsLowRest("One two tHRee world"));

    }

    public static String capVowelsLowRest (String string) {
        // init the string of the result
        String opposite = "";

        // string with all the small voules
        String vowels = "aeoui";

        // string with all the capital vo
        String capital_vowels = "AOUEI";

        // check every letter in the string
        for (int i = 0; i < string.length(); i++) {

            // the value of the current char
            char current = string.charAt(i);

            // check if from the abc
            if ((current >= 'a' && current <= 'z') || (current >= 'A' && current <= 'Z')){

                // check if small vowel
                if (vowels.indexOf(current) != -1){
                    if (current >= 'a' && current <= 'z'){
                        // make capital value
                        current -= 32;
                   }
                } else {
                    // make all the capital letters small if not vowels
                    if (current >= 'A' && current <= 'Z' && capital_vowels.indexOf(current) == -1){
                        current += 32;
                    }
                }
            }
            // add the current letter to the new stirng
            opposite += current;
        }

        // return the result
        return opposite;
    }

    public static String camelCase (String string) {

        // set the value of the new string
        String new_string = "";

        // count number of words, set 0
        int count_word = 0;

        // for enery letter in the string
        for (int i = 0; i < string.length(); i++) {

            // the value of the current letter
            char current = string.charAt(i);

            // check for all the not space letters
            if (current != ' ') {

                // check if is a start of a new word
                if (i == 0 || string.charAt(i-1) == ' '){
                    count_word ++;

                    // make small letter if the first letter in the first word
                    if (current >= 'A' && current <= 'Z' && count_word == 1){
                        current += 32;
                    }

                    // update in case of first in a new word and it is not big
                    if (current >= 'a' && current <= 'z' && count_word > 1){
                        current -= 32;
                    }

                } else {

                    // make all the letter small in the first word
                    if (count_word == 1){
                        if (current >= 'A' && current <= 'Z'){
                            current += 32;
                        }
                    }


                    if (current >= 'A' && current <= 'Z'){
                        current += 32;
                    }
                }

                // add the current letter to the string
                new_string += current;

            }


        }

        // return the result
        return new_string;
    }

    public static int[] allIndexOf (String string, char chr) {

        // set value of a counter
        int count = 0;

        // for all the elements in the string check the number of time the chr is in the string
        for (int i = 0; i < string.length(); i++) {

            // the value of the current char
            char current = string.charAt(i);

            // add to the counter it is now has chr value
            if (current == chr){
                count ++;
            }

        }

        // set new array with size of the counter
        int indexes [] = new int[count];

        // set counter of the current index of the new array
        int count_current_add = 0;

        // for every letter in the string
        for (int i = 0; i < string.length(); i++) {

            // add the current index of the letter if there is a match in the current avilable place
            if (string.charAt(i) == chr){
                indexes[count_current_add] = i;
                // set new avilable index
                count_current_add++;
            }
        }
        
        // return the new array
        return indexes;
    }
}
