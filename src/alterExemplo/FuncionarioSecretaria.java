/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alterExemplo;

import padraochainofresponsability.*;

/**
 *
 * @author matheus
 */
public class FuncionarioSecretaria extends Funcionario{
    
    public FuncionarioSecretaria(Funcionario superior){
        listaDocumentos.add(RolDocumentos.getInstance().getTipoDocumentoHistorico());
        setFuncionarioSuperior(superior);
    }
    
    @Override
    public String getDescricaoCargo() {
        return "Secretaria";
    }
    
}
