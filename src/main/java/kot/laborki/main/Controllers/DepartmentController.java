package kot.laborki.main.Controllers;

import kot.laborki.main.Entities.Department;
import kot.laborki.main.Routers.Router;
import kot.laborki.main.Services.DepartmentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentBean departmentService;

    @Autowired
    public DepartmentController(DepartmentBean departmentService){
        this.departmentService = departmentService;
    }
    @GetMapping(Router.DEPARTMENTS_PATH)
    public List<Department> getAllDepartments() {
        return departmentService.findaAllDepartments();
    }
    @GetMapping(Router.DEPARTMENT_PATH)
    public Department getDepartment(@PathVariable long id) {
        return departmentService.findDepartmentById(id);
    }
    @PostMapping
    public Department postDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }
    @PutMapping
    public Department putDepartment(@PathVariable long id, @RequestBody Department department){
        department.setId(id);
        return departmentService.updateDepartment(department);
    }

    @DeleteMapping
    public void deleteDepartment(@PathVariable long id) {
        departmentService.deleteDepartment(id);
    }
}
