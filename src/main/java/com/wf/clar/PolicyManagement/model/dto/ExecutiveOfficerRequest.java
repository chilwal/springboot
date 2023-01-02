package com.wf.clar.PolicyManagement.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExecutiveOfficerRequest {

    private Integer id;
    private String eluid;
    private Integer groupHeadId;
    private String createdBy;
    private Integer sortOrderId;
    private Character status;
}
