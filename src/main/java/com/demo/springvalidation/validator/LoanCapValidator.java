/*
 *
 */
package com.demo.springvalidation.validator;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.demo.springvalidation.repository.LoanCustomerRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerNameValidator.
 */
@Component
public class LoanCapValidator implements ConstraintValidator<LoanCap, Long> {

    /** The customer repo. */
    private final LoanCustomerRepository loanCustomerRepo;

    /**
     * Instantiates a new customer name validator.
     *
     * @param customerRepo the customer repo
     */
    public LoanCapValidator(LoanCustomerRepository customerRepo) {
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
    public boolean isValid(Long value, ConstraintValidatorContext context) {
	final Long count = loanCustomerRepo.countByCustomerIdAndLoan_LoanDateAndLoan_LoanStatusId(value,
		LocalDate.now(), 1);
	return count < 5L;
    }
}
