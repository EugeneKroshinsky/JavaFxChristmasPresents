package com.example.christmaspresents.readers;

import com.example.christmaspresents.dto.Present;
import com.example.christmaspresents.dto.Request;
import com.example.christmaspresents.dto.Producer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReader implements Reader{
    private Scanner in;
    private Request request;
    @Override
    public Request read(String fileName) throws IOException {
            in = new Scanner(new File(fileName));
            request = new Request();
            int countOfCompanies = Integer.parseInt(in.nextLine());
            for (int i = 0; i < countOfCompanies; i++) {
                Producer producer = createProducer();
                int countOfProducts = Integer.parseInt(in.nextLine());
                for (int j = 0; j < countOfProducts; j++) {
                    producer.getPresents().add(createPresent());
                }
            }
            return request;
    }
    private Present createPresent(){
        String productName = in.nextLine();
        int price = Integer.parseInt(in.nextLine());
        return new Present(productName, price);
    }
    private Producer createProducer(){
        String companyName = in.nextLine();
        Producer producer = new Producer(companyName);
        request.getProducers().add(producer);
        return producer;
    }
}
