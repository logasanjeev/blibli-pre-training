import java.util.Date;
import java.util.Objects;

public class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    public Employee(String id, String name, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Date getDateOfJoining() { return dateOfJoining; }
    public void setDateOfJoining(Date dateOfJoining) { this.dateOfJoining = dateOfJoining; }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;

        return age == other.age && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(dateOfJoining, other.dateOfJoining);
    }

    @Override
    public int hashCode() { return Objects.hash(id, name, age, dateOfJoining); }
}
