package com.wf.clar.PolicyManagement.controller;

import com.wf.clar.PolicyManagement.model.dto.GroupHeadRequest;
import com.wf.clar.PolicyManagement.model.dto.GroupHeadResponse;
import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;
import com.wf.clar.PolicyManagement.model.entity.GroupHeadResponseEntity;
import com.wf.clar.PolicyManagement.repository.GroupHeadResponseRepository;
import com.wf.clar.PolicyManagement.service.GroupHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/admin/grouphead")
public class GroupHeadController {

    @Autowired
    private GroupHeadService groupHeadService;

    @Autowired
    private GroupHeadResponseRepository groupHeadResponseRepository;

    @GetMapping()
    public ResponseEntity<List<GroupHeadResponse>> get() {
        return ResponseEntity.ok(groupHeadService.findAll());
    }

    @PostMapping()
    public ResponseEntity<GroupHeadRequest> create(@RequestBody GroupHeadRequest groupHeadRequest) {

        GroupHeadEntity gh1 = new GroupHeadEntity();
        gh1.setCrhKey(2001);
        gh1.setEluid("E2001");
        gh1.setAlignmentName("Business Group");
        gh1.setStatus(1);
        gh1.setSortOrderId(41);
        gh1.setCreatedOn(new Date());
        gh1.setCreatedBy("System.User1");
        gh1.setUpdatedOn(new Date());
        gh1.setUpdatedBy("System.User2");

        List<ExecutiveOfficerEntity> eList = new ArrayList<>();

        for(int i=0;i<5;i++) {
            ExecutiveOfficerEntity e1 = new ExecutiveOfficerEntity();
            e1.setEluid("Z000"+i);
            e1.setStatus('Y');
            e1.setSortOrderId(42+i);
            e1.setCreatedOn(new Date());
            e1.setCreatedBy("System.user1");
            e1.setUpdatedOn(new Date());
            e1.setUpdatedBy("System.User2");
            eList.add(e1);
        }
        gh1.setExecutiveOfficers(eList);
        groupHeadService.save(gh1);
        return ResponseEntity.ok(groupHeadRequest);
    }

    @RequestMapping("/all_ZZ")
    public ResponseEntity<List<GroupHeadResponseEntity>> getGroupHeadWitExecutiveOfficer() {

        return ResponseEntity.ok(groupHeadResponseRepository.findAll());
    }

}

