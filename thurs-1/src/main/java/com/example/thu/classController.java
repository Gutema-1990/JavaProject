package com.example.thu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class classController {
	@RequestMapping("cust")
	//@ResponseBody    ----used to return the data itself not what it do
 public String controller(HttpServletRequest req) {
	HttpSession session=req.getSession();
	String cname=req.getParameter("cname");
	session.setAttribute("cname", cname);
	 return "cust";
 }
}
