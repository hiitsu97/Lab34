package kot.laborki.main.Services;

import kot.laborki.main.Entities.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department findDepartmentManagedByUser(String firstName, String lastName);
    Department findDepartmentWithMaxNumberOfEmployees();
    Department findDepartmentWithMaxUsersSalary();
    List<Department> findaAllDepartments();

    Department findDepartmentById(long id);

    Department updateDepartment(Department department);

    Department createDepartment(Department department);

    void deleteDepartment(long id);
}
