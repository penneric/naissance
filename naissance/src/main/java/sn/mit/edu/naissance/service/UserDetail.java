package sn.mit.edu.naissance.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.mit.edu.naissance.entity.User;
import sn.mit.edu.naissance.repository.UsersRepository;

@Service
@Transactional
public class UserDetail implements UserDetailsService {
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	//	 System.out.println(username + "  +++++++++loaduserbyUsername");
		 
		User user = usersRepository.findByUsername(username);
		
		if ( user== null) {
	//		System.out.println("  +++++++++Uers null");
			return null;
		}
		
	//	System.out.println(user.getPassword() +"  +++++++++password  ");
	//	System.out.println(user.getPassword() +"  +++++++++password  ");
		
		
		UserBuilder builder= null;
		
		builder = org.springframework.security.core.userdetails.User.withUsername(user.getUsername());
		builder.password(user.getPassword());
		builder.authorities(getAuthorities(user));
		
	//	System.out.println(getAuthorities(user) +"  +++++++++password  ");
		
		builder.disabled(!(user.getIsEnabled()));
		
		
		return builder.build();
	}
	
	private static Collection<? extends GrantedAuthority> getAuthorities(User user){
		
		String[] userRoles = user.getRoles().stream().map((roles) -> roles.getName()).toArray(String[]:: new);
		
		
		Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles);
		
		return authorities;
		
	}



	
	



}
