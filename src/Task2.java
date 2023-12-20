public class Task2 {
    public static String reverseWithLoop(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reversed.append(ch);
        }
        return reversed.toString();
    }

    public static String reverseWithoutLoop(String str) {
        StringBuilder normal = new StringBuilder(str);
        return normal.reverse().toString();
    }

    public static String reverseWithCharArray(String str) {

        char[] charArray = str.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String normalSentence = "I'm going to go to school today morning.";

        System.out.println("Loop: " + reverseWithLoop(normalSentence));
        System.out.println("No Loop: " + reverseWithoutLoop(normalSentence));
        System.out.println("charArray: " + reverseWithCharArray(normalSentence));
    }
}
