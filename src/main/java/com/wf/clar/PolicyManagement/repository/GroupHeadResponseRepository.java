package com.wf.clar.PolicyManagement.repository;

import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;
import com.wf.clar.PolicyManagement.model.entity.GroupHeadResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupHeadResponseRepository extends JpaRepository<GroupHeadResponseEntity,Integer> {
}
