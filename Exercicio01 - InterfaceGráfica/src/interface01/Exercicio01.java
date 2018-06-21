package interface01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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
    private ButtonGroup buttonGroupVivo, buttonGroupComida;

    private JCheckBox jCheckBoxAdestrado,
            jCheckBoxCastrado,
            jCheckBoxVacinado,
            jCheckBoxPedigree;

    private JComboBox jComboBoxRaca;
    private JTextArea jTextAreaDescricao;
    private JScrollPane barraRolagem;

    private JTextField jTextFieldNome, jTextFieldIdade, jTextFieldApelido, jTextFieldPreco;

    private DefaultComboBoxModel selecao;

    public Exercicio01() {

        gerarTela();
        instaciarObjetos();
        criarDimensoes();
        criarLocalizacao();
        adicionarComponentes();
        acaoComboBox();
        acaoJButtonCancelar();
        definirButtonGroup();
        estilizarRadioButton();
        estilizarJTextArea();
        estilizarCheckBox();
        acaoJButtonSalvar();

        jFrameTela.setVisible(true);

    }

    private void gerarTela() {
        jFrameTela = new JFrame();
        jFrameTela.setSize(645, 445);
        jFrameTela.setLayout(null);
        jFrameTela.setLocationRelativeTo(null);
        jFrameTela.setTitle("EXERCICIO");
        jFrameTela.getContentPane().setBackground(Color.decode("#bfe2ff"));
        jFrameTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void instaciarObjetos() {

        //Labels
        jLabelNome = new JLabel();
        jLabelNome.setText("Nome:");
        jLabelIdade = new JLabel("Idade:");
        jLabelRaca = new JLabel("Raça:");
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

        ////ButtonGroup
        buttonGroupComida = new ButtonGroup();
        buttonGroupVivo = new ButtonGroup();

        //JCheckBoxs
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxPedigree = new JCheckBox("Tem pedigree");

        //JComboBox
        jComboBoxRaca = new JComboBox();

        //JTextArea
        jTextAreaDescricao = new JTextArea();

        barraRolagem = new JScrollPane();

        //JTextField
        jTextFieldNome = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldApelido = new JTextField();
        jTextFieldPreco = new JTextField();

    }

    private void criarDimensoes() {

        //DimensÃ£o da Label
        jLabelNome.setSize(50, 20);
        jLabelIdade.setSize(50, 20);
        jLabelRaca.setSize(50, 20);
        jLabelApelido.setSize(80, 20);
        jLabelPreco.setSize(50, 20);
        jLabelDescricao.setSize(80, 10);

        //DimensÃ£o da TextField
        jTextFieldNome.setSize(380, 20);
        jTextFieldIdade.setSize(180, 20);
        jTextFieldApelido.setSize(190, 20);
        jTextFieldPreco.setSize(180, 20);

        //DimensÃ£o da ComboBox
        jComboBoxRaca.setSize(180, 20);

        //DimensÃ£o RadioButton
        jRadioButtonVivo.setSize(60, 20);
        jRadioButtonMorto.setSize(60, 20);
        jRadioButtonRacao.setSize(80, 20);
        jRadioButtonCome.setSize(160, 20);

        //DimensÃ£o CheckBox
        jCheckBoxAdestrado.setSize(100, 20);
        jCheckBoxCastrado.setSize(100, 20);
        jCheckBoxPedigree.setSize(125, 20);
        jCheckBoxVacinado.setSize(100, 20);

        //Dimensão JTextArea
        barraRolagem.setSize(595, 100);

        //Dimensão JButton
        jButtonSalvar.setSize(150, 75);
        jButtonCancelar.setSize(150, 75);

        //TODO fazer as dimensoes
    }

    private void criarLocalizacao() {

        //LocalizaÃ§Ã£o da Label
        jLabelNome.setLocation(10, 10);
        jLabelIdade.setLocation(425, 10);
        jLabelRaca.setLocation(10, 60);
        jLabelApelido.setLocation(200, 60);
        jLabelPreco.setLocation(425, 60);
        jLabelDescricao.setLocation(10, 190);

        //LocalizaÃ§Ã£o da TextField
        jTextFieldNome.setLocation(10, 30);
        jTextFieldIdade.setLocation(425, 30);
        jTextFieldApelido.setLocation(200, 80);
        jTextFieldPreco.setLocation(425, 80);

        //LocalizaÃ§Ã£o da ComboBox
        jComboBoxRaca.setLocation(10, 80);

        //LocalizaÃ§Ã£o JRadioButton
        jRadioButtonVivo.setLocation(10, 125);
        jRadioButtonMorto.setLocation(10, 150);
        jRadioButtonRacao.setLocation(115, 125);
        jRadioButtonCome.setLocation(115, 150);

        //Localização JCheckBox
        jCheckBoxAdestrado.setLocation(350, 125);
        jCheckBoxCastrado.setLocation(350, 150);
        jCheckBoxPedigree.setLocation(450, 125);
        jCheckBoxVacinado.setLocation(450, 150);

        //Localização da TextArea e ScrollPane
        barraRolagem.setLocation(10, 215);

        //Localização JButton
        jButtonCancelar.setLocation(290, 325);
        jButtonSalvar.setLocation(455, 325);

    }

    private void acaoComboBox() {

        selecao = new DefaultComboBoxModel(
                new Object[]{
                    "Pastor-Alemão",
                    "Labrador",
                    "Buldogue",
                    "Poodle",
                    "Beagle",
                    "Golden Retriver",
                    "Pug",
                    "Rottweiler",});

        jComboBoxRaca.setModel(selecao);
        jComboBoxRaca.setSelectedIndex(-1);

    }

    private void acaoJButtonCancelar() {
        jButtonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jTextFieldNome.setText("");
                jTextFieldIdade.setText("");
                jTextFieldApelido.setText("");
                jTextFieldPreco.setText("");
                jTextAreaDescricao.setText("");
                jComboBoxRaca.setSelectedIndex(-1);
                jCheckBoxAdestrado.setSelected(false);
                jCheckBoxCastrado.setSelected(false);
                jCheckBoxPedigree.setSelected(false);
                jCheckBoxVacinado.setSelected(false);
                buttonGroupComida.clearSelection();
                buttonGroupVivo.clearSelection();
            }
        });
    }

    private void acaoJButtonSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = jTextFieldNome.getText().trim();
                String apelido = jTextFieldApelido.getText().trim();

                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "!! Campo \"Nome\" esta em braco !!", "INVÁLIDO", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
        });

    }

    private void definirButtonGroup() {
        buttonGroupVivo.add(jRadioButtonVivo);
        buttonGroupVivo.add(jRadioButtonMorto);
        buttonGroupComida.add(jRadioButtonRacao);
        buttonGroupComida.add(jRadioButtonCome);
    }

    private void estilizarRadioButton() {
        jRadioButtonVivo.setContentAreaFilled(false);
        jRadioButtonMorto.setContentAreaFilled(false);
        jRadioButtonRacao.setContentAreaFilled(false);
        jRadioButtonCome.setContentAreaFilled(false);

    }

    private void estilizarJTextArea() {
        barraRolagem.setViewportView(jTextAreaDescricao);
        barraRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        barraRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextAreaDescricao.setBorder(new LineBorder(Color.GRAY));
        jTextAreaDescricao.setLineWrap(true);
    }

    private void estilizarCheckBox() {
        jCheckBoxAdestrado.setContentAreaFilled(false);
        jCheckBoxCastrado.setContentAreaFilled(false);
        jCheckBoxPedigree.setContentAreaFilled(false);
        jCheckBoxVacinado.setContentAreaFilled(false);

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

        //JCheckBox add a Frame
        jFrameTela.add(jCheckBoxAdestrado);
        jFrameTela.add(jCheckBoxCastrado);
        jFrameTela.add(jCheckBoxPedigree);
        jFrameTela.add(jCheckBoxVacinado);

        //JTextArea e JScrollPane add a Frame
        jFrameTela.add(barraRolagem);

        //JButton add a Frame
        jFrameTela.add(jButtonCancelar);
        jFrameTela.add(jButtonSalvar);

    }

    private void validacao() {

        String nome = jTextFieldNome.getText().trim();
        String apelido = jTextFieldApelido.getText().trim();
        int idade = 0;

        try {
            idade = Integer.parseInt(jTextFieldIdade.getText());
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Entrada Inválida");
        }
        
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "!! Campo \"Nome\" esta em braco !!", "INVÁLIDO", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

}
