package com.epic.s1.bankbook;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epic.s1.util.Pager;

@Repository
public class BankbookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.epic.s1.bankbook.BankbookDAO.";
	
	public int setDelete(Long bookNumber) {
		return sqlSession.delete(NAMESPACE+"setDelete", bookNumber);
	}
	
	public int setInsert(BankbookDTO bankBookDTO) {
		return sqlSession.insert(NAMESPACE+"setInsert", bankBookDTO);
	}
	
	public List<BankbookDTO> getList(Pager pager){
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	public BankbookDTO getSelect(BankbookDTO bankBookDTO) {
		System.out.println("DAO : "+bankBookDTO.getBookNumber());
		return sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
	}
	
	public int setUpdate (BankbookDTO bankbookDTO) {
		return sqlSession.update(NAMESPACE+"setUpdate", bankbookDTO);
	}
	
	public Long getCount (Pager pager) {
		return sqlSession.selectOne(NAMESPACE+"getCount", pager);
	}

}