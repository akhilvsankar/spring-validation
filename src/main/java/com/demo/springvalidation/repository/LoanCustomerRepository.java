/**
 *
 */
package com.demo.springvalidation.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.demo.springvalidation.domain.LoanCustomer;

/**
 * The Interface LoanCustomerRepository.
 *
 * @author U76172
 */
@Repository
public interface LoanCustomerRepository
	extends JpaRepository<LoanCustomer, Long>, JpaSpecificationExecutor<LoanCustomer> {

    /**
     * Count by customer id and loan date and loan status id.
     *
     * @param customerId   the customer id
     * @param loanDate     the loan date
     * @param loanStatusId the loan status id
     * @return the long
     */
    Long countByCustomerIdAndLoan_LoanDateAndLoan_LoanStatusId(Long customerId, LocalDate loanDate,
	    Integer loanStatusId);

    /**
     * Exists by customer name.
     *
     * @param value the value
     * @return true, if successful
     */
    boolean existsByCustomerName(String value);

}