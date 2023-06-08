public class ISBNValidator {
    public static String validateISBN(String isbn) {
        String cleanedISBN = isbn.replaceAll("[^0-9X]", ""); // Remove non-digit characters
        
        // Check if it is a valid ISBN-10
        if (cleanedISBN.length() == 10) {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                int digit = Character.getNumericValue(cleanedISBN.charAt(i));
                sum += digit * (10 - i);
            }
            
            if (cleanedISBN.charAt(9) == 'X') {
                sum += 10;
            } else {
                sum += Character.getNumericValue(cleanedISBN.charAt(9));
            }
            
            if (sum % 11 == 0) {
                // Convert to ISBN-13
                String isbn13 = "978" + cleanedISBN.substring(0, 9);
                int checksum = 0;
                for (int i = 0; i < isbn13.length(); i++) {
                    int digit = Character.getNumericValue(isbn13.charAt(i));
                    checksum += (i % 2 == 0) ? digit : digit * 3;
                }
                int checkDigit = (10 - (checksum % 10)) % 10;
                return isbn13 + checkDigit;
            }
        }
        
        // Check if it is a valid ISBN-13
        if (cleanedISBN.length() == 13) {
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                int digit = Character.getNumericValue(cleanedISBN.charAt(i));
                sum += (i % 2 == 0) ? digit : digit * 3;
            }
            
            if (Character.getNumericValue(cleanedISBN.charAt(12)) == (10 - (sum % 10)) % 10) {
                return "Valid";
            }
        }
        
        return "Invalid";
    }

    public static void main(String[] args) {
        String isbn1 = "0330301624";
        String isbn2 = "9780316066525";
        String isbn3 = "1234567890";
        
        System.out.println(validateISBN(isbn1));  // Output: 9780330301626
        System.out.println(validateISBN(isbn2));  // Output: Valid
        System.out.println(validateISBN(isbn3));  // Output: Invalid
    }
}
