package com.yx.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yx.demo.model.ClientModel;


@Mapper
public interface IClientMapper {
	
	public List<ClientModel> selectListByAll() throws Exception;

}
