package Avaliação;
/*
    Implemente a classe Paciente: os objetos dessa classe representam os
    pacientes de um médico endocrinologista. De cada paciente, o médico
    mantém os seguintes dados: nome, sexo, peso, altura e idade. O nome do
    paciente não pode ser nulo e o sexo deve ser F ou M. Tanto o nome quanto
    o sexo devem ser definidos logo que o objeto é instanciado. O peso deve
    pertencer ao intervalo (0; 150kg]; a altura deve respeitar o intervalo (0;
    2,5m] e a idade, [0; 120]. Além dos métodos construtor, modificadores, de
    acesso e toString, implemente:
    1 - um método que calcula o índice de massa corporal do paciente (IMC)
    2 - um método que calcula o peso ideal do paciente de acordo com o seu
        sexo.
        - Para homens, usar 72.7 × altura − 58 e
        - Para mulheres, 62.1 × altura − 44.7
    3 - um método que indica a faixa de risco do paciente conforme o seu IMC. 
 */

public class Paciente {
    private String nome;
    private char sexo;
    private double peso;
    private double altura;
    private int idade;

    public Paciente(String nomeInicial, char sexoInicial){
        if (nomeInicial != null) nome = nomeInicial;
        if (sexoInicial == 'F' || sexoInicial == 'M') sexo = sexoInicial;
        peso = 0;
        altura = 0;
        idade = 0;
    }

    public String getNome(){
        return nome;
    }

    public char getSexo(){
        return sexo;
    }

    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

    public int getIdade(){
        return idade;
    }

    public boolean setNome(String novoNome){
        if (novoNome != "") {
            nome = novoNome;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSexo(char novoSexo){
        if (novoSexo == 'F' || novoSexo == 'M'){
            sexo = novoSexo;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPeso(double novoPeso){
        if (novoPeso >= 0 && novoPeso <= 150){
            peso = novoPeso;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAltura(double novaAltura){
        if (novaAltura >= 0 && novaAltura <= 2.50) {
            altura = novaAltura;
            return true;
    } else {
        return false;
        }
    }   

    public boolean setIdade(int novaIdade){
        if (novaIdade >= 0 && novaIdade <= 120){
            idade = novaIdade;
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "Nome do Paciente: " + nome + "\nGênero: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura + "\nIdade: " + idade;
    }

    public double imc(){
        return peso / (Math.pow(altura, 2));
    }

    public double pesoIdeal(){
        if (sexo == 'M') return 72.7 * altura - 58;
        return 62.1 * altura - 44.7;
    }

    public String faixaRisco(){
        if (imc() < 20) return "Abaixo do peso.";
        else if (imc() <= 25) return  "Normal.";
        else if (imc() <= 30) return "Excesso de peso.";
        else if (imc() <= 35) return "Obesidade.";
        return "Obesidade mórbida.";
    }
}
