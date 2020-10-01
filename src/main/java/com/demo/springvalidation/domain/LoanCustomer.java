/**
 *
 */
package com.demo.springvalidation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * The Class LoanCustomer.
 *
 * @author U76172
 */
@Entity
@Table(name = "loan_customer")
@GenericGenerator(name = "loanCustSequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	@Parameter(name = "sequence_name", value = "loan_customer_id_seq"),
	@Parameter(name = "increment_size", value = "1"), @Parameter(name = "optimizer", value = "hilo") })
public class LoanCustomer {

    /** The id. */
    @Id
    @GeneratedValue(generator = "loanCustSequence")
    private Long id;

    /** The customer name. */
    @Column(name = "customer_name")
    private String customerName;

    /** The loan. */
    @ManyToOne
    @JoinColumn(name = "loan_id")
    private LoanMaster loan;

    /** The customer id. */
    @Column(name = "customer_id")
    private Long customerId;

    /** The branch id. */
    @Column(name = "branch_id")
    private Integer branchId;

    /** The is active. */
    @Column(name = "is_active")
    private Boolean isActive;

    /** The is delete. */
    @Column(name = "is_delete")
    private Boolean isDelete;

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
     * Gets the checks if is active.
     *
     * @return the isActive
     */
    public Boolean getIsActive() {
	return isActive;
    }

    /**
     * Gets the checks if is delete.
     *
     * @return the isDelete
     */
    public Boolean getIsDelete() {
	return isDelete;
    }

    /**
     * Gets the loan.
     *
     * @return the loan
     */
    public LoanMaster getLoan() {
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
     * Sets the checks if is active.
     *
     * @param isActive the isActive to set
     */
    public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
    }

    /**
     * Sets the checks if is delete.
     *
     * @param isDelete the isDelete to set
     */
    public void setIsDelete(Boolean isDelete) {
	this.isDelete = isDelete;
    }

    /**
     * Sets the loan.
     *
     * @param loan the loan to set
     */
    public void setLoan(LoanMaster loan) {
	this.loan = loan;
    }

}
