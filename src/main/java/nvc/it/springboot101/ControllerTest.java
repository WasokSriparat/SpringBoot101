package nvc.it.springboot101;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {

    String navbar = "<hr><ul style = 'list-style:none;font-size:30px;text-align:center;'><li style='display:inline; margin-right:20px;'><a style='text-decoration:none;' href='/home'>Home</a></li> <li style='display:inline; margin-right:20px;'><a style='text-decoration:none;' href='/about'>About</a></li> <li style='display:inline; margin-right:20px;'><a style='text-decoration:none;' href='/contact'>Contact</a></li></ul><hr>";

    String backIndex = "<a style='text-decoration:none;' href='/'>Go To Index Page</a>";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return " <hr><center><h1>Hello Wasok</h1></center><hr> <center> <ul style='list-style:none;margin:0;padding:0;font-size:30px;'><li style='margin-bottom:20px;'><a style='text-decoration:none;' href='/home'>Home</a></li> <li style='margin-bottom:20px;'><a style='text-decoration:none;' href='/about'>About</a></li> <li style='margin-bottom:20px;'><a style='text-decoration:none;' href='/contact'>Contact</li></ul> </center>";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        return navbar+"<center><h1>Home Wasok</h1>"+backIndex+"</center>";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    @ResponseBody
    public String about(){
        return navbar+"<center> <h1>About  Wasok</h1>"+backIndex+"</center>";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    @ResponseBody
    public String contact(){
        return navbar+"<center> <h1>Contact  Wasok</h1>"+backIndex+"</center>";
    }
}
