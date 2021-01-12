package com.store.mybatis;

import com.csasc.store.Application;
import com.csasc.store.modules.ums.dao.UmsAdminRoleRelationDao;
import com.csasc.store.modules.ums.mapper.UmsAdminMapper;
import com.csasc.store.modules.ums.mapper.UmsPermissionMapper;
import com.csasc.store.modules.ums.model.UmsAdmin;
import com.csasc.store.modules.ums.model.UmsPermission;
import com.csasc.store.modules.ums.service.UmsAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@EnableAutoConfiguration
public class TestMybatis {

    @Autowired
    UmsAdminRoleRelationDao umsAdminRoleRelationDao;
    @Autowired
    UmsAdminMapper umsAdminMapper;
    @Autowired
    UmsAdminService umsAdminService;
    @Test
    public void test01(){
        List<UmsPermission> permissionList = umsAdminRoleRelationDao.listAllPermission();
        for (UmsPermission persion:permissionList
             ) {
            System.out.println(persion.toString());
        }
    }

    @Test
    public void test03(){
        List<UmsPermission> permissionList = umsAdminRoleRelationDao.getPermissionList(3L);
        for (UmsPermission persion:permissionList
        ) {
            System.out.println(persion.toString());
        }
    }

    @Test
    public void test04(){
//        List<UmsAdmin> umsAdmins = umsAdminService.selectByName("test");
        List<UmsAdmin> umsAdmins = umsAdminService.list();
        for (UmsAdmin admin:
             umsAdmins) {
            System.out.println(admin.toString());
        }
    }

}
