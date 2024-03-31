public class BinaryConverterTest {
    public static void main(String[] args) {
        try {
            // Test the bin2Dec method
            String binaryString = "101010";
            int decimal = BinaryConverter.bin2Dec(binaryString);
            System.out.println("Binary " + binaryString + " is equivalent to Decimal " + decimal);
        } catch (BinaryFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
