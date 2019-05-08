package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Member;
import com.example.demo.persistence.MemberDAO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO dao;
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public ModelAndView joinForm(ModelAndView mav) {
		mav.setViewName("member/joinForm");
		
		return mav;
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(Member member, Model model) throws Exception {

		dao.create(member);
		model.addAttribute("msg", "SUCCESS");
		return "/index";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() throws Exception {
		
		return "member/loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Member member, 
						Model model,
						HttpSession session
			) throws Exception {
		
		member = dao.select(member.getUserid());

		if(member != null) {
			session.setAttribute("loginMember", member);
			
			model.addAttribute("member", member);
			
			return "/index";
		}else {
			model.addAttribute("msg", "FAIL");
			return "member/loginForm";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping("/updateForm")
	public String updateForm() {
		
		return "member/updateForm";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Member member, HttpSession session) throws Exception {
		
		dao.update(member);
		session.setAttribute("loginMember", member);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/deleteForm", method = RequestMethod.GET)
	public String deleteForm() throws Exception {

		return "member/deleteForm";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(HttpSession session, Model model) throws Exception {
		
		int result = dao.delete( ((Member)session.getAttribute("loginMember")).getUserid() );
		
		if(result==1) {
			session.invalidate();
			model.addAttribute("msg", "SUCCESS");
			return "/index";
		}else {
			model.addAttribute("msg", "FAIL");
			return "/index";
		}
		
	}
}
