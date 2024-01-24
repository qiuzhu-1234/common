package com.whbt.flowable.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.whbt.config.mybatis.UsingDefaultDB;
import com.whbt.flowable.model.dto.MyDealWorkOrderDto;
import com.whbt.flowable.model.po.WorkOrder;

/**
 * 工单Mapper
 */
@UsingDefaultDB
public interface WorkOrderMapper {
	
	/**新增*/
	public int insert(WorkOrder workOrder);

	int updateWorkOrder(WorkOrder workOrder);
	
	/**待我处理的工单查询*/
	public List<MyDealWorkOrderDto> listMyDeal(@Param("userId") String userId);
	
	/**listMyApply我申请的工单查询*/
	public List<WorkOrder> listMyApply(@Param("userId") String userId);
	
	/**我已处理的的工单查询*/
	public List<WorkOrder> listMyExamAndApprove(@Param("userId") String userId);
	
	public WorkOrder queryByOrderId(@Param("orderId") String orderId);
	
}