package Controller;

import Model.Product;
import Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    ProductService productService=new ProductService();
    @RequestMapping("/product")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("showproduct");
        modelAndView.addObject("listsp",productService.listsp);
        return  modelAndView;
    }
    @GetMapping ("/create")
    public ModelAndView getCreate(){
        ModelAndView modelAndView=new ModelAndView("createproduct","listloaisp",productService.listloaisp);
        return modelAndView;
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Product product){
        productService.addsp(product);
        return "redirect:/product";
    }

    @GetMapping("/edit")
    public ModelAndView showEdit(@RequestParam int index){
        ModelAndView modelAndView = new ModelAndView("editproduct");
        modelAndView.addObject("product", productService.listsp.get(index));
        modelAndView.addObject("listloaisp", productService.listloaisp);
        return modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView edit(@RequestParam int index,@ModelAttribute Product product){
        productService.editsp(product,index);
        return new ModelAndView("redirect:/product");
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int index) {
        productService.deletesp(index);
        return "redirect:/product";
    }
}
