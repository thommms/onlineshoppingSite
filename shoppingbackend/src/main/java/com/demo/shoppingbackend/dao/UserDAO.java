package com.demo.shoppingbackend.dao;



import com.demo.shoppingbackend.dto.Address;
import com.demo.shoppingbackend.dto.User;

import java.util.List;

public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);

	boolean add(User user);
	
	// adding and updating a new address
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	

	
}
