package com.cns.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class AppController {
	
	@RequestMapping(value = "/getDemo",produces={"application/json"},method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	@ApiOperation(value="获取demo",notes="获取demo")
	@ApiImplicitParams({ 
		@ApiImplicitParam(paramType="query",dataType="String",name="id",value="ID",required=false),
	}) 
	public Object getReadCount(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("data", id);
		
		return map;
	}

}
