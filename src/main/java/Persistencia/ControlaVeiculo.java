/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Negocio.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author iuryi
 */
public class ControlaVeiculo {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    public boolean salvar (Veiculo v){
        if(v != null){
            veiculos.add(v);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Veiculo> retornaTodos(){
        return veiculos;
    }
}
