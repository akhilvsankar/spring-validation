/**
 *
 */
package com.demo.springvalidation.service.dto;

import java.time.LocalDate;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.demo.springvalidation.validator.OnCreate;
import com.demo.springvalidation.validator.OnUpdate;

/**
 * The Class LoanMasterDTO.
 *
 * @author U76172
 */
public class LoanMasterDTO {

    /** The id. */
    @Null(groups = OnCreate.class)
    @NotNull(groups = OnUpdate.class)
    private Long id;

    /** The loan application number. */
    @Size(min = 5, max = 10, message = "Loan Application number should be between 5 and 10")
    private String loanApplicationNumber;

    /** The loan number. */

    /** The loan number. */
    @Size(min = 5, message = "Loan number size not correct")
    // @Pattern(regexp = "[a-zA-Z]")
    private String loanNumber;

    /** The loan status id. */
    @Positive
    private Integer loanStatusId;

    /** The is active. */
    @AssertTrue(groups = OnCreate.class)
    private Boolean isActive;

    /** The is delete. */
    @AssertFalse(groups = OnCreate.class)
    private Boolean isDelete;

    /** The branch id. */
    @PositiveOrZero
    private Integer branchId;

    /** The loan date. */
    @PastOrPresent
    private LocalDate loanDate;

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
