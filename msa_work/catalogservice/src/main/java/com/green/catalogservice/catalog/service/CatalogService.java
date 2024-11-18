package com.green.catalogservice.catalog.service;

import com.green.catalogservice.catalog.vo.CatalogRespones;
import com.green.catalogservice.catalog.vo.CatalogRequest;


public interface CatalogService {


    OrderResponse join(CatalogRequest catalogRequest);


    CatalogRespones login(String email, String password);

}
