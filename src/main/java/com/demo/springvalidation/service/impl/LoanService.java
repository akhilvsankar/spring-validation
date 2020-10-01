/**
 *
 */
package com.demo.springvalidation.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.demo.springvalidation.domain.LoanCustomer;
import com.demo.springvalidation.domain.LoanMaster;
import com.demo.springvalidation.mapper.LoanCustomerMapper;
import com.demo.springvalidation.mapper.LoanMasterMapper;
import com.demo.springvalidation.repository.LoanCustomerRepository;
import com.demo.springvalidation.repository.LoanMasterRepository;
import com.demo.springvalidation.service.dto.LoanCustomerDTO;

/**
 * The Class LoanService.
 *
 * @author U76172
 */
@Service
public class LoanService {

    /** The log. */
    private final Logger LOG = LoggerFactory.getLogger(LoanService.class);

    /**
     * Save.
     *
     */
    private final LoanCustomerRepository loanCustomerRepo;

    /** The loan master repo. */
    private final LoanMasterRepository loanMasterRepo;

    /** The loan customer mapper. */
    private final LoanCustomerMapper loanCustomerMapper;

    /** The loan master mapper. */
    private final LoanMasterMapper loanMasterMapper;

    /**
     * Instantiates a new loan service.
     *
     * @param loanCustomerRepo   the loan customer repo
     * @param loanMasterRepo     the loan master repo
     * @param loanCustomerMapper the loan customer mapper
     * @param loanMasterMapper   the loan master mapper
     */
    public LoanService(LoanCustomerRepository loanCustomerRepo, LoanMasterRepository loanMasterRepo,
	    LoanCustomerMapper loanCustomerMapper, LoanMasterMapper loanMasterMapper) {
	this.loanCustomerRepo = loanCustomerRepo;
	this.loanCustomerMapper = loanCustomerMapper;
	this.loanMasterRepo = loanMasterRepo;
	this.loanMasterMapper = loanMasterMapper;
    }

    /**
     * Save.
     *
     * @param loanCustomerDTO the loan customer DTO
     */
    public void save(LoanCustomerDTO loanCustomerDTO) {
	LOG.info("Service layer reached for saving loan customer");
	final LoanMaster loanMaster = loanMasterMapper.toEntity(loanCustomerDTO.getLoan());
	final Long loanId = loanMasterRepo.save(loanMaster).getId();
	final LoanCustomer loanCustomer = loanCustomerMapper.toEntity(loanCustomerDTO);
	loanCustomer.getLoan().setId(loanId);
	loanCustomerRepo.save(loanCustomer);

    }

    /**
     * Update.
     *
     * @param loanCustomerDTO the loan customer DTO
     */
    public void update(LoanCustomerDTO loanCustomerDTO) {
	LOG.info("Service layer reached for saving loan customer");
	final Optional<LoanMaster> loanMasterOptional = loanMasterRepo.findById(loanCustomerDTO.getLoan().getId());
	if (loanMasterOptional.isPresent()) {
	    LoanMaster loanMaster = loanMasterOptional.get();
	    loanMaster = loanMasterMapper.toUpdateEntity(loanCustomerDTO.getLoan(), loanMaster);
	    loanMasterRepo.save(loanMaster);

	}

    }

}
