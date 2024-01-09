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
        int [] a = allIndexOf("Hello WoRld",'l');

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        System.out.println(camelCase("One   two tHRee world"));


    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String opposite = "";
        String voules = "aeoui";
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if ((current >= 'a' && current <= 'z') || (current >= 'A' && current <= 'Z')){
                if (voules.indexOf(current) != -1){
                   if (current >= 'a' && current <= 'z'){
                        current -= 32;
                   }
                } else {
                    if (current >= 'A' && current <= 'Z'){
                        current += 32;
                    }
                }
            }
            opposite += current;
        }

        return opposite;
    }

    public static String camelCase (String string) {
        String new_string = "";
        int count_word = 0;
        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (current != ' ') {

                if (i == 0 || string.charAt(i-1) == ' '){
                    count_word ++;
                    if (current >= 'a' && current <= 'z'){
                        current -= 32;
                    }

                } else {

                    if (count_word == 1){
                        if (current >= 'A' && current <= 'Z'){
                            current += 32;
                        }
                    }

                    if (current >= 'A' && current <= 'Z'){
                        current += 32;
                    }
                }
                new_string += current;

            }


        }


        return new_string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            if (current == chr){
                count ++;
            }

        }

        int indexes [] = new int[count];
        int count_current_add = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr){
                indexes[count_current_add] = i;
                count_current_add++;
            }
        }
        
        
        return indexes;
    }
}
