/**
 *
 * @author fredy
 */
import javax.swing.*;

//Criação da class filha Exame Triglicerídeos
public class ExameTriglicerideos extends Exame {

    //Declaração de variáveis

    private int quantidadeTri;


    //Implementando métodos da classe pai
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        quantidadeTri = (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de triglicerídeos:")));
    }

    @Override
    public String classificarResultado() {
        int idade = calcularIdade();

        if(idade >= 0 && idade <= 9 && quantidadeTri < 75){
            return "Triglicerídeo BOM";
        }else if(idade >= 10 && idade <= 19 && quantidadeTri < 90){
            return "Triglicerídeo BOM";
        }else if(idade >= 20 && quantidadeTri < 150){
            return "Triglicerídeo BOM";
        }else{
            return "Triglicerídeo RUIM";
        }
    }

    @Override
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null,"Paciente: " + this.getNomePaciente()
                +"\nQuantidade de triglicerídeo: " + quantidadeTri + "mg/dL"
                +"\nClassificação: " + classificarResultado());

    }
}

// OBS: Declarei uma variável "idade" dentro do método classificar resultado para que o programa não tenha que retornar
//à classe mãe toda a vez que vai fazer um teste de idade. Exemplo: calcularIdade() >= 10 - Vai pra a classe mãe, faz o cálculo,
//verfica se a condição é verdadeira, volta para a classe filha e assim ele faria até testar todas as condições de idade.
//Achei melhor fazer dessa forma por questão de performace.
