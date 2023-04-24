/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Controlador;
import java.util.List;
import Seguridad.Modelo.daoCliente;
/**
 *
 * @author visitante
 */


public class clsCliente {
    private int IdCliente;
    private String NombreCliente;
    private String EstatusCliente;

    public clsCliente() {
    }

    public clsCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public clsCliente(String NombreCliente, String EstatusCliente) {
        this.NombreCliente = NombreCliente;
        this.EstatusCliente = EstatusCliente;
    }

    public clsCliente(int IdCliente, String NombreCliente, String EstatusCliente) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.EstatusCliente = EstatusCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getEstatusCliente() {
        return EstatusCliente;
    }

    public void setEstatusCliente(String EstatusCliente) {
        this.EstatusCliente = EstatusCliente;
    }

    
    @Override
    public String toString() {
        return "clsCliente{" + "IdCliente=" + IdCliente + ", NombreCliente=" + NombreCliente + ", EstatusCliente=" + EstatusCliente + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsCliente getBuscarInformacionClientePorNombre(clsCliente cliente)
    {
        daoCliente daocliente = new daoCliente();
        return daocliente.consultaClientePorNombre(cliente);
    }
    public clsCliente getBuscarInformacionClientePorId(clsCliente cliente)
    {
        daoCliente daocliente = new daoCliente();
        return daocliente.consultaClientePorId(cliente);
    }    
    public List<clsCliente> getListadoClientes()
    {
        daoCliente daocliente = new daoCliente();
        List<clsCliente> listadoClientes = daocliente.consultaCliente();
        return listadoClientes;
    }
    public int setBorrarCliente(clsCliente cliente)
    {
        daoCliente daocliente = new daoCliente();
        return daocliente.borrarCliente(cliente);
    }          
    public int setIngresarCliente(clsCliente cliente)
    {
        daoCliente daocliente = new daoCliente();
        return daocliente.ingresaCliente(cliente);
    }              
    public int setModificarCliente(clsCliente cliente)
    {
        daoCliente daocliente = new daoCliente();
        return daocliente.actualizaCliente(cliente);
    }              
}
