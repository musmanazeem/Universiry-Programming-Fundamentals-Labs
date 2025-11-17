public class ConvertWithoutMethods {
    public static void main(String[] args) {
        String original = "Java";
        String converted = "";
        
        // Convert each character manually
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            
            // Convert lowercase to uppercase using ASCII arithmetic
            if (c >= 'a' && c <= 'z') {
                converted += (char)(c - 32);  // 'a' - 32 = 'A' in ASCII
            } else {
                converted += c;
            }
        }
        
        System.out.println("Original: " + original);
        System.out.println("Converted: " + converted);
    }
}