import pro.sky.skypospringdemo.Basket;
import pro.sky.skypospringdemo.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class Service {
    private final Basket basket;
    private final Map<Integer , Item> items = new HashMap<>();

    public Service(Basket basket) {
        this.basket = basket;
    }

    public void init() {

    }
    public void basketAdd(List<Integer> ids) {
         basket.add(
                ids.stream()
                        .map(id -> items.get(id))
                        .collect(Collectors.toList())
        );
    }

    public List<Item> basketGet() {
        return basket.get();
    }
}


