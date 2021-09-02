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
	private BankbookService bankbookService;
	
	
	@RequestMapping("bankbookList")
	public ModelAndView list(ModelAndView mv) {
		
		List<BankbookDTO> ar = bankbookService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("bankbook/bankbookList");
		
		return mv;
	}
	
	@RequestMapping("bankbookSelect")
	public void select(HttpServletRequest request, BankbookDTO bankbookDTO, Model model) {
//		String bn = request.getParameter("bookNumber");
//		long l = Long.parseLong(bn);
//		BankBookDTO banDto = new BankBookDTO();
//		banDto.setBookNumber(l);
		System.out.println("select");
		System.out.println(bankbookDTO.getBookNumber());
		
		bankbookDTO = bankbookService.getSelect(bankbookDTO);
		System.out.println("Name : "+bankbookDTO.getBookName());
		model.addAttribute("dto", bankbookDTO);
	}
	
	@RequestMapping(value="bankbookInsert", method = RequestMethod.GET)
	public void insert() {}
	
	@RequestMapping(value="bankbookInsert", method = RequestMethod.POST)
	public String insert(BankbookDTO bankbookDTO) {
		int result = bankbookService.setInsert(bankbookDTO);
		
		return "redirect:./bankbookList";
		
	}
	
	@RequestMapping("bankbookDelete")
	public String delete(Long bookNumber) {
		int result = bankbookService.setDelete(bookNumber);
		
		return "redirect:./bankbookList";
	}

}