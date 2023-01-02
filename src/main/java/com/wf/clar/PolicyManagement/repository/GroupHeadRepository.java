package com.wf.clar.PolicyManagement.repository;

import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupHeadRepository extends JpaRepository<GroupHeadEntity,Integer> {

}
