package com.wf.clar.PolicyManagement.dao;

import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;
import com.wf.clar.PolicyManagement.repository.GroupHeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GroupHeadDaoImpl implements GroupHeadDao {

    @Autowired
    private GroupHeadRepository groupHeadRepository;

    @Override
    public List<GroupHeadEntity> getAll() {
        return groupHeadRepository.findAll();
    }
}
