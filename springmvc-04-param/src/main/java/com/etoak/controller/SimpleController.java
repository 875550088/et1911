package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用于测试简单的参数传递
 * 使用HttpRequest接受参数
 * 使用基本数据类型,String接收参数
 * 
 * @author Yh
 *
 */

@Controller
@RequestMapping("/simple")
public class SimpleController {
	
	@RequestMapping("/servlet")
	public String servlet(HttpServletRequest request) {
		
		//接收前端传入的参数
		String name = request.getParameter("name");
		
		if(StringUtils.isEmpty(name)) {
			name="World!";
		}
		//想request域传值
		request.setAttribute("result", "Hello" + name);
		return "param";
	}
	
	@RequestMapping(value="/simple",method= {RequestMethod.GET})
	public ModelAndView simple(
			@RequestParam(required=false,defaultValue = "1") int id,
			String name) {
		System.out.println("id param - " + id);
		System.out.println("name param - " + name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result","ModelAndView传值");
		mv.setViewName("param");
		return mv;
		
	}
	
	
	
	
	
	
	
	
	
}
