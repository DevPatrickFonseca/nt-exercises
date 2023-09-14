package week01.exercise04.classes;

public class Employee extends Person {
    private String cargo;
    private double salario;

    public Employee(String nome, String cpf, String rg, int idade, String cargo, double salario) {
        super(nome, cpf, rg, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
