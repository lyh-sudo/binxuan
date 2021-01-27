package com.vito16.shop.repository;

import com.vito16.shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User DAO
 * @author Vito
 * @email zhouwentao16@gmail.com
 * @date 2013-7-9
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUsernameAndPassword(String username, String password);

    public User  findByUsername(String username);
}
