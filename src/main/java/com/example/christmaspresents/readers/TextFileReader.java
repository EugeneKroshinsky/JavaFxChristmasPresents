package com.example.christmaspresents.readers;

import com.example.christmaspresents.dto.Present;
import com.example.christmaspresents.dto.PresentsRequest;
import com.example.christmaspresents.dto.PresentsProducer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReader implements Reader{
    @Override
    public PresentsRequest read(String fileName) throws IOException {
            Scanner in = new Scanner(new File(fileName));
            PresentsRequest request = new PresentsRequest();
            int countOfCompanies = Integer.parseInt(in.nextLine());
            for (int i = 0; i < countOfCompanies; i++) {
                String companyName = in.nextLine();
                PresentsProducer producer = new PresentsProducer(companyName);
                request.getProducers().add(producer);
                int countOfProducts = Integer.parseInt(in.nextLine());
                for (int j = 0; j < countOfProducts; j++) {
                    String productName = in.nextLine();
                    int price = Integer.parseInt(in.nextLine());
                    Present present = new Present(productName, price);
                    producer.getPresents().add(present);
                }
            }
            return request;

    }
}
