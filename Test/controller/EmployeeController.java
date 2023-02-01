package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.Servise.EmployeeServise;
import kz.dar.academy.backend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServise employeeServise;

    @PostMapping
    public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeModel employeeModel){
       employeeServise.createEmployee(employeeModel);
        return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
    }
    @GetMapping("/all")
    public List<EmployeeModel> getAllEmployees(){
        return employeeServise.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public EmployeeModel getEmployeeById(@PathVariable String emploteeId){
        return employeeServise.getEmployeeById(emploteeId);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<String> updateEmployeeById(@PathVariable String employeeId,@Valid @RequestBody EmployeeModel employeeModel){
       employeeServise.updateEmployeeById(employeeId, employeeModel);
        return new ResponseEntity<String>("Successfully update", HttpStatus.OK) ;
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable String employeeId){
        employeeServise.deleteEmployeeById(employeeId);
        return new ResponseEntity<String>("Successfully deleted",HttpStatus.OK);
    }

}
