package com.jfs.optional;

import java.util.Optional;
import java.util.Scanner;

public class UserTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		User user2 = new User();
		System.out.println("Enter ID");
	    int Id = sc.nextInt();
	    user.setEmial("rahulsrinivas");
		user.setUserID(10);
		user2.setEmial("rahul");
		user2.setUserID(20);

		Optional<String> userById = user.getUserById(Id);
		userById.ifPresentOrElse(e -> System.out.println(e),() -> System.out.println("No Value"));
	}
}
