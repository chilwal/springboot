package com.wf.clar.PolicyManagement.controller;

import com.wf.clar.PolicyManagement.model.dto.GroupHeadRequest;
import com.wf.clar.PolicyManagement.model.dto.GroupHeadResponse;
import com.wf.clar.PolicyManagement.model.entity.GroupHeadResponseEntity;
import com.wf.clar.PolicyManagement.repository.GroupHeadResponseRepository;
import com.wf.clar.PolicyManagement.service.GroupHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        return ResponseEntity.ok(groupHeadRequest);
    }

    @RequestMapping("/all_ZZ")
    public ResponseEntity<List<GroupHeadResponseEntity>> getGroupHeadWitExecutiveOfficer() {

        return ResponseEntity.ok(groupHeadResponseRepository.findAll());
    }

}
