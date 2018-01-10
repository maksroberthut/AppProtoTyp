/**
 * Created by Maksr on 07.01.2018.
 */

public class Movie {
    private String Name,City,Time;

    public Movie() {
    }

    public Movie(String name, String city, String time) {
        Name = name;
        City = city;
        Time = time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
