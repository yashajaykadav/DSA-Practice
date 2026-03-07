public class GenerateASCIIVals {

  public static void printASCII(String s) {
    String caps = s.toUpperCase(); // Create it once here
    for (int i = 0; i < s.length(); i++) {
        char lower = s.charAt(i);
        char upper = caps.charAt(i);
        
        System.out.print(lower + " = " + (int)lower);
        System.out.print("   |  ");
        System.out.println(upper + " = " + (int)upper);
    }
}

    public static void main(String[] args) {

        String alphbates = "abcdefghijklmnopqrstuvwxyz";

        printASCII(alphbates);
    }
}