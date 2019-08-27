package com.yx.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yx.demo.mapper.IClientMapper;
import com.yx.demo.model.ClientModel;
import com.yx.demo.service.IClientService;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientMapper cm;

	@Override
	public List<ClientModel> getListByAll() throws Exception {
		return cm.selectListByAll();
	}

}
