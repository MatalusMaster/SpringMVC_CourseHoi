package com.hophuocsang.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hophuocsang.entity.NhanVien;
import com.hophuocsang.entity.Test;

@Controller
public class TrangChuController {

	@RequestMapping("/")
	@ResponseBody
	public String TrangChu() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		NhanVien nhanvien = (NhanVien) context.getBean("nhanvien");
		nhanvien.getNhanVien();
		
		Test test = (Test) context.getBean("test");
		test.getTest();
		return "trangchu";
	}
}
