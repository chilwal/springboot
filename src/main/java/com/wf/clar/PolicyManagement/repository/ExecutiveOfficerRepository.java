package com.wf.clar.PolicyManagement.repository;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutiveOfficerRepository extends JpaRepository<ExecutiveOfficerEntity,Integer> {

    @Modifying
    @Query("UPDATE policy.cfg_bus_grp_ent_fnctn_sub_typ SET actv_in = 'N' WHERE EXEC_OFCR_ID=31")
    Integer updateExecutiveOfficerByStatus(Integer id, Character status);
}
