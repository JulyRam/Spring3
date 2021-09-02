package com.epic.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public List<BankbookDTO> getList(){
		return bankbookDAO.getList();
	}
	
	public BankbookDTO getSelect(BankbookDTO bankbookDTO) {
		System.out.println("Service : "+bankbookDTO.getBookNumber());
		return bankbookDAO.getSelect(bankbookDTO);
	}

}