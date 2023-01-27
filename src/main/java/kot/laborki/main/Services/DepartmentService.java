package kot.laborki.main.Services;

import kot.laborki.main.Entities.Department;
import kot.laborki.main.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findDepartmentManagedByUser(String firstName, String lastName){
        return departmentRepository.findDepartmentManagedByUser(firstName,lastName);
    };
    public Department findDepartmentWithMaxNumberOfEmployees(){
        return departmentRepository.findDepartmentWithMaxNumberOfEmployees();
    };
    public Department findDepartmentWithMaxUsersSalary(){
        return departmentRepository.findDepartmentWithMaxUsersSalary();
    };
    public List<Department> findaAllDepartments(){
        return departmentRepository.findaAllDepartments();
    };
//
//    Department findDepartmentById(long id){
//    };
//
//    Department updateDepartment(Department department);
//
//    Department createDepartment(Department department);
//
//    void deleteDepartment(long id);
}
