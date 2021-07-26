package sn.mit.edu.naissance.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.repository.RoleRepository;
import sn.mit.edu.naissance.repository.UsersRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	



	@Autowired
	private UsersRepository usersRepository;

	@Autowired
    private RoleRepository roleRepository;
	
	@Autowired
	EntityManager em;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<Long> findUserRolesByUserId(int userId) {
		// TODO Auto-generated method stub
		return usersRepository.findUserRolesByUserId(userId);
	}

	public User getLogedUser(HttpServletRequest httpServletRequest){
			
			HttpSession httpSession = httpServletRequest.getSession();
			SecurityContext securityContext = (SecurityContext) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
			
			if(securityContext == null)
				return null;
			
			String userName = securityContext.getAuthentication().getName();
			List<String> roles = new ArrayList<>();
			
			for(GrantedAuthority ga:securityContext.getAuthentication().getAuthorities()){
				roles.add(ga.getAuthority());
			}
			
			User user = usersRepository.findByUsername(userName);
			
			return user;
	}


@Override
public User findUserByEmail(String email) {
	
	return usersRepository.findByEmail(email);
}

@Override
public User findUserByUsername(String userName) {
	
	return usersRepository.findByUsername(userName);
}

@Override
public void saveUser(User user) {
	user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	usersRepository.save(user);
	
}
@Override
public String encryptPassword(String password) {
	
	return  bCryptPasswordEncoder.encode(password);
}


@Override
public boolean matche(String password, String encrypted) {
	
	return bCryptPasswordEncoder.matches(password,encrypted);
}


@Override
public List<User> findAll() {
	
	return usersRepository.findAll();
}


@Override
public void update(User user) {
	//user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	usersRepository.saveAndFlush(user);
	
}

@Override
public void delete(Long roleId, int userId) {
	usersRepository.delete(roleId, userId);
	
}
@Override
public User findUserByUsersId(int id) {
	// TODO Auto-generated method stub
	return usersRepository.findByUsersId(id);
}


@Override
public boolean findByIsEnabled(String username) {
	User user = usersRepository.findByUsername(username);

	if ((user.getIsEnabled() == false) || user.getIsEnabled() == null) {
		return false;
	}
	return true;
}

@Override
public void deleteUser(User user) {
	// TODO Auto-generated method stub
	usersRepository.delete(user);
	
}




}
