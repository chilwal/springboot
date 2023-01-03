package com.wf.clar.PolicyManagement.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "POLICY", name = "CFG_BUS_GRP_ENT_FNCTN_TYP")
@Data
public class GroupHeadResponseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VALUE_ID")
    private Integer groupHeadId;

    @Column(name = "CRH_SYNT_KEY")
    private Integer crhKey;
    @Column(name = "GRP_HEAD_ELUID")
    private String eluid;

    @Column(name = "GRP_ALGMNT_NM")
    private String alignmentName;

    @Column(name = "STAT_CTRL_VALUE_ID")
    private Integer status;

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

    @OneToMany
    @JoinColumn(name = "VALUE_ID")
    List<ExecutiveOfficerEntity> executiveOfficers;
}
