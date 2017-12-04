package kr.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.board.bean.BoardBean;
import kr.board.common.Paging;
import kr.board.service.BoardService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	private Logger logger = Logger.getLogger(getClass());
	
	//게시판 메인
	@RequestMapping("/index")
	public ModelAndView main(HttpServletRequest request, @ModelAttribute Paging paging){
		ModelAndView mav = new ModelAndView("/main");

		return mav;
	}
}
