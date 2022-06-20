package br.com.entra21.emr.backend.login.area.emr.crud;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.emr.backend.Menu;
import br.com.entra21.emr.backend.Repository;
import br.com.entra21.emr.backend.models.Patient;
import br.com.entra21.emr.backend.models.TypeUser;
import br.com.entra21.emr.backend.models.User;

public class LoginCRUD extends Menu implements ICrud<User> {

	private HashMap<String, User> users = Repository.users;
	private static ArrayList<String> options = new ArrayList<String>(
			Arrays.asList("Create User", "List Users", "Update Users", "Delete Users", "Details Users"));
	
	public LoginCRUD() {
		super("USERS", options);
	}
	
	@Override
	public byte captureOption() {

		byte option = super.captureOption();
		switch (option) {
		case 1:
			System.out.println("CREATING USER");
			create();
			break;
		case 2:
			System.out.println("LISTING USER");
			list(users);
			break;
		case 3:
			System.out.println("UPDATING USER");
			update(captureKey());
			break;
		case 4:
			System.out.println("DELETING USER");
			delete(captureKey());
			break;
		case 5:
			System.out.println("DETAILING USER");
			details(users);
			break;
		default:
			System.out.println("Select a valid option for menu " + super.getTitle());
			break;
		}
		return option;
	}

	@Override
	public void list(HashMap<String, User> list) {
		System.out.println("========================================================");
		System.out.println("USERS LIST");
		for (User user : users.values()) {
			System.out.println("\t" + user.getUser());
		}
		System.out.println("\nUSERS TOTAL: " + users.size() + " users.");
		
	}

	@Override
	public void create() {
		User newUser = captureValues();
		if (search(newUser) == null) {
			users.put(newUser.getUser(), newUser);
			User.createMessage(newUser.getUser());
		} else {
			System.out.println("The selected user does not exist: "+ newUser.getUser());
		}
		
	}

	@Override
	public User search(User key) {
		return users.get(key.getUser());
	}

	@Override
	public void update(User key) {
		User currentUser = search(key);
		if (currentUser == null) {
			System.out.println("The selected user does not exist: "+ key.getUser());
		} else {
			//delete(currentUser);
			users.remove(currentUser.getUser());
			create();
			System.out.println("The user is already updated.");
		}
	}

	@Override
	public void delete(User key) {
		User currentUser = search(key);
		if (currentUser == null) {
			System.out.println("The selected patient does not exist: " + key.getUser());
		} else {
			users.remove(key.getUser());
			System.out.println("Deleted data...");
			Patient.deleteMessage(currentUser.getUser());
		}
		
	}

	@Override
	public User captureKey() {
		list(users);
		User captureUser = new User();
		
		System.out.println("Inform the user login:");
		captureUser.setUser(super.getInput().next());
		return captureUser;
	}

	@Override
	public User captureValues() {
		User user = new User();
		
		user.setCreateDate(LocalDate.now());
		user.setCreateTime(LocalTime.now());
		
		System.out.println("Enter the login:");
		user.setUser(getInput().nextLine().toLowerCase());
		user.setUser(getInput().nextLine().toLowerCase());
		
		System.out.println("Password must consist only of numbers. Maximum 6 numbers Minimum 4 numbers.");
		System.out.println("Enter the password:");
		String password = getInput().next();
		user.setPassword(Integer.parseInt(password)); //TODO WRAPPER
		
		System.out.println("Selection user type:"
				+ "\n\t1 - Admin"
				+ "\n\t2 - Doctor"
				+ "\n\t3 - Common User");
		
		String option = getInput().next();
		
		switch (option.toLowerCase()) {
		case "1","admin":
			user.setTypeUser(TypeUser.ADMIN);
			break;
		case "2","doctor":
			user.setTypeUser(TypeUser.DOCTOR);
			break;
		case "3","common user":
			user.setTypeUser(TypeUser.USER);
			break;
		default:
			System.out.println("Select a valid option");
			break;
		}
		return user;
	}

	@Override
	public void details(HashMap<String, User> users) {
		list(users);
		
		try {	//TODO Exceptions
			System.out.println("Select a login for user: ");
			String option = getInput().next();
			
			System.out.println("Login: "+users.get(option).getUser());
			System.out.println("Password: "+users.get(option).getPassword());
			System.out.println("User Type: "+users.get(option).getTypeUser());
			System.out.println("Creation Date: "+users.get(option).getCreateDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println("Creation Time: "+users.get(option).getCreateTime().format(DateTimeFormatter.ofPattern("HH:mm")));
		} catch (NullPointerException e) {
			System.out.println("You have entered a user that does not exist. Try again!");
		}
		
		
	}
	
}
