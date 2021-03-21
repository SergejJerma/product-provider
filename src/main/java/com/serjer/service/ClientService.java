package com.serjer.service;

import com.serjer.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ClientService {

    public List<Product> getProductListByRequest(ClientRequest request) {
        List<Product> products = new ArrayList<>();

        if (!request.getIncomeGroup().equals(EIncomeGroup.A.getId())
                && !request.getAgeGroup().equals(EAgeGroup.A.getId())) {
            products.add(new Product(EProduct.CA.getName()));
        }

        if (request.getIncomeGroup().equals(EIncomeGroup.D.getId())
                && !request.getAgeGroup().equals(EAgeGroup.A.getId())) {
            products.add(new Product(EProduct.CAP.getName()));
            products.add(new Product(EProduct.GCC.getName()));
        }

        if (request.getAgeGroup().equals(EAgeGroup.A.getId())) {
            products.add(new Product(EProduct.JSA.getName()));
        } else if (request.getIsStudent()
                && !request.getAgeGroup().equals(EAgeGroup.A.getId())) {
            products.add(new Product(EProduct.STA.getName()));
        }

        if (request.getAgeGroup().equals(EAgeGroup.C.getId())) {
            products.add(new Product(EProduct.SNA.getName()));
        }

        if ((request.getIncomeGroup().equals(EIncomeGroup.A.getId())
                || request.getIncomeGroup().equals(EIncomeGroup.B.getId()))
                && !request.getAgeGroup().equals(EAgeGroup.A.getId())) {
            products.add(new Product(EProduct.DC.getName()));
        }

        if ((request.getIncomeGroup().equals(EIncomeGroup.C.getId())
                || request.getIncomeGroup().equals(EIncomeGroup.D.getId()))
                && !request.getAgeGroup().equals(EAgeGroup.A.getId())) {
            products.add(new Product(EProduct.CC.getName()));
        }

        countProducts(products);

        return products;
    }

    private void countProducts(List<Product> products) {
        var cardProductsCount = 0L;
        if (!products.isEmpty()) {
           cardProductsCount = products
                   .stream()
                   .filter(p -> p.getName().toLowerCase().contains("card"))
                   .count();
        }
        log.info("{} products were selected: {} card products and {} account products",
                products.size(),
                cardProductsCount,
                products.size() - cardProductsCount);
    }
}
