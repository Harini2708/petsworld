package com.niitapp.petsworld.service;

import com.niitapp.petsworld.model.Cart;
import com.niitapp.petsworld.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	void removeCartItem(String CartItemId);
	void removeAllCartItems(Cart cart);
}
