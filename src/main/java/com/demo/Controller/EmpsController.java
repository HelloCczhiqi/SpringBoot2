package com.demo.Controller;

import com.demo.Serveict.Impl.BooksServicetImp;
import com.demo.bean.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpsController {
    @Resource
    private BooksServicetImp booksServicet;

    public BooksServicetImp getBooksServicet() {
        return booksServicet;
    }

    public void setBooksServicet(BooksServicetImp booksServicet) {
        this.booksServicet = booksServicet;
    }

    @RequestMapping("/emps")
    public String list(Model model) {
        List<Books> books = booksServicet.finAll();
        model.addAttribute("list", books);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toadpage() {
        return "emp/add";
    }

    @PostMapping("/emp")
    public String add(Books books) {
        booksServicet.addBooks(books);
        return "redirect:/emps";
    }

    //    @GetMapping("/emp/{getBookID}")
//    public String update(@PathVariable("getBookID") Integer BookID,Model model){
//        Books books = booksServicet.booksById(BookID);
//        model.addAttribute("books",books);
//        return "emp/update";
//    }
//    @PostMapping("/emp")
//    public String update(){
//        return "redirect:/emps";
//    }
    @GetMapping("/dele/{getBookID}")
    public String delete(@PathVariable("getBookID") Integer BookID) {
        booksServicet.deleteBooks(BookID);
        return "redirect:/emps";
    }

    @GetMapping("/update/{getBookID}")
    public String update(@PathVariable("getBookID") Integer BookID, Model model) {
        Books books = booksServicet.booksById(BookID);
        model.addAttribute("update", books);
        return "emp/updete";
    }

    @PostMapping("/update/{getBookID}")
    public String updatebooks(@PathVariable("getBookID") Integer BookID, Books books) {
        books.setBookID(BookID);
        booksServicet.updebooks(books);
        return "redirect:/emps";
    }

}
