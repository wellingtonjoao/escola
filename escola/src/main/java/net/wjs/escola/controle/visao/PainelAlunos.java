package br.com.controle.visao;

import br.com.controle.util.modelo.Aluno;
import br.com.controle.util.modelo.Turma;
import br.com.controle.util.negocio.AlunoRN;
import br.com.controle.util.negocio.TurmaRN;
import br.com.controle.visao.abstractModels.GenericComboBoxModel;
import br.com.controle.visao.abstractModels.TabelaAluno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
*
* @author WJS
*/
public class PainelAlunos extends javax.swing.JInternalFrame {

    private GenericComboBoxModel<Turma> comoModelPesquisaTurma;
    private GenericComboBoxModel<String> boxModelAno;
    GerenteDeImagens gerenteDeArquivos = new GerenteDeImagens();
    private final List<Aluno> novosAlunos = new ArrayList<>();
    private GenericComboBoxModel<Turma> boxModelTurma;
    private final TabelaAluno TABELA_ALUNO = new TabelaAluno();
    private static PainelAlunos CADASTRO_ALUNOS;

    /**
     * Creates new form CadastroAlunos
     */
    private PainelAlunos() {
        initComponents();
        meuInitComponents();
    }

    private void meuInitComponents() {
        //  ((BasicInternalFrameUI) getUI()).setNorthPane(null);
        TextPrompt textPrompt = new TextPrompt("DIGITE O NOME DO ALUNO", jTextField12);
        textPrompt.changeAlpha(0.5f);
        textPrompt.setForeground(Color.GRAY);
        povoartabelaAluno();
        povoarComboboxTurma();
        listarAnos();
    }

    private void povoarComboboxTurma() {
        boxModelTurma = new GenericComboBoxModel(new TurmaRN().buscarTodos());
        comboTurma.setModel(boxModelTurma);
    }

    public static synchronized PainelAlunos getInstancia() {
        if (CADASTRO_ALUNOS == null) {
            CADASTRO_ALUNOS = new PainelAlunos();
        }
        return CADASTRO_ALUNOS;
    }

    private void povoartabelaAluno() {
        TABELA_ALUNO.addListaAluno(new AlunoRN().buscarTodos());
        tabelaPesquisaAluno.setModel(TABELA_ALUNO);
    }

