package com.wf.clar.PolicyManagement.dao;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;

import java.util.List;

public interface ExecutiveOfficerDao {
    List<ExecutiveOfficerEntity> getAll();

    ExecutiveOfficerEntity create(ExecutiveOfficerEntity executiveOfficer);

    ExecutiveOfficerEntity update(ExecutiveOfficerEntity executiveOfficer);

    Integer delete(Integer id);
}
