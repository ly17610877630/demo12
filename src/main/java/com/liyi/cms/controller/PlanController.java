package com.liyi.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.liyi.cms.pojo.Plan;
import com.liyi.cms.service.PlanService;

@Controller
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	@RequestMapping("selectPlan")
	public String selectPlan(Model model, @RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<Plan> info = planService.selectPlan(page, pageSize);
		model.addAttribute("info", info);
		return "selectPlan";
	}
}
