package com.epic.s1.bankbook;

import java.util.List;

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
public class BankbookController {
	
	@Autowired
	private BankbookService bankBookService;
	
	
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv) {
		
		List<BankbookDTO> ar = bankBookService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");
		
		return mv;
	}
	
	@RequestMapping("bankbookSelect")
	public void select(BankbookDTO bankBookDTO, Model model) {
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		model.addAttribute("dtov", bankBookDTO);
	}
	
	@RequestMapping("bankbookInsert.do")
	public String insert(BankbookDTO bankBookDTO) {
		System.out.println(bankBookDTO.getBookName());
		System.out.println("insert");
		return "redirect:../";
	}
	

}