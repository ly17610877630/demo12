package com.liyi.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyi.cms.dao.PlanDao;
import com.liyi.cms.pojo.Plan;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanDao planDao;

	@Override
	public PageInfo<Plan> selectPlan(Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Plan> list = planDao.selectPlan();
		return new PageInfo<Plan>(list);
	}
}
