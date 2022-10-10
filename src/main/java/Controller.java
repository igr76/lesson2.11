import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypospringdemo.Item;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }


    @GetMapping("/add")
    public void add(@RequestParam("Id") List<Integer> ids) {
       service.basketAdd(ids);
    }
    @GetMapping("/get")
    public List<Item> get() {
        return service.basketGet();
    }
}
