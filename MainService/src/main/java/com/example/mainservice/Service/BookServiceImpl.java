package com.example.mainservice.Service;
import com.example.mainservice.Dao.BookDao;
import com.example.mainservice.entity.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;
    @Override
    public String changeToBase64(String image) {
        return bookDao.changeToBase64(image);
    }
    @Override
    public void addBook(Book book){
        bookDao.addBook(book);
    }
    @Override
    public void delBook(Long bookId){
        bookDao.delBook(bookId);
    }
    @Override
    public List<Book> findAll(){
        return bookDao.findAll();
    }
    @Override
    public Book findBookById(Long bookId) throws JsonProcessingException {
        return bookDao.findBookById(bookId);
    }
    @Override
    public void setQuantity(Long bookId,Long quantity){
        bookDao.setQuantity(bookId,quantity);
    }
    @Override
    public void updateBook(Long bookId, Book book) throws JsonProcessingException {
        bookDao.updateBook( bookId, book);
    }
    @Override
    public List<Book> findBooksByTagRelation(String tagName) throws JsonProcessingException {
        return bookDao.findBooksByTagRelation(tagName);
    }
    @Override
    public Book findBookByName(String name){
        return bookDao.findBookByName(name);
    }


}
