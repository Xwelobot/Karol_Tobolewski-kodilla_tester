package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTestSuite {

    @Test
    public void shouldFetchBook(){
        //Given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //When
        List<BookDto> result = bookController.getBooks();
        //Then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook(){
        //Given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //When
        List<BookDto> result = bookController.getBooks();
        //Then
        assertEquals(1, result.size());
    }

}