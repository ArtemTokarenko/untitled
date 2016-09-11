package untitled.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import untitled.bean.ClientBean;
import untitled.service.ClientService;





import java.text.ParseException;

/**
 * Created by Ультрамар on 10.09.2016.
 */
@Controller
@RequestMapping(value = "/sign-up")
public class SignUpController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/create-new-client", method = RequestMethod.POST)
    @ResponseBody
    public ClientBean createClient(@RequestBody ClientBean clientBean) throws ParseException {
        return clientService.createClient(clientBean);
    }

}
