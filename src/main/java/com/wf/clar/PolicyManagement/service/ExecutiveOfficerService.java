package com.wf.clar.PolicyManagement.service;

import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerRequest;
import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerResponse;

import java.util.List;

public interface ExecutiveOfficerService {
    public List<ExecutiveOfficerResponse> findAll();
    public ExecutiveOfficerResponse create(ExecutiveOfficerRequest executiveOfficerRequest);
    public ExecutiveOfficerResponse update(ExecutiveOfficerRequest executiveOfficerRequest);
    Integer delete(Integer id);

    ExecutiveOfficerResponse findById(Integer id);
}
