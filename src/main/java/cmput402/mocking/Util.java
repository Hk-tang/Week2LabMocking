package cmput402.mocking;

import service.City;

import java.util.List;

public class Util {

    public int filterEdmonton(City city){

        List<String> cities = city.listCities();
        int count = 0;
        for(String aCity:cities) {
            if(aCity.equals("Edmonton")){
              count++;
            }
        }
        return count;
    }
}
