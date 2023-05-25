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
        lbTitulo.setBounds(120,30,120,20);
        this.add(lbTitulo);

        //Crear y agregar etiqueta titulo libro
        lbTituloLibro = new JLabel("Titulo del libro ", JLabel.RIGHT);
        lbTituloLibro.setBounds(30,70,120,20);
        this.add(lbTituloLibro);



        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso

    public String getTxtNumeroCelular()
    {
        return tfNumeroCelular.getText();
    }

    public String getTxtOperador()
    {
        return (String) cbOperador.getSelectedItem();
    }

    public String getTxtCantidadMinutos()
    {
        return tfCantidadMinutos.getText();
    }

    public String getTxtValorMinuto()
    {
        return tfValorMinuto.getText();
    }

    public String getTxtCostoPlan()
    {
        return tfCostoPlan.getText();
    }

    public void setTxtCostoPlan(String costo)
    {
        tfCostoPlan.setText(costo);
    }

    public void setTxtNumeroCelular(String numero)
    {
        tfNumeroCelular.setText(numero);
    }

    public void setTxtCantidadMinutos(String minutos)
    {
        tfCantidadMinutos.setText(minutos);
    }

    public void setTxtValorMinuto(String valor)
    {
        tfValorMinuto.setText(valor);
    }

    public void limpiar()
    {
        tfNumeroCelular.setText("");
        tfCantidadMinutos.setText("");
        tfValorMinuto.setText("");
        tfCostoPlan.setText("");
    }
}
