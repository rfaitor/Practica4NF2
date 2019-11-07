package iam46258177;

import com.thoughtworks.xstream.XStream;

import java.io.*;

public class EscribirDepartamentos {

    public static void main(String[] args)  throws IOException,   ClassNotFoundException {

        File fichero = new File("FichDepartamentos.dat");
        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIS = new ObjectInputStream(filein);

        LlistaDepartamentos listadep = new LlistaDepartamentos();

        try {
            while (true) {
                Departamentos departamentos= (Departamentos) dataIS.readObject();
                listadep.add(departamentos);
            }
        }catch (EOFException eo) {}
        dataIS.close();
        try {
            XStream xstream = new XStream();

            xstream.alias("ListaDepartamentos", LlistaDepartamentos.class);
            xstream.alias("DatosDepartamentos", Departamentos.class);
            xstream.aliasField("Dep", Departamentos.class, "departamento");
            xstream.aliasField("Nom", Departamentos.class, "nombre");
            xstream.aliasField("Local", Departamentos.class, "localidad");
            xstream.addImplicitCollection(LlistaDepartamentos.class, "departamentos");

            xstream.toXML(listadep, new FileOutputStream("Departamentos.xml"));
        }catch (Exception e)
        {e.printStackTrace();}
    }
}
