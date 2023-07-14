package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.EmpVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("empDAO")
public class EmpDAO extends EgovAbstractDAO {
	
	public String insertEmp(EmpVO vo) throws Exception {
		return (String) insert("empDAO.insertEmp", vo);
	}

	public List<?> selectEmpList(EmpVO vo) {
		return list("empDAO.selectEmpList", vo);
		
	}
	
	public EmpVO selectEmpDetail(Integer empno) throws Exception {
		return (EmpVO) select("empDAO.selectEmpDetail",empno);
	}
	
	public void deleteEmp(Integer empno) {
		delete("empDAO.deleteEmp",empno);
	}
}
