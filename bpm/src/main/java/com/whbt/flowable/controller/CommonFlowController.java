package com.whbt.flowable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whbt.flowable.service.CommonFlowService;

/**
 * 通用流程控制器
 * 流程测试：http://localhost:8080/commonFlow/testCommonExamineAndApproveFlow
 */
@Validated
@RestController
@RequestMapping("/commonFlow")
public class CommonFlowController {
	
	@Autowired
	private CommonFlowService commonFlowService;
	
    /**
     * 进行一个完整的流程测试
     * @return
     */
	//@ApiOperation(value = "testCommonExamineAndApproveFlow",httpMethod= "GET")
    @GetMapping("/testCommonExamineAndApproveFlow")
    public String testCommonExamineAndApproveFlow() {
       
    	String businessKey = "ZB" + System.currentTimeMillis();
    	commonFlowService.testCommonExamineAndApproveFlow(businessKey);
    	
    	return "testCommonExamineAndApproveFlow ok.";
    }

}
