/**
 *
 */
package com.demo.springvalidation.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.demo.springvalidation.domain.LoanMaster;
import com.demo.springvalidation.service.dto.LoanMasterDTO;

/**
 * The Interface LoanMasterMapper.
 *
 * @author U76172
 */
@Mapper(componentModel = "spring")
public interface LoanMasterMapper {

    /**
     * To entity.
     *
     * @param loanMasterDTO the loan master DTO
     * @return the loan master
     */
    LoanMasterDTO toDto(LoanMaster loanMasterDTO);

    /**
     * To entity.
     *
     * @param loanMasterDTO the loan master DTO
     * @return the loan master
     */
    LoanMaster toEntity(LoanMasterDTO loanMasterDTO);

    /**
     * To update entity.
     *
     * @param loan       the loan
     * @param loanMaster the loan master
     * @return the loan master
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    LoanMaster toUpdateEntity(LoanMasterDTO loan, @MappingTarget LoanMaster loanMaster);

}
