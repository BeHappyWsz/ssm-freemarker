package freemarker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import freemarker.service.IndexService;

@Controller
public class IndexController {

	@Autowired
	private IndexService indesService;
	
	@ResponseBody
	@RequestMapping("/free")
	public ModelAndView free() {
		indesService.index();
		ModelAndView mav = new ModelAndView("/free");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		mav.addObject("aa", "haha");
		mav.addObject("list", list);
		return mav;
	}
	
}
