package com.niitapp.petsworld.dao;

import com.niitapp.petsworld.model.Cart;
import com.niitapp.petsworld.model.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem);
	void removeCartItem(String CartItemId);
	void removeAllCartItems(Cart cart);

}
