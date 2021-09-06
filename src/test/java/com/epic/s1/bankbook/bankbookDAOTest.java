package com.epic.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.epic.s1.MyJunitTest;

public class bankbookDAOTest extends MyJunitTest {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	//@Test
	public void setUpdateTest() {
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(11085212345L);
		bankbookDTO.setBookName("Update Name");
		bankbookDTO.setBookRate(1.51);
		bankbookDTO.setBookSale(1);
		int result = bankbookDAO.setUpdate(bankbookDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void setDeleteTest() {
		int result =  bankbookDAO.setDelete(11074112345L);
		assertEquals(1, result);
	}
	
	@Test
	public void setInsertTest() throws Exception {
		Random random = new Random();
		for(int i=0;i<200;i++) {
		
			BankbookDTO bankBookDTO = new BankbookDTO();
			bankBookDTO.setBookName("BookName"+i);
			int rate = random.nextInt(400);
			
			bankBookDTO.setBookRate(rate/100.0);
			bankBookDTO.setBookSale(random.nextInt(2));
			int result = bankbookDAO.setInsert(bankBookDTO);
			
			if(i%10==0) {
				Thread.sleep(500);
			}
			
		}
	
	//@Test
		public void getListTest() {
			List<BankbookDTO> ar = bankbookDAO.getList();
			assertNotEquals(0, ar.size());
		}
		
		//@Test
		public void getSelectTest() {
			BankbookDTO bankBookDTO = new BankbookDTO();
			bankBookDTO.getBookNumber(1000);
			bankBookDTO = bankbookDAO.getSelect(bankBookDTO);
			//System.out.println(bankBookDTO.getBookName());
			assertNotNull(bankBookDTO);
		}

}
