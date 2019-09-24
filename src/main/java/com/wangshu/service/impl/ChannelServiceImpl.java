package com.wangshu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangshu.dao.ChannelMapper;
import com.wangshu.entity.Channel;
import com.wangshu.service.ChannelService;
/**
 * 
 * @author 王澍
 *
 */
@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelMapper channelMapper;
	
	@Override
	public List<Channel> getChannels() {
		// TODO Auto-generated method stub
		return channelMapper.getChannels();
	}
	

}
