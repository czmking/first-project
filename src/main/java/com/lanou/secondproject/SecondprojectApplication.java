package com.lanou.secondproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@Controller
@RequestMapping("/")

public class SecondprojectApplication {


	public static void main(String[] args) {
		SpringApplication.run(SecondprojectApplication.class, args);
	}
	@RequestMapping("register")
	@ResponseBody
	public ModelAndView register(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("register");
		return modelAndView;

	}
	@RequestMapping("login")
	public ModelAndView login(@RequestParam String acc,@RequestParam String pwd){
		ModelAndView modelAndView=new ModelAndView();
		Map<String,String> map=new HashMap<String, String>();
		map.put("acc",acc);
		map.put("pwd",pwd);
		user.lists.add(map);

		System.out.println(8888);
		if (acc!=""&&pwd!=""){
		modelAndView.setViewName("login");
		return modelAndView;
		}else{
			modelAndView.setViewName("register");
			return modelAndView;
		}
	}
	@RequestMapping("success")
	public ModelAndView success(@RequestParam String acc,@RequestParam String pwd){
		ModelAndView modelAndView = new ModelAndView();
		for (Map<String, String> map : user.lists) {
			if (acc.equals(map.get("acc"))&&pwd.equals(map.get("pwd"))) {
				modelAndView.addObject("acc", acc);
				modelAndView.setViewName("success");
				return modelAndView;
			} else {
			}
		}
		modelAndView.setViewName("login");
		return modelAndView;

	}
	@RequestMapping("query")
	public ModelAndView successs(@RequestParam String acc){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", user.lists);
		if(acc.equals("")){
			modelAndView.setViewName("query");
			return modelAndView;
		}else{
			modelAndView.addObject("acc",acc);
			modelAndView.setViewName("query");
			return modelAndView;
		}



	}
}
