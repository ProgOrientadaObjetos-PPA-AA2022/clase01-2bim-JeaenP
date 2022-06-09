/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.*;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Edificio edf1 = new Edificio("Edificio Central");
        Edificio edf2 = new Edificio("Edificio Norte");
        Edificio edf3 = new Edificio("Edificio Sur");
        Edificio edf4 = new Edificio("Edificio secundario");
        edf1.establecerCostos(20000);
        edf2.establecerCostos(30000);
        edf3.establecerCostos(10000);
        edf4.establecerCostos(5000);
        Vehiculo veh1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo veh2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo veh3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo veh4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo veh5 = new Vehiculo("Camioneta", "LDC0011", 25000);
        
        
        //double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio [] listaEdificios = {edf1, edf2, edf3, edf4};
        Vehiculo [] listaVehiculos = {veh1, veh2, veh3, veh4, veh5};
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        Empresa e = new Empresa();
        e.establecerNombre("Empresa de hojas");
        e.establecerEdificios(listaEdificios);
        e.establecerVehiculos(listaVehiculos);
        e.establecerCostoBienesInmuebles();
        e.establecerCostoVehiculos();
        e.establecerCostoTotalBienes();
        // Imprimir el costo de los bienes inmuebles de la empresa
        System.out.printf("%s", e);
    }
}
