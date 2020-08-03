public class Principle {
    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }

    public static void main(String[] args){
        char[] c = {'h', 'e'};
        printReverse(c);
    }
}
