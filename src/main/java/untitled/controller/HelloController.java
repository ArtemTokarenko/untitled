package untitled.controller;


        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class HelloController{

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/")
    public String home() {
        return "untitled/home";
    }
}