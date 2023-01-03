package com.wf.clar.PolicyManagement.repository;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ExecutiveOfficerRepository extends JpaRepository<ExecutiveOfficerEntity, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE ExecutiveOfficerEntity SET status = :status WHERE executiveOfficerId = :id")
    int updateExecutiveOfficerByStatus(@Param("id") Integer id, @Param("status") Character status);

}
