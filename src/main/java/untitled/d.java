package untitled;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/g")
public class d {

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public String  deleteVideo() {
       return "2343";
    }

}
