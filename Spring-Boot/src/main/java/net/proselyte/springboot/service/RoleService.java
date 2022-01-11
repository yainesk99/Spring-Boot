package net.proselyte.springboot.service;

import net.proselyte.springboot.dao.RoleDao;
import net.proselyte.springboot.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleDao roleDao;

    public Role getRoleById(Long id) {return roleDao.getRoleById(id);}

    public List<Role> listRole() {
        return roleDao.listRole();
    }
}
