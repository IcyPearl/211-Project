package user;

import junit.framework.TestCase;

public class TestUser extends TestCase {
	public void test_addUser(){
		UserManager um = new UserManager();
		um.addUser(new User("mal", "haydar", "got", "bok", "02130", "tepebasi mah.", new Cart(), 0));
		assertTrue(um.getUserList().get(0).getName().equals("haydar"));
		assertTrue(um.getUserList().get(0).getSurname().equals("got"));
		assertTrue(um.getUserList().get(0).getUsername().equals("mal"));
		assertTrue(um.getUserList().get(0).getPassword().equals("bok"));
		assertTrue(um.getUserList().get(0).getCreditCard().equals("02130"));
		assertTrue(um.getUserList().get(0).getAddress().equals("tepebasi mah."));
		assertTrue(um.getUserList().get(0).getCheckNo() == 0);
	}
	public void test_getUser(){
		UserManager um = new UserManager();
		um.addUser(new User("mal", "haydar", "got", "bok", "02130", "tepebasi mah.", new Cart(), 0));
		assertTrue(um.getUser("mal").getName().equals("haydar"));
		assertTrue(um.getUser("mal").getSurname().equals("got"));
		assertTrue(um.getUser("mal").getUsername().equals("mal"));
		assertTrue(um.getUser("mal").getPassword().equals("bok"));
		assertTrue(um.getUser("mal").getCreditCard().equals("02130"));
		assertTrue(um.getUser("mal").getAddress().equals("tepebasi mah."));
		assertTrue(um.getUser("mal").getCheckNo() == 0);
	}
	public void test_loginCheck(){
		UserManager um = new UserManager();
		um.addUser(new User("mal", "haydar", "got", "bok", "02130", "tepebasi mah.", new Cart(), 0));
		um.addUser(new User("adminimsikerim","muharrem","killibacak","232323","0213","tepeayagi mah.",new Cart(),1));
		assertTrue(um.LoginCheck("mal","bok".toCharArray()) == 0);
		assertTrue(um.LoginCheck("adminimsikerim", "232323".toCharArray()) == 1);
		assertTrue(um.LoginCheck("buuu", "zuuu".toCharArray()) == -1);
	}
}
