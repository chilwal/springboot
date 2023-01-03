package com.wf.clar.PolicyManagement.service;

import com.wf.clar.PolicyManagement.dao.ExecutiveOfficerDao;
import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerRequest;
import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerResponse;
import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExecutiveOfficerServiceImpl implements ExecutiveOfficerService {

    @Autowired
    private ExecutiveOfficerDao executiveOfficerDao;

    @Override
    public List<ExecutiveOfficerResponse> findAll() {

        Comparator<ExecutiveOfficerResponse> comparator = Comparator.comparing(ExecutiveOfficerResponse::getSortOrderId);

        return executiveOfficerDao.findAll().stream()
                .map(this::createGetResponse)
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    @Override
    public ExecutiveOfficerResponse findById(Integer id) {
        var data = executiveOfficerDao.findById(id);
        return createGetResponse(data.get());
    }

    @Override
    public ExecutiveOfficerResponse create(ExecutiveOfficerRequest executiveOfficerRequest) {

        var executiveOfficer = new ExecutiveOfficerEntity();
        executiveOfficer.setEluid(executiveOfficerRequest.getEluid());
        executiveOfficer.setGroupHeadId(executiveOfficerRequest.getGroupHeadId());
        executiveOfficer.setCreatedBy(executiveOfficerRequest.getCreatedBy());
        //ToDo: sortOrderId will come from UI or it be auto incremented (MAX+1)
        executiveOfficer.setSortOrderId(executiveOfficerRequest.getSortOrderId());
        executiveOfficer.setStatus(executiveOfficerRequest.getStatus());
        executiveOfficer.setCreatedOn(new Date());
        //ToDo: In case of create last updated by and last updated on will be null or same as created by created on

        var data = executiveOfficerDao.create(executiveOfficer);
        return createGetResponse(data);
    }

    @Override
    public ExecutiveOfficerResponse update(ExecutiveOfficerRequest executiveOfficerRequest) {

        var executiveOfficer = new ExecutiveOfficerEntity();
        executiveOfficer.setExecutiveOfficerId(executiveOfficerRequest.getId());
        executiveOfficer.setEluid(executiveOfficerRequest.getEluid());
        executiveOfficer.setGroupHeadId(executiveOfficerRequest.getGroupHeadId());
        executiveOfficer.setSortOrderId(executiveOfficerRequest.getSortOrderId());
        executiveOfficer.setStatus(executiveOfficerRequest.getStatus());

        executiveOfficer.setCreatedBy(executiveOfficerRequest.getCreatedBy());
        executiveOfficer.setCreatedOn(new Date());

        executiveOfficer.setUpdatedBy(executiveOfficerRequest.getCreatedBy());
        executiveOfficer.setUpdatedOn(new Date());

        var data = executiveOfficerDao.update(executiveOfficer);
        return createGetResponse(data);
    }

    @Override
    public Integer delete(Integer id) {
        return executiveOfficerDao.delete(id);
    }

    private ExecutiveOfficerResponse createGetResponse(ExecutiveOfficerEntity entity) {

        return ExecutiveOfficerResponse.builder()
                .id(entity.getExecutiveOfficerId())
                .groupHeadId(entity.getGroupHeadId())
                .eluid(entity.getEluid())
                .status(entity.getStatus())
                .sortOrderId(entity.getSortOrderId())
                .createdOn(entity.getCreatedOn())
                .createdBy(entity.getCreatedBy())
                .updatedOn(entity.getUpdatedOn())
                .updatedBy(entity.getUpdatedBy())
                .build();
    }
}
