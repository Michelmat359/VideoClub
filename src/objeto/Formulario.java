/*
 * Clase formulario
 */
package objeto;

import VideoClub.Metodos;
import com.db4o.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Miguel Ángel Mateo.
 */
public class Formulario extends JFrame implements ActionListener {
    //se crea la conexion a null cuando se inicia la app
    ObjectContainer miConexion = null; 
    //se crean las variables que van a recoger los valores de cada campo
    int idPelicula;
    String titulo;
    String tema;
    int duracion;
    double precio;
    
    //se crea el JPanel
    JPanel miPanel;
    //se crean los elementos del panel: etiquetass y las áreas de texto para
    //introducir datos
    JLabel encabezadoL;
    JLabel encabezado2L;
    JLabel idPeliculaL;
    JTextField idPeliculaTF;
    
    JLabel tituloL;
    JTextField tituloTF;

    JLabel temaL;
    JTextField temaTF;
 
    JLabel duracionL;
    JTextField duracionTF;

    JLabel precioL;
    JTextField precioTF;
    
    //el área donde se mostrarán los resultados
    JTextArea listaPeliculasTA;
    //el scroll para moverse en el textArea
    JScrollPane scroll;
    
    //los botones del panel
    JButton altaPeliculaB;
    JButton bajaPeliculaB;
    JButton actualizaPeliculaB;
    JButton consultaPeliculaB;
    JButton listarPeliculasB;
    JButton salirB;
    
