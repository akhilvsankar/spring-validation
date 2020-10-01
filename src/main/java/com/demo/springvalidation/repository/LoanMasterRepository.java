/**
 *
 */
package com.demo.springvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.demo.springvalidation.domain.LoanMaster;

/**
 * The Interface LoanMasterRepository.
 *
 * @author U76172
 */
@Repository
public interface LoanMasterRepository extends JpaRepository<LoanMaster, Long>, JpaSpecificationExecutor<LoanMaster> {

}
