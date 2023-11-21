package com.example.christmaspresents.readers;

import com.example.christmaspresents.dto.Request;

import java.io.IOException;

public interface Reader {
    Request read(String fileName) throws IOException;
}
