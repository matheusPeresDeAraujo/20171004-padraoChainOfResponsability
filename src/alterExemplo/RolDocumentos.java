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
public class RolDocumentos {
    private static RolDocumentos rolDocumentos = new RolDocumentos();
    private TipoDocumentoHistorico tipoDocumentoHistorico;
    private TipoDocumentoMatricula tipoDocumentoMatricula;
    private TipoDocumentoCertificado tipoDocumentoCertificado;
    private TipoDocumentoDiploma tipoDocumentoDiploma;
    private TipoDocumentoBoleto tipoDocumentoBoleto;
    
    private RolDocumentos(){
        tipoDocumentoHistorico = new TipoDocumentoHistorico();
        tipoDocumentoMatricula = new TipoDocumentoMatricula();
        tipoDocumentoCertificado = new TipoDocumentoCertificado();
        tipoDocumentoDiploma = new TipoDocumentoDiploma();
        tipoDocumentoBoleto = new TipoDocumentoBoleto();
    };
    
    public static RolDocumentos getInstance(){
        return rolDocumentos;
    }

    public TipoDocumentoHistorico getTipoDocumentoHistorico() {
        return tipoDocumentoHistorico;
    }

    public TipoDocumentoMatricula getTipoDocumentoMatricula() {
        return tipoDocumentoMatricula;
    }

    public TipoDocumentoCertificado getTipoDocumentoCertificado() {
        return tipoDocumentoCertificado;
    }

    public TipoDocumentoBoleto getTipoDocumentoBoleto() {
        return tipoDocumentoBoleto;
    }

    public TipoDocumentoDiploma getTipoDocumentoDiploma() {
        return tipoDocumentoDiploma;
    }
    
    
}
