package br.edu.iftm.javaempresax.testes;

import br.edu.iftm.javaempresax.classes.Empregado;

import java.util.Date;

import br.edu.iftm.javaempresax.classes.Departamento;
import br.edu.iftm.javaempresax.classes.Projeto;

public class Principal {
    
    public static void main(String[] args) {
     
        Empregado empregado01 = new Empregado();
        empregado01.setCodigo(1);
        empregado01.setNome("Mariana");
        empregado01.setSexo('F');
         
        Date dataInicio = new Date();

        Departamento d = new Departamento(1,"Pesquisa",1,dataInicio);
        
        empregado01.setDepartamento(d);

        Projeto p = new Projeto(1, "Transmogrifador",d);

        System.out.println(empregado01);
        System.out.println(p);
        
    }
}
