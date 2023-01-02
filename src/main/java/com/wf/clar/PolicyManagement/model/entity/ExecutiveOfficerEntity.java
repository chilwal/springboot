package com.wf.clar.PolicyManagement.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(schema = "POLICY", name = "CFG_BUS_GRP_ENT_FNCTN_SUB_TYP")
@Data
public class ExecutiveOfficerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXEC_OFCR_ID")
    private Integer executiveOfficerId;

    @Column(name = "VALUE_ID")
    private Integer groupHeadId;
    @Column(name = "EXEC_OFGR_ELUID")
    private String eluid;

    @Column(name = "ACTV_IN")
    private Character status;

    @Column(name = "SORT_ORDER_ID")
    private Integer sortOrderId;

    @Column(name = "INSRT_DT")
    private Date createdOn;

    @Column(name = "INSRT_BY_ID")
    private String createdBy;

    @Column(name = "LAST_UPDT_DT")
    private Date updatedOn;

    @Column(name = "LAST_UPDT_BY_ID")
    private String updatedBy;
}
