package com.epic.s1.bankbook;

import java.util.ArrayList;

public class BankbookService {
	
	private BankbookDAO bankbookDAO;
	
	public BankbookService() {
		bankbookDAO = new BankbookDAO();
	}
	
	public ArrayList<BankbookDTO> getList (){
		ArrayList<BankbookDTO> ar = bankbookDAO.getList();
		return ar;
	}

}
