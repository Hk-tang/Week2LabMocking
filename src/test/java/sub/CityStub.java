package sub;

import service.City;

import java.util.ArrayList;
import java.util.List;

public class CityStub implements City {

    @Override
    public List<String> listCities() {
        List<String> cities = new ArrayList<>();
        cities.add("Toronto");
        cities.add("Edmonton");
        cities.add("Edmonton");
        cities.add("Edmonton");
        cities.add("Calgary");
        return cities;
    }

}
