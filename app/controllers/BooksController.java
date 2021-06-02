package controllers;

import models.Book;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.books.*;
import java.util.Set;

public class BooksController extends Controller {

    // for all books
    public Result index() {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    /*// for book details
    public Result show(Integer id) {
        return TODO;
    }

    // create a book
    public Result create() {
        return TODO;
    }

    // save a book
    public Result save() {
        return TODO;
    }

    // edit a book
    public Result edit(Integer id) {
        return TODO;
    }

    // update a book
    public Result update() {
        return TODO;
    }

    // delete a book
    public Result destroy(Integer id) {
        return TODO;
    }*/

}
