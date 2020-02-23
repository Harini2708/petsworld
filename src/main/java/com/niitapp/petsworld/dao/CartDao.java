package com.niitapp.petsworld.dao;

import java.io.IOException;

import com.niitapp.petsworld.model.Cart;

public interface CartDao {

	Cart getCartByCartId(String CartId);
	
	Cart validate(String cartId) throws IOException;
	
	void update(Cart cart);
}
