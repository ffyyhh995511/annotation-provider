package org.fyh.annotation.provider.service.impl;

import org.fyh.annotation.provider.service.StudentService;
@com.alibaba.dubbo.config.annotation.Service
public class StudentServiceImpl implements StudentService{

	public String getStudent() {
		return "i am test student";
	}

}
