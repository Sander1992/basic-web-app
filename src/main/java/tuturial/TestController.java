package tuturial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sander on 22.04.2015.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String view(){
        return "view";
    }
}
