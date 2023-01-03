package com.wf.clar.PolicyManagement.controller;

import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerRequest;
import com.wf.clar.PolicyManagement.model.dto.ExecutiveOfficerResponse;
import com.wf.clar.PolicyManagement.service.ExecutiveOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/executiveOfficer")
public class ExecutiveOfficerController {

    @Autowired
    private ExecutiveOfficerService executiveOfficerService;

    @GetMapping()
    public ResponseEntity<List<ExecutiveOfficerResponse>> findAll() {
        return ResponseEntity.ok(executiveOfficerService.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<ExecutiveOfficerResponse> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(executiveOfficerService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<ExecutiveOfficerResponse> create(@RequestBody ExecutiveOfficerRequest request) {

        var data = executiveOfficerService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping()
    public ResponseEntity<ExecutiveOfficerResponse> update(@RequestBody ExecutiveOfficerRequest request) {

        var data = executiveOfficerService.update(request);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping()
    public ResponseEntity<ExecutiveOfficerResponse> delete(Integer id) {

        var data = executiveOfficerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
