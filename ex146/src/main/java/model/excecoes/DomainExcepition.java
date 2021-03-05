/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.excecoes;

/**
 *
 * @author davi 
 * nicollas
 */
/*Ao usuar o runtime nao e necessario colocar throw exception*/
public class DomainExcepition  extends RuntimeException{
     public DomainExcepition (String msg){
        super(msg);
    }
}
