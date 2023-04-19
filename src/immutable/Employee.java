package immutable;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Employee {

    private final String empName;
    private final int age;
    private final Date birthDay;
    private final Address address;
    private final List<Responsibility> responsibilities;

    public Employee(String empName, int age, Date birthDay, Address address, List<Responsibility> responsibilities) {
        this.empName = empName;
        this.age = age;
        this.birthDay = (Date) birthDay.clone();
        this.address = new Address(address.getCity(), address.getStreet());
        this.responsibilities = copyResponsibilities(responsibilities);
    }
    public String getEmpName() { // со стрингом ничего доп делать не надо, он и так immutable
        return empName;
    }
    public int getAge() {
        return age;
    }
    public Date getBirthDay() {
        return (Date) birthDay.clone();
    }
    public Address getAddress() {
        return new Address(address.getCity(), address.getStreet());
    }
    public List<Responsibility> getResponsibilities() {
        return copyResponsibilities(responsibilities);
    }
    private List<Responsibility> copyResponsibilities(List<Responsibility> source) {
        return source.stream()
                .map(Responsibility::new)
                .collect(Collectors.toList());
    }
}
