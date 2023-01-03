package furama_resort;

public class Regex {
    private static final String REGEX_ID_VILLA = "^SVVL-[0-9]{4}$";
    private static final String REGEX_ID_ROOM = "^SVRO-[0-9]{4}$";
    private static final String REGEX_NAME_SERVICE = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String REGEX_AREA = "^[3-9][0-9]$";
    private static final String REGEX_RENTAL_COSTS = "^([1-9][\\d]*(\\.[\\d]*)?)|(0\\.[\\d]+)$";
    private static final String REGEX_MAX_PEOPLE = "^(?:[1-9]|[1][0-9])$";
    private static final String REGEX_NUMBER_OF_USES = "^[1-9][\\d]*$";
    private static final String REGEX_RENTAL_TYPE = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public static final String DATE_OF_BIRTH = "^([0-9]{2})-([0-9]{2})-([0-9]{4})$";
    public static final String REGEX_ID_NUMBER = "^([\\d]{9}|[\\d]{12})$";
    public static final String REGEX_EMAIL = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";
    public static final String REGEX_PHONE = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)[\\d]{7}$";

    public static boolean checkRegexIDVIlla(String str){
        return str.matches(REGEX_ID_VILLA);
    }

    public static boolean checkRegexIDRoom(String str){
        return str.matches(REGEX_ID_ROOM);
    }

    public static boolean checkRegexNameService(String str){
        return str.matches(REGEX_NAME_SERVICE);
    }

    public static boolean checkRegexRegexArea(String str){
        return str.matches(REGEX_AREA);
    }

    public static boolean checkRegexRentalCost(String str){
        return str.matches(REGEX_RENTAL_COSTS);
    }

    public static boolean checkRegexMaxPeople(String str){
        return str.matches(REGEX_MAX_PEOPLE);
    }

    public static boolean checkRegexNumbOfUse(String str){
        return str.matches(REGEX_NUMBER_OF_USES);
    }

    public static boolean checkRegexRetalType(String str){
        return str.matches(REGEX_RENTAL_TYPE);
    }

    public static boolean isNum(String str) {
        return str.matches("^-?\\d+(\\.\\d+)?$");
    }

    public static boolean checkDateOfBirth(String str){
        return str.matches(DATE_OF_BIRTH);
    }

    public static boolean checkIDNumb(String str){
        return str.matches(REGEX_ID_NUMBER);
    }

    public static boolean checkEmail(String str){
        return str.matches(REGEX_EMAIL);
    }

    public static boolean checkPhone(String str){
        return str.matches(REGEX_PHONE);
    }
}
