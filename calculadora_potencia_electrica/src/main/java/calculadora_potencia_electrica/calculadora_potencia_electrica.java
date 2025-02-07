/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package calculadora_potencia_electrica;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author reexxy
 */
@WebService(serviceName = "calculadora_potencia_electrica") // <- ESTE ES EL NOMBRE DEL SERIVICIO QUE SE MANDARA A LLAMAR EN EL CLIENTE
public class calculadora_potencia_electrica {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "potencia_electrica") // <- ESTE ES EL NOMBRE DEL METODO QUE SE MANDARA A EJECUTAR CUANDO SE PRESIONA EL BOTON
    public Double potencia_electrica(@WebParam(name = "voltaje") double voltaje, @WebParam(name = "intensidad") double intensidad) {
        return voltaje*intensidad;
    }
} 
