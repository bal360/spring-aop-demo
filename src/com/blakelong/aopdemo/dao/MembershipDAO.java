package com.blakelong.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		
		System.out.println(getClass() + ": Doing my db work: adding an account");
	}

}
