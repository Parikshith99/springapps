package com.springapps.sportyshoes.service;

import java.util.List;

import com.springapps.sportyshoes.entity.Purchase;

public interface PurchaseService {
void save(Purchase purchase);
List<Purchase> getPurchaseDetails();
List<Purchase> getPurchaseByDateAndCategory(String date,int categoryid);
List<Object[]> getSummaryReport(String date,int categoryid);
}
