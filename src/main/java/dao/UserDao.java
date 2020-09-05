package dao;

import java.util.List;
import entity.User;

public interface UserDao {
    /**
     * select user by id
     */
	User queryById(long id);
	
	/**
	 * get all users.
	 */
	List<User> queryAll(int id); 
}