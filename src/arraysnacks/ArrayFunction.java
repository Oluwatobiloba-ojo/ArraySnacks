package arraysnacks;

public class ArrayFunction {
    public static int largestElement(int[] arrays){
        int largest = arrays[0];
        for(int integers = 0; integers < arrays.length; integers++){
            if (arrays[integers] > largest)largest = arrays[integers];
        }
        return largest;
    }
    public static String reverseList(int[] arrays){
        String result = "";
        for (int number = arrays.length - 1; number >= 0; number--){
            result = result + " " +arrays[number];
        }
        return result;
    }

    public static boolean checkListElement(int[] integers, int element) {
        boolean result = false;
        for (int number = 0; number < integers.length; number++){
            if (element == integers[number])result = true;
        }
        return result;
    }

    public static String oddPosition(int[] integers) {
        String result= "";
        for (int number = 1; number < integers.length; number+=2){
            result = result + " " + integers[number];
        }
        return result;
    }

    public static String evenPosition(int[] integers) {
        String result = "";
        for (int index = 0; index < integers.length; index+=2){
            result = result + " "+ integers[index];
        }
        return result;
    }

    public static int totalArray(int[] array) {
        int total = 0;
        for (int index = 0; index < array.length; index++) {
            total += array[index];
        }
        return total;
    }

    public static boolean isPalindrome(String name) {
        String reverses = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverses = reverses + String.valueOf(name.charAt(i));
        }
        return (reverses.equals(name));
    }

    public static int forLoopSum(int[] integers) {
        int total = 0;
        for (int number = 0; number < integers.length; number++){
            total += integers[number];
        }
        return total;
    }

    public static int whileLoopSum(int[] integers) {
        int total = 0;
        int number = 0;
        while (number < integers.length){
            total += integers[number];
            number++;
        }
        return total;
    }

    public static int doWhileLoopSum(int[] integers) {
        int total = 0;
        int number = 0;
        int counter = 0;
        do {
            if (counter > 0) number++;
            total += integers[number];
            counter++;
        }while (number < integers.length-1);
        return total;
    }
}
