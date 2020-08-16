public class Task13 {
    public static void main(String[] args){
        String hi = "Hello my world!";
        String hi2 = "Hello world!";
            if(hi.length()==hi2.length()) {
System.out.println("Длина строки " + "'" + hi + "'" + "("+ hi.length() + ")"+ " = длине строки " + "'" + hi2 + "'" + "("+ hi2.length() + ")");
            }
            else if (hi.length() > hi2.length()) {
System.out.println("Длина строки " + "'" + hi + "'" + "(" + hi.length() + ")" + " больше, чем длина строки " + "'" + hi2 + "'" + "("+ hi2.length() + ")");
        }
            else if (hi2.length() > hi.length()) {
System.out.println("Длина строки "  + "'" + hi2 + "'" + "(" + hi2.length() + ")" + " больше, чем длина строки " + "'" + hi + "'" + "("+ hi.length() + ")");
        }
    }
}
