package sn.mit.edu.naissance.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.userdetails.UserDetails;

import sn.mit.edu.naissance.entity.User;

public interface UserService {
	
	 	public User getLogedUser(HttpServletRequest httpServletRequest);
		public User findUserByEmail(String email);
		public User findUserByUsername(String userName);
		public void saveUser(User user);
		public User findUserByUsersId(int id);
	    public  String encryptPassword(String password);
	    public  boolean matche(String password,String encrypted);
		public List<User> findAll();
		public void update(User user);
		public void deleteUser(User user);
		public void delete(Long roleId, int userId);
		public List<Long> findUserRolesByUserId(int userId);
		public boolean findByIsEnabled(String username);
		
		

}
