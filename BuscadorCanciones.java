import javax.swing.*;
import java.awt.event.*;
public class BuscadorCanciones extends JFrame implements ActionListener{
    private JTextField text;
    private JButton boton1, boton2, boton3, boton4, boton5;
    private JLabel label1;

    public BuscadorCanciones(){
        setLayout(null);
        label1 = new JLabel("Buscador de Canciones");
        label1.setBounds(125,5,150,30);
        add(label1);

        text = new JTextField();
        text.setBounds(120, 30, 150, 20);
        add(text);

        boton1 = new JButton("Buscar Cancion");
        boton1.setBounds(120,80,150,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Reproducir Cancion");
        boton2.setBounds(120,110,150,30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Activar Letra");
        boton3.setBounds(120,140,150,30);
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("Detener Cancion");
        boton4.setBounds(120,170,150,30);
        add(boton4);
        boton4.addActionListener(this);

        boton5 = new JButton("Salir");
        boton5.setBounds(120,200,150,30);
        add(boton5);
        boton5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton5){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        BuscadorCanciones prueba = new BuscadorCanciones();
        prueba.setBounds(0,0,400,300);
        prueba.setVisible(true);
        prueba.setResizable(false);
        prueba.setLocationRelativeTo(null);
    }
}