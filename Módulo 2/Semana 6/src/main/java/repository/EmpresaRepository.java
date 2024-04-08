package repository;

import java.util.ArrayList;
import java.util.List;

import model.Empresa;

public class EmpresaRepository {
	private static List<Empresa> empresas = new ArrayList<>();

	public static List<Empresa> getEmpresas() {
		return empresas;
	}

	public static void addEmpresa(Empresa empresa) {
		empresas.add(empresa);
	}

}
