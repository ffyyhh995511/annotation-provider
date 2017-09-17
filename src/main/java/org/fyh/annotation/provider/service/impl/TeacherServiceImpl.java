package org.fyh.annotation.provider.service.impl;

import org.fyh.annotation.provider.service.TeacherService;
@com.alibaba.dubbo.config.annotation.Service
public class TeacherServiceImpl implements TeacherService{

	public String getTeacherName() {
		return "i am test teacher";
	}

}
