package com.epic.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epic.s1.util.Pager;

@Service
public class BankbookService {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	public int setDelete(Long bookNumber) {
		return bankbookDAO.setDelete(bookNumber);
	}
	
	public int setInsert(BankbookDTO bankBookDTO) {
		return bankbookDAO.setInsert(bankBookDTO);
	}
	
	public List<BankbookDTO> getList(Pager pager){
		System.out.println(pager.getKind());
		System.out.println(pager.getSearch());
		//totalCount ±¸ÇÏ±â
		Long totalCount = bankbookDAO.getCount(pager);
		pager.makeNum(totalCount);
		pager.makeRow();
		return bankbookDAO.getList(pager);
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) {
		System.out.println("Service : "+bankbookDTO.getBookNumber());
		return bankbookDAO.getSelect(bankbookDTO);
	}
	
	public int setUpdate (BankbookDTO bankbookDTO)	{
		return bankbookDAO.setUpdate(bankbookDTO);
	}

}