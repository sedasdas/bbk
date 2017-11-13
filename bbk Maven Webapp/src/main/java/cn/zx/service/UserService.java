package cn.zx.service;

import java.util.List;

import cn.zx.model.User;



public interface UserService {
	
	List<User> allUser();
	void insertUser(User u);
	User validateUser(User u);
	
}
