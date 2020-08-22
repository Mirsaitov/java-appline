public class test {
    public static void main(String[] args) {
        String str = "101101111010101110";
        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (str.charAt(i) - '0') * j;
        }
        System.out.println("\"" + str + "\" -> " + n);
    }
}


