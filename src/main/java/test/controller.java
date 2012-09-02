package test;
/**
 * Created by IntelliJ IDEA.
 * User: vulp
 * Date: 9/2/12
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class controller {

    @RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("message", name);
		return "hello";

	}
}
