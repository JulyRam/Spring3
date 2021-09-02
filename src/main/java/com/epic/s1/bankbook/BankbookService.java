package com.epic.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankbookService {
	
	@Autowired
	private BankbookDAO bankBookDAO;
	
	public int setInsert(BankbookDTO bankBookDTO) {
		return bankBookDAO.setInsert(bankBookDTO);
	}
	
	public List<BankbookDTO> getList(){
		return bankBookDAO.getList();
	}
	
	public BankbookDTO getSelect(BankbookDTO bankBookDTO) {
		return bankBookDAO.getSelect(bankBookDTO);
	}

}