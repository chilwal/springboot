package com.wf.clar.PolicyManagement.dao;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;

import java.util.List;
import java.util.Optional;

public interface ExecutiveOfficerDao {
    List<ExecutiveOfficerEntity> findAll();

    ExecutiveOfficerEntity addUpdate(ExecutiveOfficerEntity executiveOfficer);

    //ExecutiveOfficerEntity update(ExecutiveOfficerEntity executiveOfficer);

    Integer delete(Integer id);

    Optional<ExecutiveOfficerEntity> findById(Integer id);
}
