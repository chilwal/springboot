package com.wf.clar.PolicyManagement.service;

import com.wf.clar.PolicyManagement.model.dto.GroupHeadResponse;
import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;

import java.util.List;


public interface GroupHeadService {

    public List<GroupHeadResponse> findAll();

    void save(GroupHeadEntity gh1);
}
