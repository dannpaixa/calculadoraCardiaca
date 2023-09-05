package calculadoraCardiaca;
public class heartRates {
    
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private int idade;
    
    public void Construtor(String nome, String sobrenome, int dia, int mes, int ano, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getretornaIdade(int idade){
        idade = 2023 - this.getAno();
        this.idade = idade;
        return idade;
    }
    
    public int frequenciaCardiaca(int frequencia){
        frequencia = 220 - getretornaIdade(idade);
        return frequencia;
    }
    
}
