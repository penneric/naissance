package sn.mit.edu.naissance.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.mit.edu.naissance.entity.Roles;
import sn.mit.edu.naissance.entity.User;

@Repository("userRolesRepository")
public interface UserRolesRepository extends JpaRepository<User, Integer> {
//	
//	default List<Roles> findByUsersId(int usersId, EntityManager em){
//		
//		String query="";
//		javax.persistence.Query q;
//		String userRolesQuery;
////		SELECT * FROM `userRoles` WHERE `user_id`=1 
//		query = "SELECT * FROM user_roles p WHERE p.user_id=:users_id";
//		
//		q = em.createQuery(query);
//		q.setParameter("userId", usersId);
//		
//		
//		return q.getResultList();
//	};
	
	
}
