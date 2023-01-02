package com.wf.clar.PolicyManagement.service;

import com.wf.clar.PolicyManagement.model.dto.GroupHeadResponse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GroupHeadService {

    public List<GroupHeadResponse> getAll();

}
