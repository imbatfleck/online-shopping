package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImp implements CategoryDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().persist(category);
		return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category get() {
		// TODO Auto-generated method stub
		
		return null;
	}

	

}
