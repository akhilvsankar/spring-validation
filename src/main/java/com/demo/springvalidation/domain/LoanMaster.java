/**
 *
 */
package com.demo.springvalidation.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * The Class LoanMaster.
 *
 * @author U76172
 */
@Entity
@Table(name = "loan_master")
@GenericGenerator(name = "loanSequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
	@Parameter(name = "sequence_name", value = "loan_master_id_seq"),
	@Parameter(name = "increment_size", value = "1"), @Parameter(name = "optimizer", value = "hilo") })
public class LoanMaster {

    /** The id. */
    @Id
    @GeneratedValue(generator = "loanSequence")
    private Long id;

    /** The is active. */
    @Column(name = "is_active")
    private Boolean isActive;

    /** The is delete. */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /** The loan application number. */
    @Column(name = "loan_application_number")
    private String loanApplicationNumber;

    /** The loan number. */
    @Column(name = "loan_number")
    private String loanNumber;

    /** The branch id. */
    @Column(name = "branch_id")
    private Integer branchId;

    /** The loan date. */
    @Column(name = "loan_date")
    private LocalDate loanDate;

    /** The loan status id. */
    @Column(name = "loan_status_id")
    private Integer loanStatusId;

    /**
     * Gets the branch id.
     *
     * @return the branchId
     */
    public Integer getBranchId() {
	return branchId;
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
     * Gets the loan application number.
     *
     * @return the loanApplicationNumber
     */
    public String getLoanApplicationNumber() {
	return loanApplicationNumber;
    }

    /**
     * Gets the loan date.
     *
     * @return the loanDate
     */
    public LocalDate getLoanDate() {
	return loanDate;
    }

    /**
     * Gets the loan number.
     *
     * @return the loanNumber
     */
    public String getLoanNumber() {
	return loanNumber;
    }

    /**
     * Gets the loan status id.
     *
     * @return the loanStatusId
     */
    public Integer getLoanStatusId() {
	return loanStatusId;
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
     * Sets the loan application number.
     *
     * @param loanApplicationNumber the loanApplicationNumber to set
     */
    public void setLoanApplicationNumber(String loanApplicationNumber) {
	this.loanApplicationNumber = loanApplicationNumber;
    }

    /**
     * Sets the loan date.
     *
     * @param loanDate the loanDate to set
     */
    public void setLoanDate(LocalDate loanDate) {
	this.loanDate = loanDate;
    }

    /**
     * Sets the loan number.
     *
     * @param loanNumber the loanNumber to set
     */
    public void setLoanNumber(String loanNumber) {
	this.loanNumber = loanNumber;
    }

    /**
     * Sets the loan status id.
     *
     * @param loanStatusId the loanStatusId to set
     */
    public void setLoanStatusId(Integer loanStatusId) {
	this.loanStatusId = loanStatusId;
    }

}
