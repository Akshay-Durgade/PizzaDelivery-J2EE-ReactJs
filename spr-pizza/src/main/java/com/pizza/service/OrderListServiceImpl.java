package com.pizza.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.dao.CartDao;
import com.pizza.dao.OrderListDao;
import com.pizza.model.Cart;
import com.pizza.model.OrderList;

@Service
public class OrderListServiceImpl implements OrderListService
{
	@Autowired
	private OrderListDao olDao;
	@Autowired
	private CartService cartService;

	@Override
	public void insert(int customerid,int orderid) {
		// TODO Auto-generated method stub
		
		List<Cart> list1=cartService.getList();
//		Iterator<Cart> it=list1.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next().getPizzaname());  
//			System.out.println(it.next().getQuantity());
//			
//		}
		for (Cart i : list1) {
			OrderList ol=new OrderList();
			ol.setCustomerid(customerid);
			ol.setOrderid(orderid);
			ol.setPizzaname(i.getPizzaname());
			ol.setQuantity(i.getQuantity());
			ol.setStatus("ordered");
			
			olDao.save(ol);
            // Print all elements of ArrayList
//            System.out.println(i.getPizzaname());
//            System.out.println(i.getQuantity());
        }
//		olDao.save();
	}
	
	public List<Cart> cartList()
	{
		return cartService.getList();
	}

	@Override
	public List<OrderList> getAllOrders() {
		return olDao.getPizzaById("ordered");
	}

	@Override
	public void changeStatus(int orderid)
	{
		olDao.changeStatus(orderid, "delivered");
		
	}

	@Override
	public List<OrderList> getAllOrdersById(int orderid) {
		// TODO Auto-generated method stub
		return olDao.getOrderById(orderid);
	}
}
