package com.picshare.member;

import com.picshare.member.entity.RoleEntity;
import com.picshare.member.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PicshareMemberApplicationTests {

	@Autowired
	RoleService roleService;

	@Test
	void contextLoads() {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleName("admin");
		roleEntity.setRoleDescription("管理员");
//		roleService.save(roleEntity);
	}

}
