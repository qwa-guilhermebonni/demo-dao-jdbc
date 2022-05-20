package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = Daofactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
	}

}
