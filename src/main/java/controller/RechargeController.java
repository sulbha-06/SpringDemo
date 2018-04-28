package controller;
@controller
public class RechargeController {
@RequestMapping("/hello")
public ModelAndView helloWorld {
	String message = "hello welcome to recharge service";
	return new ModelAndView("hellopage","mesage",message);
	
}
}
