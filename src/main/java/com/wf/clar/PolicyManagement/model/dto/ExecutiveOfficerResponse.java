package com.wf.clar.PolicyManagement.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecutiveOfficerResponse {
    private Integer id;
    private Integer groupHeadId;
    private String eluid;
    private Character status;
    private Integer sortOrderId;
    private Date createdOn;
    private String createdBy;
    private Date updatedOn;
    private String updatedBy;
}
