package iam46258177;

import java.util.ArrayList;
import java.util.List;

public class LlistaDepartamentos {

    private List<Departamentos> departamentos = new ArrayList<Departamentos>();

    public LlistaDepartamentos() {
    }

    public List<Departamentos> getDepartamentos() {
        return departamentos;
    }

    public void add(Departamentos dep){
        departamentos.add(dep);
    }

    public void setDepartamentos(List<Departamentos> departamentos) {
        this.departamentos = departamentos;
    }
}
