package week01.exercise04.classes;

public class Driver extends Employee {
    String cnh;
    String placaCarro;

    public Driver(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        super(nome, cpf, rg, idade, cargo, salario);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
}
