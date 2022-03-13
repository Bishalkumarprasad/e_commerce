package com.capgemini.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.ecommerce.model.User;
import java.util.ArrayList;
@Controller
public class AppController {
		
		private static ArrayList<User> userList;
		static {
			userList = new ArrayList<User>();
		}
		@RequestMapping("/login")
		public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

			String userName = request.getParameter("username");
			String password = request.getParameter("password");
//			System.out.println(userName+" "+password);
			//Admin Root
			boolean loginStatus = false;
			for(User user:userList) {
			if(userName.equals(user.getUserName())&&password.equals(user.getPassword())) {
				loginStatus=true;
				break;
			}
			}
			ModelAndView mv = new ModelAndView();
			mv.setViewName("welcome.jsp");
			
			mv.addObject("loginStatus",loginStatus);
			mv.addObject("userName",userName);
			return mv;
		}

		@RequestMapping("/register")
		public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
			
			String userName = request.getParameter("username");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			int phone = Integer.parseInt(request.getParameter("phone"));
			User user = new User(userName,email,password,address,phone);
			userList.add(user);
			ModelAndView mv= new ModelAndView();
			mv.setViewName("index.jsp");
			mv.addObject("reg_status",true);
			System.out.println(user);
			return mv;
					
		}
	}

