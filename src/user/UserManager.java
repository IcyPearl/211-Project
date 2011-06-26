package user;

import java.io.Serializable;
import java.util.ArrayList;

public class UserManager implements Serializable
{
	private ArrayList<User> userList = new ArrayList<User>();
	private static final long serialVersionUID = 11L; 

	public void addUser(User u)
	{
		userList.add(u);		
	}

	//returns null if there were no user has that username;
	public User getUser(String username)
	{
		for (int i = 0; i < userList.size(); i++)
		{
			if ( userList.get(i).getUsername().equals(username))
			{
				return userList.get(i);
			}
		}
		return null;		
	}
	
	// 0 for User , 1 for Admin ,
	//returns -1 if there were no user	
	int LoginCheck(String username , char [] password)
	{
		String pass = new String(password);
		for (int j = 0; j < password.length; j++)
		{
			if( userList.get(j).getUsername().equals(username) && userList.get(j).getPassword().equals(pass))
			{
				return userList.get(j).getCheckNo();
			}
		}
		return -1;
	}
}
