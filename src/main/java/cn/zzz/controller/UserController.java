package cn.zzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zzz.po.User;
import cn.zzz.service.UserService;

@Controller
public class UserController {
	@Autowired
	public UserService userService;

	@RequestMapping("/findAll")
	public @ResponseBody
	List<User> findAll() {
		List<User> users = userService.findAll();
		return users;
	}

}
