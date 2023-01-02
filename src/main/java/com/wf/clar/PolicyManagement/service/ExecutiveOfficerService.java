package com.wf.clar.PolicyManagement.service;

import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerRequest;
import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerResponse;
import com.wf.clar.PolicyManagement.model.dto.GroupHeadResponse;

import java.util.List;

public interface ExecutiveOfficerService {
    public List<ExecutiveOfficerResponse> getAll();
    public ExecutiveOfficerResponse create(ExecutiveOfficerRequest executiveOfficerRequest);
    public ExecutiveOfficerResponse update(ExecutiveOfficerRequest executiveOfficerRequest);
    Integer delete(Integer id);
}
