package kz.dar.academy.backend.Servise;

import kz.dar.academy.backend.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiseImpl implements EmployeeServise{
    private static final HashMap<String, EmployeeModel> employeeMap = new HashMap<>();

    static {
        EmployeeModel employeeModel1 = new EmployeeModel(UUID.randomUUID().toString(), "Ivan", "Petrov", "DAR", "Engineer", "example1@gmail.ru", 300000 );
        EmployeeModel employeeModel2 = new EmployeeModel(UUID.randomUUID().toString(), "Maria", "Petrova", "DAR", "Engineer", "example2@gmail.ru", 200000 );
        EmployeeModel employeeModel3 = new EmployeeModel(UUID.randomUUID().toString(), "Ivan", "Smith", "DAR", "Engineer", "example3@gmail.ru", 100000 );
        employeeMap.put(employeeModel1.getEmployeeid(), employeeModel1);
        employeeMap.put(employeeModel2.getEmployeeid(), employeeModel2);
        employeeMap.put(employeeModel3.getEmployeeid(), employeeModel3);
    }

    @Override
    public void createEmployee(EmployeeModel employeeModel) {
    employeeModel.setEmployeeid(UUID.randomUUID().toString());
    employeeMap.put(employeeModel.getEmployeeid(),employeeModel);
    }

    @Override
    public List<EmployeeModel> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public EmployeeModel getEmployeeById(String employeeId) {
        return employeeMap.get(employeeId);
    }

    @Override
    public void updateEmployeeById(String employeeId, EmployeeModel employeeModel) {
        employeeModel.setEmployeeid(employeeId);
        employeeMap.put(employeeId, employeeModel);
    }

    @Override
    public void deleteEmployeeById(String employeeId) {
    employeeMap.remove(employeeId);
    }
}
