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
    private JButton btConsultarPet;
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
        this.btConsultarPet = new JButton();
        this.btConsultarPet.setText("Consultar Pet");
        this.btConsultarPet.setBounds(10, 80, 150, 50);
        this.add(this.btConsultarPet);

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
                    pet.setEspecie(qual);

                if (qual.equalsIgnoreCase("Gato")) {
                    pet.setNome(String.format(JOptionPane.showInputDialog("Qual o nome do gato?")));
                    pet.setDomesticado(String.format(JOptionPane.showInputDialog("O gato é domesticado? (Sim/Não)")));
                }

                else if (qual.equalsIgnoreCase("Cachorro")) {
                    pet.setNome(String.format(JOptionPane.showInputDialog("Qual o nome do cachorro?")));
                    pet.setPelo(String.format(JOptionPane.showInputDialog("Qual é o tipo de pelagem? (Em pelo, raso" +
                            ",curto ou semi longo)")));
                }

                else if (qual.equalsIgnoreCase("Passaro")) {
                    pet.setNome(String.format(JOptionPane.showInputDialog("Qual o nome do pássaro?")));
                    pet.setAsas(String.format(JOptionPane.showInputDialog("As asas estão cortadas? (Sim/Não)")));
                }

                else {
                    JOptionPane.showMessageDialog((Component) null, "Opção Inválida!", "Erro !", 0);
                }

                pet.setApelido(String.format(JOptionPane.showInputDialog("Qual o apelido?")));
                pet.setSexo(String.format(JOptionPane.showInputDialog("Sexo: (M/F)")));
                pet.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
                pet.setTiporacao(String.format(JOptionPane.showInputDialog("Tipo de ração:")));
                pet.setQtdracao(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de ração: (em gramas)")));
                pet.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Peso: Kilogramas")));
                pet.setStatus("Na loja");
                pet.setDataCadastro(date);
                pet.setCodigo(Principal.this.listaPet.size() + 1);
                Principal.this.listaPet.add(pet);
                JOptionPane.showMessageDialog((Component) null, "Cadastro do Pet realizado com sucesso!", "Sucesso !", 1);
            }
        });

        this.btConsultarPet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Object[] optionsBanco = new Object[listaPet.size()];
                    for (int i = 0; i < listaPet.size(); i++) {
                        optionsBanco[i] = listaPet.get(i).getNome();
                    }
                    String nome = JOptionPane.showInputDialog(null, "",
                            "Selecione o Pet", JOptionPane.QUESTION_MESSAGE, null, optionsBanco, optionsBanco[0]).toString();
                    for (int i = 0; i < listaPet.size(); i++) {
                        if ((listaPet.get(i).getNome().equals(nome)) && (listaPet.get(i).getEspecie().equalsIgnoreCase("Gato"))) {
                            JOptionPane.showMessageDialog(null, "Nome: " + listaPet.get(i).getNome() + "\n" +
                                    "Apelido: " + listaPet.get(i).getApelido() + "\n" +
                                    "Domesticado: " + listaPet.get(i).getDomesticado() + "\n" +
                                    "Espécie: " + listaPet.get(i).getEspecie() + "\n" +
                                    "Sexo: " + listaPet.get(i).getSexo() + "\n" +
                                    "Idade: " + listaPet.get(i).getIdade() + "\n" +
                                    "Peso: " + listaPet.get(i).getPeso() + "\n" +
                                    "Código: " + listaPet.get(i).getCodigo() + "\n" +
                                    "Tipo de ração: " + listaPet.get(i).getTiporacao() + "\n" +
                                    "Quantidade de ração (gramas): " + listaPet.get(i).getTiporacao() + "\n" +
                                    "Status: " + listaPet.get(i).getStatus() + "\n" +
                                    "Data de entrada: " + formato.format(listaPet.get(i).getDataCadastro()));
                        } else if ((listaPet.get(i).getNome().equals(nome)) && (listaPet.get(i).getEspecie().equalsIgnoreCase("Cachorro"))) {
                            JOptionPane.showMessageDialog(null, "Nome: " + listaPet.get(i).getNome() + "\n" +
                                    "Apelido: " + listaPet.get(i).getApelido() + "\n" +
                                    "Pelo: " + listaPet.get(i).getPelo() + "\n" +
                                    "Espécie: " + listaPet.get(i).getEspecie() + "\n" +
                                    "Sexo: " + listaPet.get(i).getSexo() + "\n" +
                                    "Idade: " + listaPet.get(i).getIdade() + "\n" +
                                    "Peso: " + listaPet.get(i).getPeso() + "\n" +
                                    "Código: " + listaPet.get(i).getCodigo() + "\n" +
                                    "Tipo de ração: " + listaPet.get(i).getTiporacao() + "\n" +
                                    "Quantidade de ração (gramas): " + listaPet.get(i).getTiporacao() + "\n" +
                                    "Status: " + listaPet.get(i).getStatus() + "\n" +
                                    "Data de entrada: " + formato.format(listaPet.get(i).getDataCadastro()));
                        }else if ((listaPet.get(i).getNome().equals(nome)) && (listaPet.get(i).getEspecie().equalsIgnoreCase("Passaro"))) {
                            JOptionPane.showMessageDialog(null, "Nome: " + listaPet.get(i).getNome() + "\n" +
                                    "Apelido: " + listaPet.get(i).getApelido() + "\n" +
                                    "Asas cortadas: " + listaPet.get(i).getAsas() + "\n" +
                                    "Espécie: " + listaPet.get(i).getEspecie() + "\n" +
                                    "Sexo: " + listaPet.get(i).getSexo() + "\n" +
                                    "Idade: " + listaPet.get(i).getIdade() + "\n" +
                                    "Peso: " + listaPet.get(i).getPeso() + "\n" +
                                    "Código: " + listaPet.get(i).getCodigo() + "\n" +
                                    "Tipo de ração: " + listaPet.get(i).getTiporacao() + "\n" +
                                    "Quantidade de ração (gramas): " + listaPet.get(i).getTiporacao() + "\n" +
                                    "Status: " + listaPet.get(i).getStatus() + "\n" +
                                    "Data de entrada: " + formato.format(listaPet.get(i).getDataCadastro()));
                        }
                    }
                } catch (Exception var4) {
                    JOptionPane.showMessageDialog((Component) null, "Erro ao consultar o Pet!", "Erro !", 0);
                }

            }
        });


    }



}
