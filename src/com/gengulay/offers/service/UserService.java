package com.gengulay.offers.service;

import com.gengulay.offers.model.Login;
import com.gengulay.offers.model.User;

public interface UserService {

	void register(User user);

	User validateUser(Login login);

}
