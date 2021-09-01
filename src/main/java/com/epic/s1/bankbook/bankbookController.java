package com.epic.s1.bankbook;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class bankbookController {
	//pojo (plain Old Java Object)
	
	@Autowired
	private BankbookService bankbookService;
	
	@RequestMapping(value =  "bankbookList.do", method = RequestMethod.GET)
	public ModelAndView list (ModelAndView mv) {
		
		ArrayList<BankbookDTO> ar = bankbookService.getList();
		
		for(BankbookDTO bankbookDTO : ar) {
			System.out.println(bankbookDTO.getBookName());
		}
		
		/*
		 * ModelAndView mv = new ModelAndView();
		 * mv.setViewName("bnakbook/bankbookList");
		 */
		
		return mv;
	}
	
	@RequestMapping("bankbookSelect")
	public String select(@RequestParam(defaultValue = "1", value = "n") Integer num, String name, Model model) {
		System.out.println("Value: "+num);
		System.out.println("Name : "+name);
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookName("BookName");
		model.addAttribute("dto", bankbookDTO);
		model.addAttribute("test", "iu");
		return "bankbook/bankbookSelect";
	}
	
	@RequestMapping("bankbookInsert.do")
	public String insert(BankbookDTO bankbookDTO) {
		System.out.println(bankbookDTO.getBookName());
		System.out.println("insert");
		return "redirect:../";
	}
	
}
