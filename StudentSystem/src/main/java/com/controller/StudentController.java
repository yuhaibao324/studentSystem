package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Student;
import com.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	/*@Autowired
	private StudentService studentService = null;*/

	// 欢迎页面
	@RequestMapping("/index")
	public String hello() {
		return "index";
	}

	
	/*// 查询信息
	@RequestMapping(value = "/result")
	public ModelAndView welcome1(@RequestParam("id") int id) {//接受前端的信息
		ModelAndView mav = new ModelAndView();

		Student student = studentService.select(id);

		mav.addObject("id", student.getId());
		mav.addObject("name", student.getName());
		mav.addObject("chinese", student.getChinese());
		mav.addObject("math", student.getMath());
		mav.addObject("english", student.getEnglish());

		mav.setViewName("result");

		return mav;
	}
*/
	/*
	 * // 增加信息
	 * 
	 * @RequestMapping(value = "/save", method = RequestMethod.POST) public String
	 * save(Model model, Student student) { studentService.save(student); return
	 * "redirect:/student"; }
	 */
}
