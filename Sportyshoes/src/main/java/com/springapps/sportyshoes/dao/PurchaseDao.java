package com.springapps.sportyshoes.dao;

import java.util.List;

import com.springapps.sportyshoes.entity.Purchase;

public interface PurchaseDao {
	void save(Purchase purchase);

	List<Purchase> getPurchaseDetails();

	List<Purchase> getPurchaseByDateAndCategory(String date, int categoryid);

	List<Object[]> getSummaryReport(String date, int categoryid);
	
}
