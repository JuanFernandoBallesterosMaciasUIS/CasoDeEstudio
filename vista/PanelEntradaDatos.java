package vista;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbTituloLibro;
    private JLabel lbAutor;
    private JLabel lbAutor2;
    private JLabel lbAñoEdicion;
    private JRadioButton lbDeLujo;

    private TextField tfTituloLibro;
    private TextField tfAutor;
    private TextField tfAutor2;
    private TextField tfAñoEdicion;
    private TextField tfDeLujo;



    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta titulo de la biblioteca
        lbTitulo = new JLabel("Biblioteca del señor Pérez    ", JLabel.RIGHT);
        lbTitulo.setBounds(140,30,120,20);
        this.add(lbTitulo);

        //Crear y agregar etiqueta titulo libro
        lbTituloLibro = new JLabel("Titulo del libro ", JLabel.RIGHT);
        lbTituloLibro.setBounds(30,70,120,20);
        this.add(lbTituloLibro);

        //Crear y agregar textfield titulo libro
        tfTituloLibro = new TextField();
        tfTituloLibro.setBounds(160,70,120,20);
        this.add(tfTituloLibro);

        //Crear y agregar etiqueta autor
        lbAutor = new JLabel("Autor ", JLabel.RIGHT);
        lbAutor.setBounds(30,100,120,20);
        this.add(lbAutor);

        //Crear y agregar textfield autor
        tfAutor = new TextField();
        tfAutor.setBounds(160,100,120,20);
        this.add(tfAutor);

        //Crear y agregar etiqueta autor2
        lbAutor2 = new JLabel("Segundo autor ", JLabel.RIGHT);
        lbAutor2.setBounds(30,130,120,20);
        this.add(lbAutor2);

        //Crear y agregar textfield autor2
        tfAutor2 = new TextField();
        tfAutor2.setBounds(160,130,120,20);
        this.add(tfAutor2);

        //Crear y agregar etiqueta año edicion
        lbAñoEdicion = new JLabel("Año de edición ", JLabel.RIGHT);
        lbAñoEdicion.setBounds(30,160,120,20);
        this.add(lbAñoEdicion);

        //Crear y agregar textfield año edicion
        tfAñoEdicion = new TextField();
        tfAñoEdicion.setBounds(160,160,120,20);
        this.add(tfAñoEdicion);

        //Crear y agregar etiqueta de lujo







        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso

    
}
