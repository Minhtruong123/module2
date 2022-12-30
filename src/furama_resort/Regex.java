package furama_resort;

public class Regex {
    private static final String REGEX_ID_VILLA = "^SVVL-[0-9]{4}$";
    private static final String REGEX_ID_ROOM = "^SVRO-[0-9]{4}$";
    private static final String REGEX_NAME_SERVICE = "^[A-Za-z]*$";
    private static final String REGEX_AREA = "^[3-9][0-9]$";
    private static final String REGEX_RENTAL_COSTS = "^([1-9][\\d]*(\\.[\\d]*)?)|(0\\.[\\d]+)$";
    private static final String REGEX_MAX_PEOPLE = "^(?:[1-9]|[1][0-9])$";
    private static final String REGEX_NUMBER_OF_USES = "^[1-9][\\d]*$";
    private static final String REGEX_RENTAL_TYPE = "^[A-Za-z]*$";

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
}
