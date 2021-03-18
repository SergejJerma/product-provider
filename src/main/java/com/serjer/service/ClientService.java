package com.serjer.service;

import com.serjer.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

        return products;
    }
}
