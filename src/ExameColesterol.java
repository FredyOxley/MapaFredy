
/**
 *
 * @author fredy
 */
import javax.swing.JOptionPane;

// Criação da classe filha ExameColesterol
public class ExameColesterol extends Exame{

    //Declaração de variáveis
    private int quantidadeHdl, quantidadeLdl;
    private String risco, classificacaoHdl, classificacaoLdl;

    //Implementando métodos da classe pai
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        quantidadeHdl = (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de HDL")));
        quantidadeLdl = (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de LDL")));
        risco = (JOptionPane.showInputDialog("Risco A - Alto, M - Médio, B - Baixo" ));
    }

    @Override
    public String classificarResultado() {
        int idade = calcularIdade();

        if (idade >= 0 && idade <= 19 && quantidadeHdl > 45){
            classificacaoHdl = "BOM";
        }else if(idade >= 20 && quantidadeHdl > 40){
            classificacaoHdl = "BOM";
        }else{
            classificacaoHdl = "RUIM";
        }

        if(risco.equals("A") && quantidadeLdl < 50){
            classificacaoLdl = "BOM";
        } else if (risco.equals("M") && quantidadeLdl < 70) {
            classificacaoLdl = "BOM";
        }else if (risco.equals("B") && quantidadeLdl < 100){
            classificacaoLdl = "BOM";
        }else{
            classificacaoLdl = "RUIM";
        }
        return  "Quantidade HDL: " +  quantidadeHdl + "mg/dL" +
                "\nQuantidade LDL: " + quantidadeLdl + "mg/dL" +
                "\nRisco:" + risco +
                "\nClassificação HDL: " + classificacaoHdl +
                "\nClassificação LDL: " + classificacaoLdl;
    }

    @Override
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null,"Paciente: " + this.getNomePaciente()
                + "\n" + classificarResultado());
    }
}

// OBS: Declarei uma variável "idade" dentro do método classificar resultado para que o programa não tenha que retornar
//à classe mãe toda a vez que vai fazer um teste de idade. Exemplo: calcularIdade() >= 10 - Vai pra a classe mãe, faz o cálculo,
//verfica se a condição é verdadeira, volta para a classe filha e assim ele faria até testar todas as condições de idade.
//Achei melhor fazer dessa forma por questão de performace.
