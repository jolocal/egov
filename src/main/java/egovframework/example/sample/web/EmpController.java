package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.example.sample.service.EmpService;
import egovframework.example.sample.service.EmpVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmpController {

	@Resource(name="empService")
	private EmpService empService;
	

	@RequestMapping("/empWrite.do")
	public String empWrite() {
		return "emp/empWrite";
	}
	
	@RequestMapping("/empWriteSave.do")
	public String empWriteSave(EmpVO vo) throws Exception {
		empService.insertEmp(vo);
		return "save OK";
	}
	
	@RequestMapping(value = "/empList.do")
	public String selectEmpList(EmpVO vo, ModelMap model) throws Exception {

		List<?> list = empService.selectEmpList(vo);
		model.addAttribute("resultList", list);

		return "emp/empList";
	}
	
	@RequestMapping("/empDetail.do")
	public String selectEmpDetail(Integer empno, ModelMap model) throws Exception {
		log.info("----------controller selectEmpDetail----------");
		model.addAttribute("empDetail",empService.selectEmpDetail(empno));
		return "emp/empDetail";
	}
	
	@RequestMapping("/deleteEmp.do")
	public String deleteEmp(Integer empno) {
		log.info("----------controller deleteEmp----------");
		empService.deleteEmp(empno);
		return "forward:/empList.do";
	}
}
