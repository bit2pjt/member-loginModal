package com.spring.mml;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mypage.MyPageService;

@Controller
public class MmlController {

	@Autowired
	MmlService mmlServiceImpl;
	@Autowired
	MyPageService myPageService;


	@RequestMapping(value = "/mmlList.do", method = RequestMethod.GET)
	public String mmlList(Model model)throws Exception {

		
		List<Mml_ContentVO> mmlList = mmlServiceImpl.getMmlList();
		List<Mml_ContentVO> mmlList2 = mmlServiceImpl.getMmlList_like();

		System.out.println("mmlLlist======================" + mmlList);

		model.addAttribute("mmlList", mmlList);
		model.addAttribute("mmlList2", mmlList2);

		return "mml/mmlList";
	}

	@RequestMapping(value = "/mmlGet.do", method = RequestMethod.GET)
	public String mmlGet() {
		return "mml/mmlGet";
	}

	@RequestMapping(value = "/mmlWrite.do", method = RequestMethod.GET)
	public String mmlWrite() {
		return "mml/mmlWrite";
	}

	@RequestMapping(value = "/mmlFollowList.do", method = RequestMethod.GET)
	public String mmlFollow() {
		return "mml/mmlFollowList";
	}

	@RequestMapping(value = "/mmlMemberList.do", method = RequestMethod.GET)
	public String mmlMember(Model model, HttpSession session) {

		String e_mail = (String) session.getAttribute("m_email");

		int id = myPageService.getMemberId(e_mail);

		List<Mml_ContentVO> mmlList3 = mmlServiceImpl.getMmlList_user(id);

		model.addAttribute("mmlList3", mmlList3);

		return "mml/mmlMemberList";
	}
}
