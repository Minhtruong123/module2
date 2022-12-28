package Test;

public class EmployeeService implements IEmployeeService{
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public void add() {
        iEmployeeRepository.add();
    }

    @Override
    public void display() {
        iEmployeeRepository.display();
    }

    @Override
    public void edit(Employee employee) {
        iEmployeeRepository.edit(employee);
    }

    @Override
    public Employee search(int maNhanVien) {
        return iEmployeeRepository.search(maNhanVien);
    }
}

