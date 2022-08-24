import member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import present.Present;
import service.recommendService;

@Controller
public class recommendController {

    @Autowired
    recommendService Recommendservice;

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public void join(Member member) {
        Recommendservice.join(member);
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public void result(Present present) {

    }
}
