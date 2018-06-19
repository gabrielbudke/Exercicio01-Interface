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
        jLabelNome.setSize(40,20);
        jLabelIdade.setSize(35,20);
        jLabelRaca.setSize(50,20);
        jLabelApelido.setSize(50,20);
        jLabelPreco.setSize(40,10);
        jLabelDescricao.setSize(45,10);
        
        //Dimensão da TextField
        jTextFieldNome.setSize(350,20); 
        jTextFieldIdade.setSize(170,20);
        jTextFieldApelido.setSize(190,20);
        jTextFieldPreco.setSize(170,20);
        
        //Dimensão da ComboBox
        jComboBoxRaca.setSize(145, 20);
        
        //Dimensão RadioButton
        jRadioButtonVivo.setSize(60,20);
        jRadioButtonMorto.setSize(60,20);
        jRadioButtonRacao.setSize(80,20);
        jRadioButtonCome.setSize(160,20);
        
        //Dimensão CheckBox
        jCheckBoxAdestrado.setSize(100,20);
        jCheckBoxCastrado.setSize(100,20);
        jCheckBoxPedigree.setSize(125,20);
        jCheckBoxVacinado.setSize(100,20);
        
        
        
        
        //TODO fazer as dimensoes
    }

    private void criarLocalizacao() {

        //Localização da Label
        jLabelNome.setLocation(10,10);
        jLabelIdade.setLocation(400,10);
        jLabelRaca.setLocation(10,60);
        jLabelApelido.setLocation(170,60);
        jLabelPreco.setLocation(400,60);
        jLabelDescricao.setLocation(10,210);
        
        //Localização da TextField
        jTextFieldNome.setLocation(10,30);
        jTextFieldIdade.setLocation(400,30);
        jTextFieldApelido.setLocation(170,80);
        jTextFieldPreco.setLocation(400,80);
        
        
        //Localização da ComboBox
        jComboBoxRaca.setLocation(10,80);
        
        //Localização JRadioButton
        jRadioButtonVivo.setLocation(10,125);
        jRadioButtonMorto.setLocation(10,155);
        jRadioButtonRacao.setLocation(120,125);
        jRadioButtonCome.setLocation(120,155);
        
        
        jCheckBoxAdestrado.setLocation(325,125);
        jCheckBoxCastrado.setLocation(325,155);
        jCheckBoxPedigree.setLocation(425,125);
        jCheckBoxVacinado.setLocation(425,155);
        
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
        jFrameTela.add(jTextFieldApelido);
        jFrameTela.add(jTextFieldPreco);
        
        //ComboBox add a Frame
        jFrameTela.add(jComboBoxRaca);

        //JRadioButton add a Frame
        jFrameTela.add(jRadioButtonVivo);
        jFrameTela.add(jRadioButtonMorto);
        jFrameTela.add(jRadioButtonRacao);
        jFrameTela.add(jRadioButtonCome);
        
        
        jFrameTela.add(jCheckBoxAdestrado);
        jFrameTela.add(jCheckBoxCastrado);
        jFrameTela.add(jCheckBoxPedigree);
        jFrameTela.add(jCheckBoxVacinado);
        
        
        
    }

}
