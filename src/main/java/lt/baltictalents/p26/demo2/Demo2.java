package lt.baltictalents.p26.demo2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    public static void main(String... args) throws IOException {

        List<Item> items = new ArrayList<>();

        items.add(new Item("Jonas", LocalDate.now(), null));
        items.add(new Item("Petras", LocalDate.now().minusDays(1), 10));
        items.add(new Item("Ona", LocalDate.now().minusMonths(1), -9));

        Gson gson = new GsonBuilder().create();
        gson.toJson(items, System.out);
    }

    static class Item {

        String name;

        LocalDate date;

        Integer value;

        public Item(String name, LocalDate date, Integer value) {
            this.name = name;
            this.date = date;
            this.value = value;
        }
    }

}
