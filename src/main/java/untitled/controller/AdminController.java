package untitled.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import untitled.bean.AdminBean;
import untitled.service.AdminService;


import java.io.IOException;
import java.text.ParseException;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @RequestMapping(value = "/create-admin", method = RequestMethod.POST)
    @ResponseBody
    public AdminBean createAdmin(@RequestBody AdminBean adminBean) throws ParseException {
        return adminService.createAdmin(adminBean);
    }


    @RequestMapping(value = "/delete-admin",method = RequestMethod.POST)
    @ResponseBody
    public String deleteAdmin(@RequestBody int id){
        return adminService.deleteAdmin(id);
    }



    






}
