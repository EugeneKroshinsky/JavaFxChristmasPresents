package com.example.christmaspresents.readers;

import com.example.christmaspresents.dto.PresentsRequest;

import java.io.IOException;

public interface Reader {
    PresentsRequest read(String fileName) throws IOException;
}
