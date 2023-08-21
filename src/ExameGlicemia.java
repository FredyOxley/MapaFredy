

/**
 *
 * @author fredy
 */
import javax.swing.JOptionPane;

//Criação da classe filha ExameGlicemia
public class ExameGlicemia extends Exame{

    //Declaração de variáveis
    private int quantidadeGlicose;

    //Implementando métodos da classe pai
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        quantidadeGlicose = (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de glicose:")));
    }

    @Override
    public String classificarResultado() {
        if(quantidadeGlicose < 100){
            return "Normoglicemia";
        } else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
            return "Pré-Diabetes";
        } else {
            return "Diabetes Estabelicida";
        }
    }

    @Override
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null,"Paciente: " + this.getNomePaciente()
                + "\nQuantidade de glicose: " + quantidadeGlicose + "mg/dL"
                + "\nClassificação: " + classificarResultado());
    }
}
