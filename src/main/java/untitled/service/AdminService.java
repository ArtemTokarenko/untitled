package untitled.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import untitled.bean.AdminBean;
import untitled.entity.Admin;
import untitled.enumm.Role;
import untitled.repository.AdminRepository;

import javax.persistence.EntityManagerFactory;
import java.text.ParseException;
import java.util.Date;

@Service
public class AdminService {



    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private EntityManagerFactory emf;


//
//    public Container<Page<OperatorBean>> findAllOperators(Integer pageNumber, Integer pageSize) {
//        Container<Page<OperatorBean>> container = new Container<>();
//        Page<Operator> page = operatorRepository.findAll(new PageRequest(pageNumber, pageSize));
//        container = containerUtil.setCountContainer(container);
//        container.setData(new PageImpl<>(page.getContent().
//                stream().map(OperatorBean::toBean).collect(Collectors.toList()),
//                new PageRequest(pageNumber, pageSize), page.getTotalElements()));
//        return container;
//    }
//
//    public Container<OperatorBean> findOperatorById(Integer id) {
//        Container<OperatorBean> container = new Container<>();
//        container = containerUtil.setCountContainer(container);
//        container.setData(OperatorBean.toBean(operatorRepository.findOne(id)));
//        return container;
//    }





    public AdminBean createAdmin(AdminBean adminBean) throws ParseException {
        Admin admin = new Admin();
        admin.setLogin(adminBean.getLogin());
        admin.setPassword(adminBean.getPassword());
        admin.setEmail(adminBean.getEmail());
        admin.setCreatedDate(new Date());
//        admin.setRole(Role.ROLE_ADMIN);
        admin.setBan(false);

        adminRepository.save(admin);

        return AdminBean.toBean(admin);
    }

    public String findAdmin(int id){
        return adminRepository.getAdminLogin(id);
    }

    public String deleteAdmin(int id){
       String adminLogin =  findAdmin(id);
        adminRepository.deleteAdmin(id);

        return "User "+adminLogin+" was deleted wrom database";
    }



}
