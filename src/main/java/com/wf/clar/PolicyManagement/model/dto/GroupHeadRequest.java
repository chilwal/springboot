package com.wf.clar.PolicyManagement.model.dto;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupHeadRequest {

    private Integer crhKey;
    private String eluid;
    private String alignmentName;
    private Integer status;
    private Integer sortOrderId;
    private String createdBy;
    private String  executiveOfficer;
}
