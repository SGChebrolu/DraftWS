package others.util;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable {
    private int id;
    private String name;
    private String location;
    private List<String> languageInterests;

    public Employee(int id, String name, String location, List<String> languageInterests) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.languageInterests = languageInterests;
    }

    public Employee(String jhon, String hyderabad, List<String> asList) {
        this.name = jhon;
        this.location = hyderabad;
        this.languageInterests = asList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getLanguageInterests() {
        return languageInterests;
    }

    public void setLanguageInterests(List<String> languageInterests) {
        this.languageInterests = languageInterests;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", languageInterests=" + languageInterests +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee that = (Employee) o;
        return this.id - that.id;

    }

    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Employee> LocationComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getLocation().compareTo(o2.getLocation());
        }
    };
}
