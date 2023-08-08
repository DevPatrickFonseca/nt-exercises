package week01.exercise04.classes;

public class Drivers {
    private String name;
    private String taxId;
    private String id;
    private int age;

    private String job;
    private double salary;

    private String driverLicense;
    private String numberPlate;

    public Drivers(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        this.name = nome;
        this.taxId = cpf;
        this.id = rg;
        this.age = idade;
        this.job = cargo;
        this.salary = salario;
        this.driverLicense = cnh;
        this.numberPlate = placaCarro;
    }

    public void personData(String nome, String cpf, String rg, int idade) {
        this.name = nome;
        this.taxId = cpf;
        this.id = rg;
        this.age = idade;
    }

    public void employeeData(String cargo, double salario) {
        this.personData(name, taxId, id, age);
        this.name = cargo;
        this.salary = salario;
    }

    public void driverData(String cnh, String placaCarro) {
        this.employeeData(job, salary);
        this.driverLicense = cnh;
        this.numberPlate = placaCarro;
    }

    public void printDriverSelectedData(Drivers drivers) {
        System.out.println("-------------------------");
        System.out.println("Nome: " + drivers.name);
        System.out.println("Cargo: " + drivers.job);
        System.out.println("Placa do Carro: " + drivers.numberPlate);
    }
}
