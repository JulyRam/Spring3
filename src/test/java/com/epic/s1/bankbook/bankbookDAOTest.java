package com.epic.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.epic.s1.MyJunitTest;

public class bankbookDAOTest extends MyJunitTest {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	@Test
	public void setDeleteTest() {
		int result =  bankbookDAO.setDelete(11074112345L);
		assertEquals(1, result);
	}
	
	//@Test
	public void setInsert() {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookName("Spring");
		bankbookDTO.setBookRate(3.35);
		bankbookDTO.setBookSale(1);
		int result = bankbookDAO.setInsert(bankbookDTO);
		assertEquals(1, result);
	}
	
	//@Test
		public void getListTest() {
			List<BankbookDTO> ar = bankbookDAO.getList();
			assertNotEquals(0, ar.size());
		}
		
		//@Test
		public void getSelectTest() {
			BankbookDTO bankBookDTO = new BankbookDTO();
			bankBookDTO.setBookNumber(1000);
			bankBookDTO = bankbookDAO.getSelect(bankBookDTO);
			//System.out.println(bankBookDTO.getBookName());
			assertNotNull(bankBookDTO);
		}

}
