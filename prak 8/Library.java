public class Library {
    static {
        System.out.println("Library system initialized.");
        System.out.println("Hello");
    }
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
   public static void main(String[] args) {
    Library.convertToUpperCase("Hello");
   } 
}