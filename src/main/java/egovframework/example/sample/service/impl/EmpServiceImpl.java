package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.EmpService;
import egovframework.example.sample.service.EmpVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("empService")
public class EmpServiceImpl extends EgovAbstractServiceImpl
							implements EmpService {
	
	@Resource(name = "empDAO")
	private EmpDAO empDAO;
	
	@Override
	public String insertEmp(EmpVO vo) throws Exception {
		return empDAO.insertEmp(vo);
	}

	@Override
	public List<?> selectEmpList(EmpVO vo) {
		return empDAO.selectEmpList(vo);
	}

	@Override
	public EmpVO selectEmpDetail(Integer empno) throws Exception {
		return empDAO.selectEmpDetail(empno);
	}

	@Override
	public void deleteEmp(Integer empno) {
		empDAO.deleteEmp(empno);
	}
}
