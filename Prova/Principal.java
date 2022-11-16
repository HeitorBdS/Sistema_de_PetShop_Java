package Prova;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Principal extends JFrame {
    private JButton btCadastroCliente;
    private JButton btConsultarCliente;
    private JButton btCadastropet;
    private ArrayList<Cliente>listaCliente;
    private ArrayList<Pet>listaPet;


    public static void main(String[] args) {
        Principal tela = new Principal();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(500, 500);
        tela.setVisible(true);
    }

    public Principal() {
        this.setTitle("Pet Shop Bicho Feliz");
        this.setBounds(0, 0, 700, 500);
        this.setDefaultCloseOperation(3);
        this.getContentPane().setLayout(null);
        this.btCadastroCliente = new JButton();
        this.btCadastroCliente.setText("Cadastrar Cliente");
        this.btCadastroCliente.setBounds(10, 10, 150, 50);
        this.add(this.btCadastroCliente);
        this.btConsultarCliente = new JButton();
        this.btConsultarCliente.setText("Consultar Cliente");
        this.btConsultarCliente.setBounds(170, 10, 150, 50);
        this.add(this.btConsultarCliente);
        this.btCadastropet = new JButton();
        this.btCadastropet.setText("Cadastrar Pet");
        this.btCadastropet.setBounds(330, 10, 150, 50);
        this.add(this.btCadastropet);
        this.listaCliente = new ArrayList();
        this.listaPet = new ArrayList();
        final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        this.btCadastroCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    Date date = new Date();
                    Cliente cliente = new Cliente();
                    cliente.setNome(JOptionPane.showInputDialog("Nome do Cliente: "));
                    cliente.setCPF(Integer.parseInt(JOptionPane.showInputDialog("CPF do Cliente: ")));
                    cliente.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Telefone do Cliente: ")));
                    cliente.setDataCadastro(date);
                    Principal.this.listaCliente.add(cliente);
                    JOptionPane.showMessageDialog((Component) null, "Cadastro do Clinte realizado com sucesso!", "Sucesso !", 1);

                } catch (Exception var4) {
                    JOptionPane.showMessageDialog((Component) null, "Erro ao cadastrar o Cliente!", "Erro !", 0);
                }

            }
        });

        this.btConsultarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Object[] optionsBanco = new Object[listaCliente.size()];
                    for (int i = 0; i < listaCliente.size(); i++) {
                        optionsBanco[i] = listaCliente.get(i).getNome();
                    }
                    String nome = JOptionPane.showInputDialog(null, "",
                            "Selecione o Cliente", JOptionPane.QUESTION_MESSAGE, null, optionsBanco, optionsBanco[0]).toString();
                    for (int i = 0; i < listaCliente.size(); i++) {
                        if (listaCliente.get(i).getNome().equals(nome)) {
                            JOptionPane.showMessageDialog(null, "Nome: " + listaCliente.get(i).getNome() + "\n" +
                                    "CPF: " + listaCliente.get(i).getCPF() + "\n" +
                                    "Telefone: " + listaCliente.get(i).getTelefone() + "\n" +
                                    "Data de Cadastro: " + formato.format(listaCliente.get(i).getDataCadastro()));
                        }
                    }
                } catch (Exception var4) {
                    JOptionPane.showMessageDialog((Component) null, "Erro ao consultar o Cliente!", "Erro !", 0);
                }

            }
        });

        this.btCadastropet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String qual = null;
                Date date = new Date();
                Pet pet = new Pet();
                qual = JOptionPane.showInputDialog("Qual tipo de animal ? (Gato, Cachorro ou Passaro)");

                if (qual.equalsIgnoreCase("Gato")) {
                    pet.setCodigo(Principal.this.listaPet.size() + 1);
                    pet.setNome(String.format(JOptionPane.showInputDialog("Qual o nome do Gato?")));

                }
                else if (qual.equalsIgnoreCase("Cachorro")) {
                    pet.setCodigo(Principal.this.listaPet.size() + 1);

                }
                else if (qual.equalsIgnoreCase("Passaro")) {
                    pet.setCodigo(Principal.this.listaPet.size() + 1);

                }
                else {
                    JOptionPane.showMessageDialog((Component) null, "Opção Inválida!", "Erro !", 0);
                }

            }
        });


    }



}