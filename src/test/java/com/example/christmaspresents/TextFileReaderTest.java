package com.example.christmaspresents;

import com.example.christmaspresents.dto.Present;
import com.example.christmaspresents.dto.Producer;
import com.example.christmaspresents.dto.Request;

import com.example.christmaspresents.readers.TextFileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class TextFileReaderTest {
    private Request request;
    private TextFileReader reader = new TextFileReader();
    @Test
    public void readTest() throws IOException {
        Producer lego = new Producer(
                "Lego",
                List.of(new Present("Castle", 20),
                        new Present("Starship", 25)
                )
        );
        Producer bookinist = new Producer(
                "Bookinist",
                List.of(new Present("\"1984\"", 10),
                        new Present("\"Moem\"", 15),
                        new Present("\"Dogs and cats\"", 5)
                )
        );
        Request expectedResult = new Request(List.of(lego, bookinist));
        request = reader.read("input.txt");

        Assertions.assertEquals(request.getProducers().size(), 2);
        Assertions.assertEquals(request.getProducers().get(0).getPresents().size(), 2);
        Assertions.assertEquals(request.getProducers().get(1).getPresents().size(), 3);
        Assertions.assertEquals(request, expectedResult);
    }
}
