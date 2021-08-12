package controll;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@Controller
public class StudentControll {
    StudentService studentService = new StudentService();

    @RequestMapping("/show")
    public String home(HttpServletRequest req) {
        req.setAttribute("ListStudent", studentService.list);
        return "/WEB-INF/ShowSV.jsp";
    }

    @GetMapping("/create")
    public String ShowCreate() {
        return "/WEB-INF/CreateSV.jsp";
    }

    @GetMapping("/edit")
    public String ShowEdit(HttpServletRequest req, @RequestParam int index){
        req.setAttribute("student1",studentService.list.get(index));
        return "/WEB-INF/EditSV.jsp";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index) {
        try {
            studentService.delete(index);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "redirect:/show";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Student student){
        try {
            studentService.add(student);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "redirect:/show";
    }
    @PostMapping("/edit")
    public String edit(@RequestParam int index,@ModelAttribute Student student){
        try {
            studentService.edit(student,index);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "redirect:/show";
    }
}