    private Aluno encapsulaAluno() {
        Aluno aluno = new Aluno();
        aluno.setMatricula(campoMatricula.getText());
        aluno.setNome(campoNomeAluno.getText());
        aluno.setTurma((Turma) boxModelTurma.get(comboTurma.getSelectedIndex()));
        aluno.setuRLImagem(gerenteDeArquivos.getUrlImagem());
        aluno.setSituacaoAluno(comboSituacao.getSelectedItem().toString());
        aluno.setDataCadastro(campoDataCadastro.getDate());
        if (checkStatus.isSelected()) {
            aluno.setStatus("ATIVO");
        } else {
            aluno.setStatus("INATIVO");
        }

        aluno.setBairro(campoBairro.getText());
        aluno.setCelular(campoCelular.getText());
        aluno.setCep(campoCEP.getText());
        aluno.setCidade(campoCidade.getText());
        aluno.setCor(String.valueOf(comboCor.getSelectedItem()));
        aluno.setDataEmissao(JDataEmissao.getDate());
        aluno.setDataNascimento(JDataNascimento.getDate());
        aluno.setEmail(campoEmail.getText());
        aluno.setFolha(campoFolha.getText());
        aluno.setLivro(campoLivro.getText());
        aluno.setNacionalidade(String.valueOf(comboNascinalidade.getSelectedItem()));
        aluno.setRegistroNascimento(campoRegistroNascimento.getText());
        aluno.setNumeroResidencia(campoNumeroCasa.getText());
        aluno.setRua(campoRua.getText());

        if (JRM.isSelected()) {
            aluno.setSexo('M');
        } else if (JRF.isSelected()) {
            aluno.setSexo('F');
        }
        aluno.setTelefone(campoTelefone.getText());
        aluno.setWhatsapp(campoWhatsApp.getText());
        return aluno;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        grupoQuestao1 = new javax.swing.ButtonGroup();
        grupoQuestao2 = new javax.swing.ButtonGroup();
        grupoQuestao3 = new javax.swing.ButtonGroup();
        grupoQuestao4 = new javax.swing.ButtonGroup();
        grupoQuestao5 = new javax.swing.ButtonGroup();
        grupoQuestao6 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        subJPanelMatricula = new javax.swing.JPanel();
        jPanelMatricula = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPesquisaAluno = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboTurma = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        campoNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDataCadastro = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox();
        checkStatus = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        campoImagemAluno = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        comboBoxPesquisaTurma = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        comboAno = new javax.swing.JComboBox<>();
        jPanelAluno = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        campoFolha = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        campoLivro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboCor = new javax.swing.JComboBox();
        comboNascinalidade = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        campoRegistroNascimento = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        JRF = new javax.swing.JRadioButton();
        JRM = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        JDataEmissao = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        JDataNascimento = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoNumeroCasa = new javax.swing.JTextField();
        campoCEP = new javax.swing.JFormattedTextField();
        jPanel13 = new javax.swing.JPanel();
        campoTelefone = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoWhatsApp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanelResponsavel = new javax.swing.JPanel();
        jPanelQuestionario = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.white);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(900, 627));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel3.setLayout(new java.awt.CardLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabelaPesquisaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Barras", "Nome", "Turma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesquisaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisaAlunoMouseClicked(evt);
            }
        });
        tabelaPesquisaAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaPesquisaAlunoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaPesquisaAlunoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaPesquisaAluno);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados da Matricula"));

        jLabel1.setText("Matrícula: *");

        campoMatricula.setEditable(false);
        campoMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        campoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMatriculaActionPerformed(evt);
            }
        });

        jLabel5.setText("Data Cadastro: *");

        comboTurma.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboTurma.setForeground(new java.awt.Color(204, 0, 0));
        comboTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTurmaActionPerformed(evt);
            }
        });

        jLabel3.setText("Turma: *");

        campoNomeAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        campoNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeAlunoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome: *");

        jLabel28.setText("Situação: *");

        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CURSANDO", "DESISTENTE", "CONCLUIDO" }));

        checkStatus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        checkStatus.setForeground(new java.awt.Color(204, 0, 0));
        checkStatus.setText("Ativo");

        jLabel29.setText("Status: *");

        campoImagemAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controle/visao/icones/aluno.png"))); // NOI18N
        campoImagemAluno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoImagemAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoImagemAlunoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTurma, javax.swing.GroupLayout.Alignment.TRAILING, 0, 670, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkStatus))
                    .addComponent(campoNomeAluno))
                .addGap(18, 18, 18)
                .addComponent(campoImagemAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel28, jLabel3});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28)
                                .addComponent(jLabel5))
                            .addComponent(campoDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(checkStatus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campoImagemAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campoDataCadastro, campoMatricula, checkStatus, jLabel1, jLabel2, jLabel28, jLabel29, jLabel3, jLabel5});

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 102, 102));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controle/visao/icones/save32px.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(0, 102, 102));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controle/visao/icones/erase7.png"))); // NOI18N
        btnDeletar.setText("DELETAR");
        btnDeletar.setContentAreaFilled(false);
        btnDeletar.setFocusable(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("IMPORTAR");
        jButton3.setContentAreaFilled(false);
        jButton3.setEnabled(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controle/visao/icones/carteirinha.png"))); // NOI18N
        jButton5.setText("GERAR CARTEIRINHA");
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("NOTAS");
        jButton2.setContentAreaFilled(false);
        jButton2.setEnabled(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeletar, btnSalvar, jButton2, jButton3});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnSalvar)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addGap(2, 2, 2))
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDeletar, btnSalvar, jButton2, jButton3});

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(0, 102, 102));
        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.setContentAreaFilled(false);
        btnAdicionar.setFocusable(false);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(0, 102, 102));
        btnRemover.setText("REMOVER");
        btnRemover.setContentAreaFilled(false);
        btnRemover.setFocusable(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("LIMPAR");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        comboBoxPesquisaTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPesquisaTurmaActionPerformed(evt);
            }
        });

        jLabel31.setText("Turma:");

        jLabel30.setText("Status");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel32.setText("ANO:");

        comboAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016" }));
        comboAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMatriculaLayout = new javax.swing.GroupLayout(jPanelMatricula);
        jPanelMatricula.setLayout(jPanelMatriculaLayout);
        jPanelMatriculaLayout.setHorizontalGroup(
            jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMatriculaLayout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addGap(10, 10, 10)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMatriculaLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxPesquisaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12)))
                .addContainerGap())
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanelMatriculaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdicionar, btnRemover});

        jPanelMatriculaLayout.setVerticalGroup(
            jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemover)
                        .addComponent(btnAdicionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxPesquisaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32)
                        .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelMatriculaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdicionar, btnRemover, jButton1});

        jPanelMatriculaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxPesquisaTurma, jTextField12});

        javax.swing.GroupLayout subJPanelMatriculaLayout = new javax.swing.GroupLayout(subJPanelMatricula);
        subJPanelMatricula.setLayout(subJPanelMatriculaLayout);
        subJPanelMatriculaLayout.setHorizontalGroup(
            subJPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subJPanelMatriculaLayout.setVerticalGroup(
            subJPanelMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Matrícula", subJPanelMatricula);

        jPanelAluno.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados"));

        jLabel18.setText("Folha: *");

        jLabel16.setText("Livro: *");

        jLabel8.setText("Cor: *");

        comboCor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Branca", "Preta", "Parda", "Amarela", "Indígena", "Outro" }));

        comboNascinalidade.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboNascinalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Antígua e Barbuda - Antiguano", "Argentina - Argentino", "Bahamas - Bahamense", "Barbados - Barbadiano, barbadense", "Belize - Belizenho", "Bolívia - Boliviano", "Brasil - Brasileiro", "Chile - Chileno", "Colômbia - Colombiano", "Costa Rica - Costarriquenho", "Cuba - Cubano", "Dominica - Dominicano", "Equador - Equatoriano", "El Salvador - Salvadorenho", "Granada - Granadino", "Guatemala - Guatemalteco", "Guiana - Guianês", "Guiana Francesa - Guianense", "Haiti - Haitiano", "Honduras - Hondurenho", "Jamaica - Jamaicano", "México - Mexicano", "Nicarágua - Nicaraguense", "Panamá - Panamenho", "Paraguai - Paraguaio", "Peru - Peruano", "Porto Rico - Portorriquenho", "República Dominicana - Dominicana", "São Cristóvão e Nevis - São-cristovense", "São Vicente e Granadinas - São-vicentino", "Santa Lúcia - Santa-lucense", "Suriname - Surinamês", "Trinidad e Tobago - Trindadense", "Uruguai - Uruguaio", "Venezuela - Venezuelano", "Alemanha - Alemão", "Áustria - Austríaco", "Bélgica - Belga", "Croácia - Croata", "Dinamarca - Dinamarquês", "Eslováquia - Eslovaco", "Eslovênia - Esloveno", "Espanha - Espanhol", "França - Francês", "Grécia - Grego", "Hungria - Húngaro", "Irlanda - Irlandês", "Itália - Italiano", "Noruega - Noruego", "Países Baixos - Holandês", "Polônia - Polonês", "Portugal - Português", "Reino Unido - Britânico", "Inglaterra - Inglês", "País de Gales - Galês", "Escócia - Escocês", "Romênia - Romeno", "Rússia - Russo", "Sérvio - Sérvio", "Suécia - Sueco", "Suíça - Suíço", "Turquia - Turco", "Ucrânia - Ucraniano", "Estados Unidos - Americano", "Canadá - Canadense", "Angola - Angolano", "Moçambique - Moçambicano", "África do Sul - Sul-africano", "Zimbabue - Zimbabuense", "Argélia - Argélia", "Comores - Comorense", "Egito - Egípcio", "Líbia - Líbio", "Marrocos - Marroquino", "Gana - Ganés", "Quênia - Queniano", "Ruanda - Ruandês", "Uganda - Ugandense", "Botsuana - Bechuano", "Costa do Marfim - Marfinense", "Camarões - Camaronense", "Nigéria - Nigeriano", "Somália - Somali", "Austrália - Australiano", "Nova Zelândia - Neozelandês", "Afeganistão - Afegão", "Arábia Saudita - Saudita", "Armênia - Armeno", "Armeno - Bangladesh", "China - Chinês", "Coréia do Norte - Norte-coreano, coreano", "Coréia do Sul - Sul-coreano, coreano", "Índia - Indiano", "Indonésia - Indonésio", "Iraque - Iraquiano", "Irã - Iraniano", "Israel - Israelita", "Japão - Japonês", "Malásia - Malaio", "Nepal - Nepalês", "Omã - Omanense", "Paquistão - Paquistanês", "Palestina - Palestino", "Qatar - Qatarense", "Síria - Sírio", "Sri Lanka - Cingalês", "Tailândia - Tailandês", "Timor-Leste - Timorense, maubere", "Emirados Árabes Unidos - Árabe, emiratense", "Vietnã - Vietnamita", "Iêmen - Iemenita" }));
        comboNascinalidade.setSelectedIndex(6);
        comboNascinalidade.setToolTipText("");

        jLabel7.setText("Nacionalidade: *");

        jLabel19.setText("N° Registro de Nascimento: *");

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        grupoSexo.add(JRF);
        JRF.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JRF.setText("Feminino");

        grupoSexo.add(JRM);
        JRM.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JRM.setText("Masculino");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(JRM)
                .addComponent(JRF))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Datas"));

        jLabel17.setText("Emissão: *");

        JDataEmissao.setForeground(new java.awt.Color(204, 0, 0));

        jLabel4.setText("Nascimento: *");

        JDataNascimento.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(JDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboNascinalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoFolha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoRegistroNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoLivro, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(campoRegistroNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(campoFolha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(comboNascinalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        jLabel20.setText("Rua: *");

        jLabel21.setText("Bairro: *");

        jLabel22.setText("Cidade: *");

        jLabel23.setText("CEP: *");

        jLabel24.setText("N° ");

        try {
            campoCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(campoRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campoCidade)
                    .addComponent(campoBairro))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(campoNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campoRua.getAccessibleContext().setAccessibleName("");
        campoBairro.getAccessibleContext().setAccessibleName("");
        campoCidade.getAccessibleContext().setAccessibleName("");

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contato"));

        campoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCelularActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone: *");

        jLabel25.setText("Celular: *");

        jLabel26.setText("Whatsapp: *");

        jLabel27.setText("E-mail: *");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEmail)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26)
                    .addComponent(campoWhatsApp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap())
        );

        jButton4.setText("VOLTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("PRÓXIMO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlunoLayout = new javax.swing.GroupLayout(jPanelAluno);
        jPanelAluno.setLayout(jPanelAlunoLayout);
        jPanelAlunoLayout.setHorizontalGroup(
            jPanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap())
        );

        jPanelAlunoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton4, jButton6});

        jPanelAlunoLayout.setVerticalGroup(
            jPanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aluno", jPanelAluno);

        jPanelResponsavel.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        jPanelResponsavel.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Responsável", jPanelResponsavel);

        jPanelQuestionario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Responda o questionário"));

        jLabel9.setText("6. Tem problema respiratório?");

        jLabel10.setText("1. Possui Problema de saúde?");

        jLabel11.setText("2. O aluno toma algum médicamento?");

        jLabel13.setText("3. Tem alguma deficiencia?");

        jLabel14.setText("4. Possui alguma alergia?");

        jLabel15.setText("5. Possui algum problema de visão?");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton3.setText("SIM");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton4.setText("NÃO");

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton5.setText("SIM");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton6.setText("NÃO");

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao3.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton7.setText("SIM");

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao3.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton8.setText("NÃO");

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao4.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton9.setText("NÃO");

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao4.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton10.setText("SIM");

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao5.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton11.setText("SIM");

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao5.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton12.setText("NÃO");

        jRadioButton13.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao6.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton13.setText("SIM");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        jRadioButton14.setBackground(new java.awt.Color(255, 255, 255));
        grupoQuestao6.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButton14.setText("NÃO");

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("7. Como o aluno vai a escola?");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox1.setText("A pé");

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox3.setText("Bicicleta");

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox5.setText("Carro");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox2.setText("Transporte Público");

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox4.setText("Moto");

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox6.setText("Outros");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCheckBox1, jCheckBox3, jCheckBox5});

        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jRadioButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jLabel15)
                    .addComponent(jRadioButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addGap(104, 104, 104)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelQuestionarioLayout = new javax.swing.GroupLayout(jPanelQuestionario);
        jPanelQuestionario.setLayout(jPanelQuestionarioLayout);
        jPanelQuestionarioLayout.setHorizontalGroup(
            jPanelQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuestionarioLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 597, Short.MAX_VALUE))
        );
        jPanelQuestionarioLayout.setVerticalGroup(
            jPanelQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuestionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Questionário", jPanelQuestionario);

        jPanel3.add(jTabbedPane1, "card3");

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Gerar");

        jMenuItem1.setText("Boletim");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Carteirinhas");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String matricula = campoMatricula.getText().trim();
        int index = tabelaPesquisaAluno.getSelectedRow();
        AlunoRN alunoRN = new AlunoRN();
        if (!novosAlunos.isEmpty()) {
            Collections.sort(novosAlunos);
            if (alunoRN.salvarAlunos(novosAlunos)) {
                for (Aluno novoAluno : novosAlunos) {
                    if (!novoAluno.getuRLImagem().isEmpty()) {
                        gerenteDeArquivos.gravarImagem(novoAluno.getuRLImagem(), campoImagemAluno.getWidth(), campoImagemAluno.getHeight(),
                                "./fotos/" + novoAluno.getMatricula().concat(".jpg"));
                    }
                }
            }
        } else if (tabelaPesquisaAluno.isRowSelected(index) && !matricula.isEmpty()) {
            Aluno aluno = encapsulaAluno();
            if (alunoRN.salvar(aluno)) {
                if (!aluno.getuRLImagem().isEmpty()) {
                    gerenteDeArquivos.gravarImagem(aluno.getuRLImagem(), campoImagemAluno.getWidth(), campoImagemAluno.getHeight(),
                            "./fotos/" + aluno.getMatricula().concat(".jpg"));
                }
            }
        }

        TABELA_ALUNO.inserirAlunos(alunoRN.buscarTodos());
        limparCampos();
        novosAlunos.clear();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String matricula = campoMatricula.getText().trim();
        if (!matricula.isEmpty() && tabelaPesquisaAluno.isRowSelected(tabelaPesquisaAluno.getSelectedRow())) {
            if (new AlunoRN().remover(matricula)) {

                gerenteDeArquivos.removerImagem("./fotos/" + matricula.concat(".jpg"));
                limparCampos();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void campoNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeAlunoActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        CADASTRO_ALUNOS = null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void comboTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTurmaActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (verificaCampos()) {
            Aluno aluno = encapsulaAluno();
            novosAlunos.add(aluno);
            TABELA_ALUNO.inserirAlunos(novosAlunos);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tabelaPesquisaAluno.isRowSelected(tabelaPesquisaAluno.getSelectedRow()) && !novosAlunos.isEmpty()) {
            int index = tabelaPesquisaAluno.getSelectedRow();
            novosAlunos.remove(index);
            TABELA_ALUNO.delAluno(tabelaPesquisaAluno.getSelectedRow());
            limparCampos();
            if (novosAlunos.isEmpty()) {
                TABELA_ALUNO.inserirAlunos(new AlunoRN().buscarTodos());
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tabelaPesquisaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisaAlunoMouseClicked
        if (tabelaPesquisaAluno.isRowSelected(tabelaPesquisaAluno.getSelectedRow())) {
            setAlunoDEnviado(TABELA_ALUNO.getAluno(tabelaPesquisaAluno.getSelectedRow()));
        }         // TODO add your handling code here:
    }//GEN-LAST:event_tabelaPesquisaAlunoMouseClicked

    private void campoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMatriculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaPesquisaAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaPesquisaAlunoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaPesquisaAlunoKeyPressed

    private void campoImagemAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoImagemAlunoMouseClicked
        if (evt.getClickCount() == 2) {
            gerenteDeArquivos.escolherImagem(campoImagemAluno);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_campoImagemAlunoMouseClicked

    private void tabelaPesquisaAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaPesquisaAlunoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (tabelaPesquisaAluno.isRowSelected(tabelaPesquisaAluno.getSelectedRow())) {
                setAlunoDEnviado(TABELA_ALUNO.getAluno(tabelaPesquisaAluno.getSelectedRow()));

            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaPesquisaAlunoKeyReleased

    private void campoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCelularActionPerformed

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        consulta();      // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane1.setSelectedIndex(2);            // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12KeyTyped

    private void comboAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnoActionPerformed
        listarTurmasPorAno();
        consulta();
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnoActionPerformed

    private void comboBoxPesquisaTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPesquisaTurmaActionPerformed
        consulta();
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPesquisaTurmaActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        consulta();         // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDataEmissao;
    private com.toedter.calendar.JDateChooser JDataNascimento;
    private javax.swing.JRadioButton JRF;
    private javax.swing.JRadioButton JRM;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JFormattedTextField campoCEP;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoCidade;
    private com.toedter.calendar.JDateChooser campoDataCadastro;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFolha;
    private javax.swing.JLabel campoImagemAluno;
    private javax.swing.JTextField campoLivro;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNomeAluno;
    private javax.swing.JTextField campoNumeroCasa;
    private javax.swing.JTextField campoRegistroNascimento;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoWhatsApp;
    private javax.swing.JCheckBox checkStatus;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JComboBox<String> comboBoxPesquisaTurma;
    private javax.swing.JComboBox comboCor;
    private javax.swing.JComboBox comboNascinalidade;
    private javax.swing.JComboBox comboSituacao;
    private javax.swing.JComboBox comboTurma;
    private javax.swing.ButtonGroup grupoQuestao1;
    private javax.swing.ButtonGroup grupoQuestao2;
    private javax.swing.ButtonGroup grupoQuestao3;
    private javax.swing.ButtonGroup grupoQuestao4;
    private javax.swing.ButtonGroup grupoQuestao5;
    private javax.swing.ButtonGroup grupoQuestao6;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelAluno;
    private javax.swing.JPanel jPanelMatricula;
    private javax.swing.JPanel jPanelQuestionario;
    private javax.swing.JPanel jPanelResponsavel;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JPanel subJPanelMatricula;
    private javax.swing.JTable tabelaPesquisaAluno;
    // End of variables declaration//GEN-END:variables

    void setAlunoDEnviado(Aluno aluno) {
        campoDataCadastro.setDate(aluno.getDataCadastro());
        campoMatricula.setText(aluno.getMatricula());
        campoNomeAluno.setText(aluno.getNome());
        comboTurma.setSelectedItem(aluno.getTurma().toString());
        comboSituacao.setSelectedItem(aluno.getSituacaoAluno());
        checkStatus.setSelected(aluno.isAtivo());
        JDataEmissao.setDate(aluno.getDataEmissao());
        JDataNascimento.setDate(aluno.getDataNascimento());
        campoBairro.setText(aluno.getBairro());
        campoCEP.setText(aluno.getCep());
        campoCelular.setText(aluno.getCelular());
        campoCidade.setText(aluno.getCidade());
        campoDataCadastro.setDate(aluno.getDataCadastro());
        campoEmail.setText(aluno.getEmail());
        campoFolha.setText(aluno.getFolha());
        campoLivro.setText(aluno.getLivro());
        campoNumeroCasa.setText(aluno.getNumeroResidencia());
        campoRegistroNascimento.setText(aluno.getRegistroNascimento());
        campoRua.setText(aluno.getRua());
        campoTelefone.setText(aluno.getTelefone());
        campoWhatsApp.setText(aluno.getWhatsapp());
        comboNascinalidade.setSelectedItem(aluno.getNacionalidade());
        comboCor.setSelectedItem(aluno.getCor());
        if (aluno.getSexo() != null) {
            if (aluno.getSexo() == 'F') {
                JRF.setSelected(true);
            }
            if (aluno.getSexo() == 'M') {
                JRM.setSelected(true);
            }
        }
        String rl = "./fotos/" + aluno.getMatricula().trim().concat(".jpg");
        if (!gerenteDeArquivos.setImagemNaJlabel(rl, campoImagemAluno)) {
            campoImagemAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controle/visao/icones/aluno.png")));
        }
    }

    private boolean verificaCampos() {
        if (campoNomeAluno.getText().isEmpty()) {
            return false;
        }
        if (comboTurma.getSelectedIndex() == -1) {
            return false;
        }
        return !campoNomeAluno.getText().isEmpty();
    }

    public void limparCampos() {
        campoMatricula.setText(null);
        campoNomeAluno.setText(null);
        comboTurma.setSelectedIndex(0);
        gerenteDeArquivos.setUrlImagem("");
        checkStatus.setSelected(false);
        campoDataCadastro.setDate(null);
        JDataEmissao.setDate(null);
        JDataNascimento.setDate(null);
        campoBairro.setText(null);
        campoCEP.setText(null);
        campoCelular.setText(null);
        campoCidade.setText(null);
        campoEmail.setText(null);
        campoFolha.setText(null);
        campoLivro.setText(null);
        campoNumeroCasa.setText(null);
        campoRegistroNascimento.setText(null);
        campoRua.setText(null);
        campoTelefone.setText(null);
        campoWhatsApp.setText(null);
        grupoQuestao1.clearSelection();
        grupoQuestao2.clearSelection();
        grupoQuestao3.clearSelection();
        grupoQuestao4.clearSelection();
        grupoQuestao5.clearSelection();
        grupoQuestao6.clearSelection();
        grupoSexo.clearSelection();
        campoImagemAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controle/visao/icones/aluno.png")));
    }

    public void listarAnos() {
        List<String> anos = new TurmaRN().listarAnos();
        anos.add(0, "TODOS");
        boxModelAno = new GenericComboBoxModel(anos);
        comboAno.setModel(boxModelAno);
    }

    public void listarTurmasPorAno() {
        List<Turma> turma;
        if (comboAno.getSelectedItem().equals("TODOS")) {
            turma = new TurmaRN().buscarTodos();
        } else {
            turma = new TurmaRN().listarTurmaPorAno(String.valueOf(comboAno.getSelectedItem()));
        }
        comoModelPesquisaTurma = new GenericComboBoxModel(turma);
        comboBoxPesquisaTurma.setModel(comoModelPesquisaTurma);
    }

    private void consulta() {
        if (comboBoxPesquisaTurma.getSelectedIndex() >= 0 && jTextField12.getText().length() == 0) {
            TABELA_ALUNO.inserirAlunos(new AlunoRN().buscar(comoModelPesquisaTurma.get(comboBoxPesquisaTurma.getSelectedIndex()).getId(), jComboBox4.getSelectedItem().toString()));

        } else if (comboBoxPesquisaTurma.getSelectedIndex() < 0 && jTextField12.getText().length() == 0 && !comboAno.getSelectedItem().equals("TODOS")) {
            TABELA_ALUNO.inserirAlunos(new AlunoRN().buscar(comboAno.getSelectedItem().toString(), jComboBox4.getSelectedItem().toString()));

        } else if (comboBoxPesquisaTurma.getSelectedIndex() >= 0 && jTextField12.getText().length() > 0) {
            TABELA_ALUNO.inserirAlunos(new AlunoRN().buscar(jTextField12.getText(), comoModelPesquisaTurma.get(comboBoxPesquisaTurma.getSelectedIndex()).getId(), jComboBox4.getSelectedItem().toString()));

        } else {
            TABELA_ALUNO.inserirAlunos(new AlunoRN().buscarTodos());
        }
    }

}
