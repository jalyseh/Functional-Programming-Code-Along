package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0897654323",
                LocalDate.of(2000,1,1)
        );

        //CustomerValidatorService validatorService = new CustomerValidatorService();
        //validatorService.isValid(customer);
        //System.out.println(new CustomerValidatorService().isValid(customer));

        //USING COMBINATOR PATTERN
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdultValid())
                        .apply(customer);

        //System.out.println(result);
        //if(result != ValidationResult.SUCCESS){
            //throw new IllegalStateException(result.name());
       // }

    }
}
