package com.wf.clar.PolicyManagement.dao;

import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public interface GroupHeadDao {

           List<GroupHeadEntity> getAll();
}
