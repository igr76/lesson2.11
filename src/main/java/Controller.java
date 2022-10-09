import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }


    @GetMapping("/add")
    public void add(@RequestParam("Id") Integer id) {
       service.basketAdd();
    }
    @GetMapping("/get")
    public String get() {

    }
}
