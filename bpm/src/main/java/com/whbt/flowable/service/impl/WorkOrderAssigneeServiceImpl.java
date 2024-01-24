package com.whbt.flowable.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whbt.flowable.mapper.WorkOrderAssigneeMapper;
import com.whbt.flowable.model.po.WorkOrderAssignee;
import com.whbt.flowable.service.WorkOrderAssigneeService;

@Service
public class WorkOrderAssigneeServiceImpl implements WorkOrderAssigneeService{
	
	@Autowired
	private WorkOrderAssigneeMapper workOrderAssigneeMapper;

	@Override
	public List<WorkOrderAssignee> selectSelective(WorkOrderAssignee workOrderAssignee) {
		return workOrderAssigneeMapper.selectSelective(workOrderAssignee);
	}

	@Override
	public WorkOrderAssignee selectByPrimaryKey(String orderId, Integer assigneeVersion, String assignee) {
		return workOrderAssigneeMapper.selectByPrimaryKey(orderId, assigneeVersion, assignee);
	}

	@Override
	public int insert(WorkOrderAssignee workOrderAssignee) {
		return workOrderAssigneeMapper.insert(workOrderAssignee);
	}

	@Override
	public int updateByPrimaryKey(WorkOrderAssignee workOrderAssignee) {
		return workOrderAssigneeMapper.updateByPrimaryKey(workOrderAssignee);
	}

	@Override
	public int deleteByPrimaryKey(String orderId, Integer assigneeVersion, String assignee) {
		return workOrderAssigneeMapper.deleteByPrimaryKey(orderId, assigneeVersion, assignee);
	}

}
