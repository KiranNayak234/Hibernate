package com.jsp.service;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

public class UserService {
	UserDao dao=new UserDao();
  public User save(User user) {
	  return dao.save(user);
  }
  
  public User delete(User user) {
	  return dao.delete(user);
  }
  
  public User update(User user) {
	  return dao.delete(user);
  }
}
