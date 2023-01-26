package kot.laborki.main.Services;

import kot.laborki.main.Entities.Department;
import kot.laborki.main.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentBean implements DepartmentService{
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentBean(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department findDepartmentManagedByUser(String firstName, String lastName) {
        return null;
    }

    @Override
    public Department findDepartmentWithMaxNumberOfEmployees() {
        return null;
    }

    @Override
    public Department findDepartmentWithMaxUsersSalary() {
        return null;
    }

    @Override
    public List<Department> findaAllDepartments() {
        return null;
    }

    @Override
    public Department findDepartmentById(long id) {
        return null;
    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }

    @Override
    public Department createDepartment(Department department) {
        return null;
    }

    @Override
    public void deleteDepartment(long id) {

    }
}
