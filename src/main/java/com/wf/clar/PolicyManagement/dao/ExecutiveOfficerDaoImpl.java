package com.wf.clar.PolicyManagement.dao;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import com.wf.clar.PolicyManagement.repository.ExecutiveOfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ExecutiveOfficerDaoImpl implements ExecutiveOfficerDao {

    @Autowired
    private ExecutiveOfficerRepository executiveOfficerRepository;

    @Override
    public List<ExecutiveOfficerEntity> findAll() {
        return executiveOfficerRepository.findAll();
    }

    @Override
    public ExecutiveOfficerEntity addUpdate(ExecutiveOfficerEntity executiveOfficer) {
        return executiveOfficerRepository.save(executiveOfficer);
    }

   /* @Override
    public ExecutiveOfficerEntity update(ExecutiveOfficerEntity executiveOfficer) {
        var data= executiveOfficerRepository.save(executiveOfficer);
        return data;
    }*/

    @Override
    public Integer delete(Integer id) {
        return executiveOfficerRepository.updateExecutiveOfficerByStatus(id,'N');
    }

    @Override
    public Optional<ExecutiveOfficerEntity> findById(Integer id) {
        //ToDo: if id not exist in database
        return executiveOfficerRepository.findById(id);
    }
}
