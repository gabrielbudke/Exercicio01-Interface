package interface01;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Gabriel Budke
 */
public class Exercicio01 {

    private JFrame jFrameTela;
    private JLabel jLabelNome,
            jLabelIdade,
            jLabelRaca,
            jLabelApelido,
            jLabelPreco,
            jLabelDescricao;

    private JButton jButtonCancelar, jButtonSalvar;
    private JRadioButton jRadioButtonVivo,
            jRadioButtonMorto,
            jRadioButtonRacao,
            jRadioButtonCome;

    private JCheckBox jCheckBoxAdestrado,
            jCheckBoxCastrado,
            jCheckBoxVacinado,
            jCheckBoxPedigree;

    private JComboBox jComboBoxRaca;
    private JTextArea jTextAreaDescricao;

    private JTextField jTextFieldNome, jTextFieldIdade, jTextFieldApelido, jTextFieldPreco;

    public Exercicio01() {

        gerarTela();
        instaciarObjetos();
        criarDimensoes();
        criarLocalizacao();
        adicionarComponentes();

        jFrameTela.setVisible(true);

    }

    private void gerarTela() {
        jFrameTela = new JFrame();
        jFrameTela.setSize(600, 450);
        jFrameTela.setLayout(null);
        jFrameTela.setLocationRelativeTo(null);
        jFrameTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void instaciarObjetos() {

        //Labels
        jLabelNome = new JLabel();
        jLabelNome.setText("Nome:");
        jLabelIdade = new JLabel("Idade:");
        jLabelRaca = new JLabel("Raca:");
        jLabelApelido = new JLabel("Apelido:");
        jLabelPreco = new JLabel("Preço:");
        jLabelDescricao = new JLabel("Descrição:");

        //Buttons
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");

        //RadioButtons
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonCome = new JRadioButton("Come almoços, janta");

        //JCheckBoxs
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxPedigree = new JCheckBox("Tem pedigree");

        //JComboBox
        jComboBoxRaca = new JComboBox();

        //JTextArea
        jTextAreaDescricao = new JTextArea();

        //JTextField
        jTextFieldNome = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldApelido = new JTextField();
        jTextFieldPreco = new JTextField();

    }

    private void criarDimensoes() {
        
        //Dimensão da Label
        jLabelNome.setSize(40,10);
        jLabelIdade.setSize(35,10);
        jLabelPreco.setSize(35,10);
        jLabelApelido.setSize(40,10);
        jLabelDescricao.setSize(45,10);

        //Dimensão da TextField
        jTextFieldNome.setSize(300,20); 
        jTextFieldIdade.setSize(170,20);
        jTextFieldApelido.setSize(50,10);
        jTextFieldPreco.setSize(50,10);
        
        //TODO fazer as dimensoes
    }

    private void criarLocalizacao() {

        //Localização da Label
        jLabelNome.setLocation(10,10);
        jLabelIdade.setLocation(400,10);
        
        
        //Localização da TextField
        jTextFieldNome.setLocation(10,30);
        jTextFieldIdade.setLocation(400,30);
        
        
        
        /*jLabelApelido.setLocation();
        jLabelPreco.setLocation();
        jLabelDescricao.setLocation();
        
        */
        

        
        //TODO fazer a localizações da labels
    }

    private void adicionarComponentes() {
        
        //Label add a Frame
        jFrameTela.add(jLabelNome);
        jFrameTela.add(jLabelIdade);
        jFrameTela.add(jLabelRaca);
        jFrameTela.add(jLabelApelido);
        jFrameTela.add(jLabelPreco);
        jFrameTela.add(jLabelDescricao);
        
        //TextField add a Frame
        jFrameTela.add(jTextFieldNome);
        jFrameTela.add(jTextFieldIdade);

    }

}
