/**
 *
 */
package com.demo.springvalidation.service.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.demo.springvalidation.validator.CustomerName;
import com.demo.springvalidation.validator.LoanCap;
import com.demo.springvalidation.validator.OnCreate;
import com.demo.springvalidation.validator.OnUpdate;

/**
 * The Class LoanCustomerDTO.
 *
 * @author U76172
 */
public class LoanCustomerDTO {

    /** The id. */
    @Null(groups = OnCreate.class)
    @NotNull(groups = OnUpdate.class)
    private Long id;

    /** The customer id. */
    @LoanCap
    private Long customerId;

    /** The customer name. */
    @CustomerName
    private String customerName;

    /** The loan details. */
    @Valid
    private LoanMasterDTO loan;

    /** The branch id. */
    private Integer branchId;

    /**
     * Gets the branch id.
     *
     * @return the branchId
     */
    public Integer getBranchId() {
	return branchId;
    }

    /**
     * Gets the customer id.
     *
     * @return the customerId
     */
    public Long getCustomerId() {
	return customerId;
    }

    /**
     * Gets the customer name.
     *
     * @return the customerName
     */
    public String getCustomerName() {
	return customerName;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * Gets the loan.
     *
     * @return the loan
     */
    public LoanMasterDTO getLoan() {
	return loan;
    }

    /**
     * Sets the branch id.
     *
     * @param branchId the branchId to set
     */
    public void setBranchId(Integer branchId) {
	this.branchId = branchId;
    }

    /**
     * Sets the customer id.
     *
     * @param customerId the customerId to set
     */
    public void setCustomerId(Long customerId) {
	this.customerId = customerId;
    }

    /**
     * Sets the customer name.
     *
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    /**
     * Sets the id.
     *
     * @param id the id to set
     */
    public void setId(Long id) {
	this.id = id;
    }

    /**
     * Sets the loan.
     *
     * @param loan the loan to set
     */
    public void setLoan(LoanMasterDTO loan) {
	this.loan = loan;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
	return "LoanCustomerDTO [id=" + id + ", customerId=" + customerId + ", loan=" + loan + "]";
    }

}
