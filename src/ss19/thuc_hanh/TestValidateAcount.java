package ss19.thuc_hanh;

public class TestValidateAcount {
    private static ValidateAcount validateAcount;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        validateAcount = new ValidateAcount();
        for (String account : validAccount) {
            boolean isvalid = validateAcount.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = validateAcount.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
