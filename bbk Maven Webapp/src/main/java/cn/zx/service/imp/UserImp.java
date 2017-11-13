package cn.zx.service.imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zx.mapping.UserMapper;
import cn.zx.model.User;
import cn.zx.model.UserExample;
import cn.zx.model.UserExample.Criteria;
import cn.zx.service.UserService;
@Service
public class UserImp implements UserService{
	@Autowired
	UserMapper usermapper;
	public List<User> allUser() {
		List<User> users=usermapper.selectByExample(new UserExample());
		return users;
	}
	public void insertUser(User u) {
		usermapper.insert(u);
		
	}
	public User validateUser(User u) {
		UserExample example=new UserExample();
		Criteria c=example.createCriteria();
		c.andNameEqualTo(u.getName());
		c.andPasswordEqualTo(u.getPassword());
		List<User> user=usermapper.selectByExample(example);
		if (user.isEmpty()) {
			return null;
		}
		return user.get(0);
		
	}
	

}
