package com.wf.clar.PolicyManagement.controller;

import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerRequest;
import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerResponse;
import com.wf.clar.PolicyManagement.model.dto.GroupHeadRequest;
import com.wf.clar.PolicyManagement.model.dto.GroupHeadResponse;
import com.wf.clar.PolicyManagement.service.ExecutiveOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/executiveOfficer")
public class ExecutiveOfficerController {

    @Autowired
    private ExecutiveOfficerService executiveOfficerService;

    @GetMapping("/all")
    public ResponseEntity<List<ExecutiveOfficerResponse>> get() {
        return ResponseEntity.ok(executiveOfficerService.getAll());
    }


    @PostMapping("/create")
    public ResponseEntity<ExecutiveOfficerResponse> create(@RequestBody ExecutiveOfficerRequest request) {

        var data = executiveOfficerService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/update")
    public ResponseEntity<ExecutiveOfficerResponse> update(@RequestBody ExecutiveOfficerRequest request) {

        var data = executiveOfficerService.update(request);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/delete")
    public ResponseEntity<ExecutiveOfficerResponse> delete(Integer id) {

        var data = executiveOfficerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
