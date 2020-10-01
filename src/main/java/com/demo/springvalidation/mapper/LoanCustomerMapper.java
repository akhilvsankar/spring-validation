/**
 *
 */
package com.demo.springvalidation.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.demo.springvalidation.domain.LoanCustomer;
import com.demo.springvalidation.service.dto.LoanCustomerDTO;

/**
 * The Class LoanCustomerMapper.
 *
 * @author U76172
 */
@Mapper(componentModel = "spring", uses = { LoanMasterMapper.class })
public interface LoanCustomerMapper {

    /**
     * To DTO.
     *
     * @param loanCustomer the loan customer
     * @return the loan customer DTO
     */
    LoanCustomerDTO toDTO(LoanCustomer loanCustomer);

    /**
     * To entity.
     *
     * @param loanCustomerDTO the loan customer DTO
     * @return the loan customer
     */
    LoanCustomer toEntity(LoanCustomerDTO loanCustomerDTO);

    /**
     * To update entity.
     *
     * @param loanCustomerDTO the loan customer DTO
     * @param loanCustomer    the loan customer
     * @return the loan customer
     *
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    LoanCustomer toUpdateEntity(LoanCustomerDTO loanCustomerDTO, @MappingTarget LoanCustomer loanCustomer);

}
