package com.wf.clar.PolicyManagement;

import com.wf.clar.PolicyManagement.model.entity.ExecutiveOfficerEntity;
import com.wf.clar.PolicyManagement.model.entity.GroupHeadEntity;
import com.wf.clar.PolicyManagement.repository.ExecutiveOfficerRepository;
import com.wf.clar.PolicyManagement.repository.GroupHeadRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Date;

@SpringBootApplication
public class PolicyManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PolicyManagementApplication.class, args);
	}
	@Autowired
	private GroupHeadRepository groupHeadRepository;

	@Autowired
	private ExecutiveOfficerRepository executiveOfficerRepository;

	@Override
	public void run(String... args) throws Exception {

		/*for (int i=1;i<10;i++) {
			GroupHeadEntity groupHeadEntity = new GroupHeadEntity();
			groupHeadEntity.setCrhKey(1000+i);
			groupHeadEntity.setEluid("E00"+i);
			groupHeadEntity.setAlignmentName("Business Group");
			groupHeadEntity.setStatus(1);
			groupHeadEntity.setSortOrderId(i);
			groupHeadEntity.setCreatedOn(new Date());
			groupHeadEntity.setCreatedBy("DC"+i);
			groupHeadEntity.setUpdatedOn(new Date());
			groupHeadEntity.setUpdatedBy("DC CD"+i);

			groupHeadRepository.save(groupHeadEntity);
		}

		for (int i=1;i<25;i++) {
			ExecutiveOfficerEntity executiveOfficerEntity = new ExecutiveOfficerEntity();
			Integer x=1;
			if(i<10) {
				  x=i;

			}else {
				x=i%2;
			}
			executiveOfficerEntity.setGroupHeadId(x);
			executiveOfficerEntity.setEluid("E00"+i);
			executiveOfficerEntity.setStatus('Y');
			executiveOfficerEntity.setSortOrderId(i);
			executiveOfficerEntity.setCreatedOn(new Date());
			executiveOfficerEntity.setCreatedBy("DC"+i);
			executiveOfficerEntity.setUpdatedOn(new Date());
			executiveOfficerEntity.setUpdatedBy("DC CD"+i);

			executiveOfficerRepository.save(executiveOfficerEntity);
		}*/

	}
}
