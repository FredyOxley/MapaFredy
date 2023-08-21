/**
 *
 * @author fredy
 */
import javax.swing.JOptionPane;

//Criação da classe mãe abstrata
public abstract class Exame {

    //Declaração de variáveis
    private String nomePaciente, tipoSanguineo;
    private int anoNascimento;
    final int anoAtual = 2023;

    //Criação de método para calcular idade do paciente
    public int calcularIdade(){
        return anoAtual - anoNascimento;
    }

    //Criação de dois métodos abstratos
    public abstract String classificarResultado();

    public abstract void mostrarResultado();

    //Criação de método de cadastrar exame com um padrão de mensagem que serão usadas nas três classes filhas
    public void cadastrarExame(){
        this.setNomePaciente(JOptionPane.showInputDialog("Digite o nome do paciente:"));
        this.setTipoSanguineo(JOptionPane.showInputDialog("Digite o tipo sanguíneo:"));
        this.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:")));
    }

    //Getters e Setters

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
