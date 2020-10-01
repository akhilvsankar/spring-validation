/**
 *
 */
package com.demo.springvalidation.web.rest;

import javax.validation.groups.Default;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springvalidation.service.dto.LoanCustomerDTO;
import com.demo.springvalidation.service.impl.LoanService;
import com.demo.springvalidation.validator.OnCreate;
import com.demo.springvalidation.validator.OnUpdate;

/**
 * The Class LoanController.
 *
 * @author U76172
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanController {

    /** The log. */
    private final Logger LOG = LoggerFactory.getLogger(LoanController.class);

    /** The loan service. */
    private final LoanService loanService;

    /**
     * Instantiates a new loan controller.
     *
     * @param loanService the loan service
     */
    public LoanController(LoanService loanService) {
	this.loanService = loanService;
    }

    /**
     * Save.
     *
     * @param loanCustomerDTO the loan customer DTO
     * @param errors          the errors
     * @return the boolean
     * @throws BadRequestAlertException the bad request alert exception
     */
    @PostMapping("/loan/save")
    public Boolean save(
	    @Validated(value = { OnCreate.class, Default.class }) @RequestBody LoanCustomerDTO loanCustomerDTO,
	    Errors errors) throws BadRequestAlertException {
	LOG.info("Request to save loan customer " + loanCustomerDTO.toString());
	if (errors.hasErrors()) {
	    throw new BadRequestAlertException(errors.getFieldError().getDefaultMessage(), "demo", "1");
	}
	loanService.save(loanCustomerDTO);
	return true;

    }

    /**
     * Save.
     *
     * @param loanCustomerDTO the loan customer DTO
     * @param errors          the errors
     * @return the boolean
     * @throws BadRequestAlertException the bad request alert exception
     */
    @PutMapping("/loan/update")
    public Boolean update(
	    @Validated(value = { OnUpdate.class, Default.class }) @RequestBody LoanCustomerDTO loanCustomerDTO,
	    Errors errors) throws BadRequestAlertException {
	LOG.info("Request to update loan customer " + loanCustomerDTO.toString());
	if (errors.hasErrors()) {
	    throw new BadRequestAlertException(errors.getFieldError().getDefaultMessage(), "demo", "1");
	}
	loanService.update(loanCustomerDTO);
	return true;

    }

}
