package interface1;


import busines.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class InterfaceScreenUsers extends JFrame {


    JLabel lb_id, lb_name, lb_sexo, lb_password, lb_observacoes, lb_autent, lb_raca;
    JTextField tf_id, tf_name, tf_password;

    JCheckBox ckb_ImNotRobo;
    JRadioButton rb_Branco, rB_negro, rb_pardo;
    JTextArea ta_Observacoes;
    JButton bt_salvar, bt_limpar, bt_fechar;

    String[] sexo = {"masculino:", "feminino", "Outro"};

    public InterfaceScreenUsers(){
        setTitle("Cadastro de Usuarios");
        setSize(400, 550);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);



        lb_autent = new JLabel("autêntifique-se");
        lb_raca = new JLabel("raça/ cor");
        lb_id        = new JLabel("id");
        lb_password        = new JLabel("senha");
        lb_name     = new JLabel("nome");
        lb_sexo       = new JLabel("sexo");

        ta_Observacoes = new JTextArea(5,20);
        lb_observacoes = new JLabel("observaçoes");

        tf_id      = new JTextField("");
        tf_name   = new JTextField("");
        tf_password   = new JTextField("");

        bt_salvar       = new JButton("Salvar");
        bt_limpar       = new JButton("Limpar");
        bt_fechar       = new JButton("Fechar");
        ckb_ImNotRobo = new JCheckBox("nao sou um robo   ");
        rb_Branco = new JRadioButton("branco");
        rb_pardo = new JRadioButton("negro");
        rB_negro = new JRadioButton("pardo");

        JComboBox<String> cb_sexo = new JComboBox<>(sexo);

        getContentPane().setLayout(null);

        getContentPane().add(lb_raca);
        getContentPane().add(lb_autent);
        getContentPane().add(ta_Observacoes);
        getContentPane().add(lb_observacoes);
        getContentPane().add(lb_name);
        getContentPane().add(lb_sexo);
        getContentPane().add(lb_password);
        getContentPane().add(lb_id);
        getContentPane().add(cb_sexo);
        getContentPane().add(tf_name);
        getContentPane().add(tf_password);
        getContentPane().add(tf_id);
        getContentPane().add(bt_salvar);
        getContentPane().add(bt_limpar);
        getContentPane().add(bt_fechar);
        getContentPane().add(rb_Branco );
        getContentPane().add(rb_pardo);
        getContentPane().add(rB_negro);
        getContentPane().add(ckb_ImNotRobo);


        lb_id        .setBounds(20, 20, 100, 15);
        tf_id       .setBounds(20, 40, 80, 25);

        lb_name      .setBounds(115,20, 100, 15);
        tf_name      .setBounds(115,40, 150, 25);

        lb_password      .setBounds(20, 70, 100, 15);
        tf_password      .setBounds(20, 90, 150, 25);

        lb_raca.setBounds(20,130,150,20);
        rb_Branco.setBounds(20, 150, 70, 20);
        rb_pardo.setBounds(100, 150, 70, 20);
        rB_negro.setBounds(190, 150, 70, 20);

        lb_sexo       .setBounds(20, 200,300, 15);
        cb_sexo       .setBounds(20, 220,250, 25);

        lb_observacoes        .setBounds(20,290,150, 15);
        ta_Observacoes        .setBounds(20,310,200, 50);
        ta_Observacoes.setBackground(Color.cyan);
        ta_Observacoes.setBorder(BorderFactory.createLineBorder(Color.blue.darker()));

        lb_autent       .setBounds(20,380,80, 30);
        ckb_ImNotRobo    .setBounds(110,380,280, 30);

        bt_salvar       .setBounds(20,440,80, 30);
        bt_limpar       .setBounds(105,440,80, 30);
        bt_fechar       .setBounds(190,440,80, 30);


        bt_salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User();
                user.setName(tf_name.getText());

                JOptionPane.showMessageDialog(null, tf_name.getText());

            }
        });

        bt_limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicou em limpar:");
            }
        });

        bt_fechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicou em fechar");
            }
        });

        setVisible(true);
    }
}



