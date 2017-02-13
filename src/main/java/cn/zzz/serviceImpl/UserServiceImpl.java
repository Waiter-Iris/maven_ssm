package cn.zzz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zzz.mapper.UserMapper;
import cn.zzz.po.User;
import cn.zzz.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	public UserMapper userMapper;


	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

}
