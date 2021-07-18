package sn.mit.edu.naissance.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sn.mit.edu.naissance.entity.HistoriqueUser;
import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;


@Repository("UsersRepository")
public interface UsersRepository extends JpaRepository<User, Integer> {
	
	ArrayList<User> findAll();
	User findByUsername (String username);
	boolean findByIsEnabled(String username);
	User findByPassword (String password);
	User findByEmail(String email);
	User findByUsersId(int userid);
	
	
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM user_roles WHERE user_roles.user_id = :userId AND user_roles.role_id = :roleId",
					nativeQuery = true)
	void delete (@Param("roleId") long roleId, @Param ("userId") int userId);
	
	@Query(value = "SELECT user_roles.role_id FROM user_roles WHERE user_roles.user_id = :userId",
					nativeQuery = true)
	
	List<Long> findUserRolesByUserId(@Param("userId") int userId);
	
	List<HistoriqueUser> findHistoriqueUserByUsersId(int usersId);
	

	

}