    //constructor para crear una instancia
    public Formulario(){       
        try{
            miConexion = Db4oEmbedded.openFile("empleados.db4o");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //asigna el nombre de la app
        this.setTitle("Gestión de películas");
        //asigna el tamaño de la ventana
        this.setSize(1000, 670);
        //no se permite que se ajuste al tamaño
        this.setResizable(false);
        //saldrá en el centro
        this.setLocationRelativeTo(null);
        //crea el botón de cierra
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //se crea una instancia de jPanel() y su posición 
        miPanel = new JPanel();
        miPanel.setLayout(null);
        
        //titulo
        encabezadoL = new JLabel("INTRODUCE LOS DATOS");
        encabezadoL.setBounds(40, 30, 150, 40);
        miPanel.add(encabezadoL);
        
        //se definen los campos
        idPeliculaL = new JLabel("ID pelicula");
        idPeliculaL.setBounds(40, 30, 150, 150);
        miPanel.add(idPeliculaL);
        
        idPeliculaTF = new JTextField("");
        idPeliculaTF.setBounds(160, 85, 200, 40);
        miPanel.add(idPeliculaTF);       

        tituloL = new JLabel("Título");
        tituloL.setBounds(40, 165, 150, 40);
        miPanel.add(tituloL);
        
        tituloTF = new JTextField("");
        tituloTF.setBounds(160, 165, 200, 40);
        miPanel.add(tituloTF);
        
        temaL = new JLabel("Tema");
        temaL.setBounds(40, 245, 150, 40);
        miPanel.add(temaL);
        
        temaTF = new JTextField("");
        temaTF.setBounds(160, 245, 200, 40);
        miPanel.add(temaTF);
        
        duracionL = new JLabel("Duración");
        duracionL.setBounds(40, 325, 150, 40);
        miPanel.add(duracionL);
        
        duracionTF = new JTextField("");
        duracionTF.setBounds(160, 325, 200, 40);
        miPanel.add(duracionTF);
        
        precioL = new JLabel("Precio");
        precioL.setBounds(40, 405, 150, 40);
        miPanel.add(precioL);
        
        precioTF = new JTextField("");
        precioTF.setBounds(160, 405, 200, 40);
        miPanel.add(precioTF);
        
        //titulo
        encabezado2L = new JLabel("PANEL DE SALIDA");
        encabezado2L.setBounds(400, 30, 150, 40);
        miPanel.add(encabezado2L);
        
        /*Inicializamos el campo de textArea e introducimos las coordenadas*/
        listaPeliculasTA = new JTextArea(""); 
        
        scroll = new JScrollPane(listaPeliculasTA);
        scroll.setBounds(400, 85, 550, 360);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        miPanel.add(scroll);
        
        //botón añadir
        altaPeliculaB = new JButton("Dar de alta");
        altaPeliculaB.setBounds(35, 490, 130, 40);
        miPanel.add(altaPeliculaB);
        
        //boton eliminar
        bajaPeliculaB = new JButton("Dar de baja");
        bajaPeliculaB.setBounds(190, 490, 130, 40);
        miPanel.add(bajaPeliculaB);
        
        //boton modificar datos
        actualizaPeliculaB=new JButton("Modificar");
        actualizaPeliculaB.setBounds(345, 490, 130, 40);
        miPanel.add(actualizaPeliculaB);
        
        //boton buscar
        consultaPeliculaB = new JButton("Consultar");
        consultaPeliculaB.setBounds(35, 555, 130, 40);
        miPanel.add(consultaPeliculaB);
        
        //botón listar
        listarPeliculasB=new JButton("Listar películas");
        listarPeliculasB.setBounds(345, 555, 130, 40);
        miPanel.add(listarPeliculasB);
        
        //boton salir
        salirB = new JButton("Salir");
        salirB.setBounds(815, 555, 130, 40);
        miPanel.add(salirB);
        
        //poner botones a la escucha
        salirB.addActionListener(this);
        altaPeliculaB.addActionListener(this);
        bajaPeliculaB.addActionListener(this);
        actualizaPeliculaB.addActionListener(this);
        consultaPeliculaB.addActionListener(this);
        listarPeliculasB.addActionListener(this);
        
        this.add(miPanel);
    }
    
    //sobreescribimos el método actionPerformed
    @Override
    public void actionPerformed(ActionEvent e){
        //configuración del botón para salir
        if(e.getSource()==salirB){
            Metodos.cerrarConexion(miConexion);
            System.exit(0);        
        }
        
        //configuración para el botón de añadir
        if(e.getSource()==altaPeliculaB){
            String lista;
            //se llama al método para recoger los valores y crear una instancia
            Pelicula miPelicula=creaInstancia(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
            //se llama al método y se recoge el resultado en un string
            lista=Metodos.anyadePelicula(miConexion, miPelicula);
            
            //se muestra el resultado en el textArea
            listaPeliculasTA.setText(lista);
            
            //se ponen los campos de texto en blanco cuando se saca el resultado
            setBlanco(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
        }
        
        //configuración para el botón de eliminar una película
        if(e.getSource()==bajaPeliculaB){
            //se recoge el contenido de la caja de texto
            String idPeliculaTexto=idPeliculaTF.getText();
            String lista = Metodos.consultaPelicula(miConexion, idPeliculaTexto);
            //se muestra el mensaje devuelto por el método en el textArea
            listaPeliculasTA.setText(lista);
            
            //se llama al método borrarPelicula
            lista += "\n"+Metodos.borrarPelicula(miConexion, idPeliculaTexto);
            
            //se muestra el mensaje devuelto por el método en el textArea
            listaPeliculasTA.setText(lista);
            
            //se ponen los campos de texto en blanco cuando se saca el resultado
            setBlanco(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
        }
        //configuración del botón modificar
        if(e.getSource()==actualizaPeliculaB){
            Pelicula miPelicula=creaInstancia(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
            String lista;
            //Se llama al método de actualizar datos
            Metodos.actualizarPelicula(miConexion, miPelicula);
            //se recogen los campos, incluso los vacíos, en una instancia
            lista=Metodos.consultaPelicula(miConexion, miPelicula);
            listaPeliculasTA.setText(lista);
            
            //se ponen los campos de texto en blanco cuando se saca el resultado
            setBlanco(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
        }
        //configuración del botón de buscar
        if(e.getSource()==consultaPeliculaB){
            //variable que recogerá los resultados devueltos por el método
            String lista;
            //se llama al método que recoge los datos y crea la instancia
            Pelicula miPelicula=creaInstancia(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
            
            lista =Metodos.consultaPelicula(miConexion, miPelicula);
            listaPeliculasTA.setText(lista);
            
            //se ponen los campos de texto en blanco cuando se saca el resultado
            setBlanco(idPeliculaTF, tituloTF, temaTF, duracionTF, precioTF);
        }
        //configuracion del botón listar
        if(e.getSource()==listarPeliculasB){
            String lista=Metodos.listaPeliculas(miConexion);
            listaPeliculasTA.setText(lista);
        }              

    }
    
    public static void setBlanco(JTextField idPeliculaTF, JTextField tituloTF, 
            JTextField temaTF, JTextField duracionTF, JTextField precioTF){
        idPeliculaTF.setText("");
        tituloTF.setText("");
        temaTF.setText("");
        duracionTF.setText("");
        precioTF.setText("");
    }
    
    public static Pelicula creaInstancia(JTextField idPeliculaTF, JTextField tituloTF, 
            JTextField temaTF, JTextField duracionTF, JTextField precioTF){
        //se crean las variables para darle valores 
        String idPeliculaTexto = idPeliculaTF.getText();
        String titulo=tituloTF.getText();
        String tema=temaTF.getText();
        String duracionTexto=duracionTF.getText();
        String precioTexto = precioTF.getText();

        int idPelicula;
        int duracion;
        double precio;
        //se convierten las áreas que deben ser numéricas en int o double
        if(idPeliculaTexto.isEmpty()){
            idPelicula=-1;
        }else{
            idPelicula=Integer.parseInt(idPeliculaTexto);
        }
        
        if(duracionTexto.isEmpty()){
            duracion=-1;
        }else{
            duracion=Integer.parseInt(duracionTexto);
        }
        
        if(precioTexto.isEmpty()){
            precio=-1;
        }else{
            precio=Double.parseDouble(precioTexto);
        }
                
        //Se recogen todos los datos y se crea una instancia de Pelicula
        Pelicula miPelicula=new Pelicula(idPelicula, titulo,
                        tema,duracion,precio);
        
        return miPelicula;
    }
}
