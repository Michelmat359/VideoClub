/*
 * Métodos
 */
package VideoClub;

import com.db4o.*;
import com.db4o.query.*;
import objeto.*;

/**
 * @author Miguel Ángel.
 */
public class Metodos {
    //añade una pelicula
    public static String anyadePelicula (ObjectContainer miConexion, Pelicula miPelicula){
        String mensaje="";
        try{
            //se almacena miPelicula
            miConexion.store(miPelicula);
            
            ObjectSet resultado = miConexion.queryByExample(miPelicula);
            if(resultado.size()>0){
                mensaje = "Se han insertado " + resultado.size() + " película";
            }else{
                mensaje = "No se ha introducido ninguna ID de película";
            }
                      
        }catch(Exception e){
            mensaje = "No se ha introducido un ID válido";
        }
        return mensaje;
    }   
    //método que busca una película y la muestra
    public static String consultaPelicula (ObjectContainer miConexion, Pelicula miPelicula){
        String mensaje="";
        try{
            //Se crea una instancia para la consulta que recoja los datos
            Predicate<Pelicula> consulta = new Predicate<Pelicula>(){
                boolean resultado = false;
                @Override
                public boolean match(Pelicula busqueda){
                    if(miPelicula.getIdPelicula()!=-1){
                         resultado = (busqueda.getIdPelicula()==(miPelicula.getIdPelicula()));
                    }else if(!"".equals(miPelicula.getTitulo())){
                        resultado = (busqueda.getTitulo().equalsIgnoreCase(miPelicula.getTitulo()));
                    }else if(!"".equals(miPelicula.getTema())){
                        resultado = (busqueda.getTema().equalsIgnoreCase(miPelicula.getTema()));
                    }
                    return resultado;
                }
            };    
        
            //Se ejecuta la consulta y los que cumplen true se vuelca en el ObjectSet
            ObjectSet resultado = miConexion.query(consulta);
                        
            //Muestra los datos
            if(resultado.size()>0){
                //se recorre el ObjectSet para mostrar el resultado
                while(resultado.hasNext()){
                    mensaje += resultado.next()+"\n";
                }
            }else{
                mensaje = "No hay ninguna película con esa ID";
            }

        }catch(Exception e){
            mensaje = "No se ha introducido un ID válido";
        }
        return mensaje;
    }
    
    //método que busca una película y la muestra
    public static String consultaPelicula (ObjectContainer miConexion, String idPeliculaTexto){
        String mensaje="";
        try{
            int idPelicula = Integer.parseInt(idPeliculaTexto);
            //Se crea una instancia para la consulta que recoja los datos
            Pelicula consultaPelicula = new Pelicula (idPelicula, null, null, 0, 0);
            //Se ejecuta la consulta y volcamos los objetos en el conjunto objetos(ObjectSet)
            ObjectSet resultado = miConexion.queryByExample(consultaPelicula);
            if(resultado.size()>0){
                while(resultado.hasNext()){
                    mensaje += resultado.next()+"\n";
                }
            }else{
                mensaje = "No hay ninguna película con esa ID";
            }

        }catch(Exception e){
            mensaje = "No se ha introducido un ID válido";
        }
        return mensaje;
    }
    
    //método que lista todas las películas
    public static String listaPeliculas (ObjectContainer miConexion){
        String mensaje="";
        try{
            //Se crea una instancia para la consulta que recoja los datos
            Pelicula consultaPelicula = new Pelicula (0, null, null, 0, 0);
            //Se ejecuta la consulta y volcamos los objetos en el conjunto objetos(ObjectSet)
            ObjectSet resultado = miConexion.queryByExample(consultaPelicula);
            //Devolvemos con size() el número de objetos recuperados
            System.out.println("Total películas: "+resultado.size());

            //mostrar el contenido en un bucle mientras haya siguiente
            while(resultado.hasNext()){
                //recuperamos el objeto con next() y lo mostramos
                mensaje+= resultado.next()+"\n";
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    
    //Metodo para eliminar registro
    public static String borrarPelicula (ObjectContainer miConexion, String idPeliculaTexto){
        String mensaje="";
        try{
            int idPelicula = Integer.parseInt(idPeliculaTexto);
            //Se crea una instancia para la consulta que recoja los datos
            Pelicula consultaPelicula = new Pelicula (idPelicula, null, null, 0, 0);
            //Se ejecuta la consulta y volcamos los objetos en el conjunto objetos(ObjectSet)
            ObjectSet resultado = miConexion.queryByExample(consultaPelicula);
            if(resultado.size()>0){
                Pelicula miPeliculaBorrar = (Pelicula)resultado.next();
                miConexion.delete(miPeliculaBorrar);
                mensaje="Pelicula eliminada"; 
            }else{   
                mensaje="La película no existe"; 
            }           
            
        }catch(Exception e){
            mensaje = "No se ha introducido un ID válido";
        }
        return mensaje;
    }
    
    //Método para modificar registro
    public static void actualizarPelicula (ObjectContainer miConexion, Pelicula laPelicula){
        try{
            //se recogen los datos de la búsqueda en un objectSet
            Pelicula aPeli = new Pelicula(laPelicula.getIdPelicula(), null, null, 0, 0);
            ObjectSet resultado = miConexion.queryByExample(aPeli);
            
            Pelicula miPelicula = (Pelicula)resultado.next();
            String titulo = laPelicula.getTitulo();
            if(titulo.isEmpty()==false){
                miPelicula.setTitulo(titulo);
            }
            
            String tema = laPelicula.getTema();
            if(tema.isEmpty()==false){
                miPelicula.setTema(tema);
            }

            int duracion = laPelicula.getDuracion();
            if(duracion != -1){
                miPelicula.setDuracion(duracion);
            }
            
            double precio = laPelicula.getPrecio();
            if(precio != -1){
                miPelicula.setPrecio(precio);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
    
    //cerrar conexión
    public static void cerrarConexion(ObjectContainer miConexion){
        try{
            miConexion.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }  
}
