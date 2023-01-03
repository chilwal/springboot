package com.wf.clar.PolicyManagement.dao;

import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;

import java.util.List;


public interface GroupHeadDao {

           List<GroupHeadEntity> findAll();

    void save(GroupHeadEntity gh1);
}
