package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("with predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000098876"));

        System.out.println("without predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000098876"));

        System.out.println("is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07000000300"));

        System.out.println("is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09003098876"));


    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") & phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
              phoneNumber.startsWith("07") & phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
