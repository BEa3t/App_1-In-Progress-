package ymengis2.gmail.com.app1;

/**
 * Created by yenai on 10/16/17.
 */

public class Game {
    public String title, publisher;
    public Integer year, price;

    Game(String title, String publisher, Integer year, Integer price){
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getPrice() {
        return price;
    }

    //toString()
}
