package psv;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

public class FrmCarro extends javax.swing.JFrame {

    private javax.swing.JButton Limpar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTable tblConsulta;

    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPlaca;

    public FrmCarro() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Estacionamento");
        setDefaultCloseOperation(
                javax.swing.WindowConstants.EXIT_ON_CLOSE
        );
        setResizable(false);

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();

        jLabel1 = new JLabel("Cadastramento de veículos");
        jLabel2 = new JLabel("Placa");
        jLabel3 = new JLabel("Cor");
        jLabel4 = new JLabel("Descrição");

        txtPlaca = new JTextField(10);
        txtCor = new JTextField(18);
        txtDescricao = new JTextField(30);

        lblMensagem = new JLabel("");

        btnIncluir = new JButton("Incluir");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar");
        Limpar = new JButton("Limpar");
        btnFechar = new JButton("Fechar");

        tblConsulta = new JTable(
                new DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Placa", "Cor", "Descrição"}
                ) {
                    @Override
                    public boolean isCellEditable(
                            int row, int column
                    ) {
                        return false;
                    }
                }
        );

        tblConsulta.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );

        jScrollPane1 = new JScrollPane(tblConsulta);

        jPanel1.setBackground(Color.WHITE);
        jLabel1.setFont(new Font("Arial Black", Font.PLAIN, 20));
        jLabel1.setForeground(new Color(204, 102, 0));
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new Color(204, 204, 204));
        jPanel2.setLayout(new BorderLayout(8, 8));

        JPanel painelCampos = new JPanel(new GridLayout(3, 2, 5, 8));
        painelCampos.setBackground(new Color(204, 204, 204));

        painelCampos.add(jLabel2);
        painelCampos.add(txtPlaca);
        painelCampos.add(jLabel3);
        painelCampos.add(txtCor);
        painelCampos.add(jLabel4);
        painelCampos.add(txtDescricao);

        lblMensagem.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblMensagem.setForeground(new Color(255, 102, 102));

        jPanel3.setBackground(new Color(204, 204, 204));
        jPanel3.setLayout(new FlowLayout());

        jPanel3.add(btnIncluir);
        jPanel3.add(btnAlterar);
        jPanel3.add(btnExcluir);
        jPanel3.add(btnPesquisar);
        jPanel3.add(Limpar);
        jPanel3.add(btnFechar);

        jPanel4.setBackground(new Color(204, 204, 204));
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(jScrollPane1, BorderLayout.CENTER);

        JPanel painelSuperior = new JPanel(new BorderLayout(5, 5));
        painelSuperior.setBackground(new Color(204, 204, 204));
        painelSuperior.add(painelCampos, BorderLayout.NORTH);
        painelSuperior.add(lblMensagem, BorderLayout.CENTER);
        painelSuperior.add(jPanel3, BorderLayout.SOUTH);

        jPanel2.add(painelSuperior, BorderLayout.NORTH);
        jPanel2.add(jPanel4, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(jPanel1, BorderLayout.NORTH);
        add(jPanel2, BorderLayout.CENTER);

        btnFechar.addMouseListener(
            new java.awt.event.MouseAdapter() {
                public void mouseClicked(
                        java.awt.event.MouseEvent evt
                ) {
                    btnFecharMouseClicked(evt);
                }
            }
        );

        Limpar.addMouseListener(
            new java.awt.event.MouseAdapter() {
                public void mouseClicked(
                        java.awt.event.MouseEvent evt
                ) {
                    LimparMouseClicked(evt);
                }
            }
        );

        btnIncluir.addMouseListener(
            new java.awt.event.MouseAdapter() {
                public void mouseClicked(
                        java.awt.event.MouseEvent evt
                ) {
                    btnIncluirMouseClicked(evt);
                }
            }
        );

        btnPesquisar.addMouseListener(
            new java.awt.event.MouseAdapter() {
                public void mouseClicked(
                        java.awt.event.MouseEvent evt
                ) {
                    btnPesquisarMouseClicked(evt);
                }
            }
        );

        tblConsulta.addMouseListener(
            new java.awt.event.MouseAdapter() {
                public void mouseClicked(
                        java.awt.event.MouseEvent evt
                ) {
                    tblConsultaMouseClicked(evt);
                }
            }
        );

        btnAlterar.addMouseListener(
            new java.awt.event.MouseAdapter() {
                public void mouseClicked(
                        java.awt.event.MouseEvent evt
                ) {
                    btnAlterarMouseClicked(evt);
                }
            }
        );

        btnExcluir.addMouseListener(
            new java.awt.event.MouseAdapter() {
                public void mouseClicked(
                        java.awt.event.MouseEvent evt
                ) {
                    btnExcluirMouseClicked(evt);
                }
            }
        );

        pack();
        setSize(650, 500);
        setLocationRelativeTo(null);
    }

    private void LimparMouseClicked(
            java.awt.event.MouseEvent evt
    ) {
        txtPlaca.setText("");
        txtCor.setText("");
        txtDescricao.setText("");
        lblMensagem.setText("");

        DefaultTableModel tbm =
                (DefaultTableModel) tblConsulta.getModel();

        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
    }

    private void btnFecharMouseClicked(
            java.awt.event.MouseEvent evt
    ) {
        System.exit(0);
    }

    private void btnIncluirMouseClicked(
            java.awt.event.MouseEvent evt
    ) {
        Connection con = Conexao.abrirConexao();

        if (con == null) {
            lblMensagem.setText("Falha na conexão.");
            return;
        }

        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        cb.setPlaca(txtPlaca.getText());
        cb.setCor(txtCor.getText());
        cb.setDescricao(txtDescricao.getText());

        lblMensagem.setText(cd.inserir(cb));

        Conexao.fecharConexao(con);
    }

    private void btnPesquisarMouseClicked(
            java.awt.event.MouseEvent evt
    ) {
        Connection con = Conexao.abrirConexao();

        if (con == null) {
            lblMensagem.setText("Falha na conexão.");
            return;
        }

        CarroDAO cd = new CarroDAO(con);
        List<CarroBean> listaCarro = cd.listarTodos();

        DefaultTableModel tbm =
                (DefaultTableModel) tblConsulta.getModel();

        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }

        if (listaCarro != null) {
            for (CarroBean cb : listaCarro) {
                tbm.addRow(new Object[]{
                    cb.getPlaca(),
                    cb.getCor(),
                    cb.getDescricao()
                });
            }
        }

        Conexao.fecharConexao(con);
    }

    private void tblConsultaMouseClicked(
            java.awt.event.MouseEvent evt
    ) {
        int linha = tblConsulta.getSelectedRow();

        if (linha >= 0) {
            txtPlaca.setText(
                    tblConsulta.getValueAt(linha, 0).toString()
            );
            txtCor.setText(
                    tblConsulta.getValueAt(linha, 1).toString()
            );
            txtDescricao.setText(
                    tblConsulta.getValueAt(linha, 2).toString()
            );
        }
    }

    private void btnAlterarMouseClicked(
            java.awt.event.MouseEvent evt
    ) {
        Connection con = Conexao.abrirConexao();

        if (con == null) {
            lblMensagem.setText("Falha na conexão.");
            return;
        }

        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        cb.setPlaca(txtPlaca.getText());
        cb.setCor(txtCor.getText());
        cb.setDescricao(txtDescricao.getText());

        lblMensagem.setText(cd.alterar(cb));

        Conexao.fecharConexao(con);
    }

    private void btnExcluirMouseClicked(
            java.awt.event.MouseEvent evt
    ) {
        Connection con = Conexao.abrirConexao();

        if (con == null) {
            lblMensagem.setText("Falha na conexão.");
            return;
        }

        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        cb.setPlaca(txtPlaca.getText());

        Object[] opcoes = {"Sim", "Não"};

        int i = JOptionPane.showOptionDialog(
                null,
                "Deseja excluir esse veículo: "
                        + txtPlaca.getText() + "?",
                "Exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (i == JOptionPane.YES_OPTION) {
            lblMensagem.setText(cd.excluir(cb));
        }

        Conexao.fecharConexao(con);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCarro().setVisible(true);
            }
        });
    }
}
