/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package stocksys.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <pre>
 * [HelloController] 2020-03-31 23:30
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

	@ResponseBody
	@RequestMapping("/hi")
	public String sayHi() {
		return "Say hi";
	}

	@ResponseBody
	@RequestMapping("/yes")
	public String sayYes() {
		return "Say yes";
	}
}
