package iam46258177;

import com.thoughtworks.xstream.XStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeerDepartamentos {
	public static void main(String[] args) throws IOException {

		XStream xstream = new XStream();

		xstream.alias("ListaDepartamentos", LlistaDepartamentos.class);
		xstream.alias("DatosDepartamentos", Departamentos.class);
		xstream.aliasField("Dep", Departamentos.class, "departamento");
		xstream.aliasField("Nom", Departamentos.class, "nombre");
		xstream.aliasField("Local", Departamentos.class, "localidad");
		xstream.addImplicitCollection(LlistaDepartamentos.class, "departamentos");

		LlistaDepartamentos listadoTodas = (LlistaDepartamentos) xstream.fromXML(new FileInputStream("departamentos.xml"));

		List<Departamentos> listaDepartamentos = new ArrayList<Departamentos>();
		listaDepartamentos = listadoTodas.getDepartamentos();

		Iterator iterador = listaDepartamentos.listIterator();
		while( iterador.hasNext() ) {
			Departamentos p = (Departamentos) iterador.next();
			System.out.println("Departamentos: " + p.getDepartamento() +
					", Nombre: " + p.getNombre() +
					", Localidad: " + p.getLocalidad());
		}
	}
}