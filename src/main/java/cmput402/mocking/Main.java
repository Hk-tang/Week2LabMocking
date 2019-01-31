package cmput402.mocking;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Address address1= new Address("University of Alberta", "Edmonton");
    	Employee employee1= new Employee("Shaiful Chowdhury", 1, 20000, address1);
    
    	Address address2= new Address("University of Waterloo", "Waterloo");
    	Employee employee2= new Employee("Sarah Nadi", 2, 90000, address2);
    	
    	Address address3= new Address("University of Victoria", "Victoria");
    	Employee employee3= new Employee("Abram hindle", 2, 70000, address3);
    }

    static public String capitalizeName(String name) {
    	List<String> names = Arrays.asList(name.split(" "));
    	StringJoiner capitalizedNames = new StringJoiner(" ");
		names.forEach((String part) -> {
			capitalizedNames.add(part.substring(0, 1).toUpperCase() + part.substring(1));
		});
    	return capitalizedNames.toString();
	}
}
