/**
 *
 */
package com.demo.springvalidation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.demo.springvalidation.repository.LoanCustomerRepository;

/**
 * The Class CustomerNameValidator.
 *
 * @author U76172
 */
@Component
public class CustomerNameValidator implements ConstraintValidator<CustomerName, String> {

    /** The customer repo. */
    private final LoanCustomerRepository loanCustomerRepo;

    /**
     * Instantiates a new customer name validator.
     *
     * @param customerRepo the customer repo
     */
    public CustomerNameValidator(LoanCustomerRepository customerRepo) {
	loanCustomerRepo = customerRepo;
    }

    /**
     * Checks if is valid.
     *
     * @param value   the value
     * @param context the context
     * @return true, if is valid
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	return !loanCustomerRepo.existsByCustomerName(value);

    }

}
