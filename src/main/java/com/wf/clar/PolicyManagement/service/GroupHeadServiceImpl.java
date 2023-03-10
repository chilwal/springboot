package com.wf.clar.PolicyManagement.service;

import com.wf.clar.PolicyManagement.dao.GroupHeadDao;
import com.wf.clar.PolicyManagement.model.dto.GroupHeadResponse;
import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupHeadServiceImpl implements GroupHeadService {
    @Autowired
    private GroupHeadDao groupHeadDao;

    @Override
    public List<GroupHeadResponse> findAll() {
        Comparator<GroupHeadResponse> comparator =Comparator.comparing(GroupHeadResponse::getSortOrderId);

        return groupHeadDao.findAll().stream()
                .map(this::createGetResponse)
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    @Override
    public void save(GroupHeadEntity gh1) {
          groupHeadDao.save(gh1);
    }

    private GroupHeadResponse createGetResponse(GroupHeadEntity groupHeadEntity) {

        return GroupHeadResponse.builder()
                .id(groupHeadEntity.getGroupHeadId())
                .crhKey(groupHeadEntity.getCrhKey())
                .eluid(groupHeadEntity.getEluid())
                .alignmentName(groupHeadEntity.getAlignmentName())
                .status(groupHeadEntity.getStatus())
                .sortOrderId(groupHeadEntity.getSortOrderId())
                .createdOn(groupHeadEntity.getCreatedOn())
                .createdBy(groupHeadEntity.getCreatedBy())
                .updatedOn(groupHeadEntity.getUpdatedOn())
                .updatedBy(groupHeadEntity.getUpdatedBy())
                .executiveOfficers(groupHeadEntity.getExecutiveOfficers())
                .build();

    }


}
