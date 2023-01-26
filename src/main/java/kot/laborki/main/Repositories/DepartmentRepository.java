package kot.laborki.main.Repositories;

import kot.laborki.main.Entities.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository {
    Department findDepartmentManagedByUser(String firstName, String lastName);
    Department findDepartmentWithMaxNumberOfEmployees();
    Department findDepartmentWithMaxUsersSalary();
    List<Department> findaAllDepartments();
}
