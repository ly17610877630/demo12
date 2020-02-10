package com.liyi.cms.service;

import com.github.pagehelper.PageInfo;
import com.liyi.cms.pojo.Plan;

public interface PlanService {
	PageInfo<Plan> selectPlan(Integer page, Integer pageSize);
}
