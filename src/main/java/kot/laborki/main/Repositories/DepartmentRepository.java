package kot.laborki.main.Repositories;

import kot.laborki.main.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentManagedByUser(String firstName, String lastName);
    Department findDepartmentWithMaxNumberOfEmployees();
    Department findDepartmentWithMaxUsersSalary();
    List<Department> findaAllDepartments();
}
