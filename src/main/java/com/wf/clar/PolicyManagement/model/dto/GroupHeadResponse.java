package com.wf.clar.PolicyManagement.model.dto;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupHeadResponse {
    private Integer id;
    private Integer crhKey;
    private Integer crhName;
    private String eluid;
    private String firstName;
    private String middleName;
    private String lastName;
    private String alignmentName;
    private Integer status;
    private Integer sortOrderId;
    private Date createdOn;
    private String createdBy;
    private Date updatedOn;
    private String updatedBy;
    List<ExecutiveOfficerEntity> executiveOfficers;
}
