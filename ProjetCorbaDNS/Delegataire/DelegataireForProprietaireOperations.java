package ProjetCorbaDNS.Delegataire;


/**
* ProjetCorbaDNS/Delegataire/DelegataireForProprietaireOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/


//
public interface DelegataireForProprietaireOperations 
{

  // méthode pour obtenir la liste des registrar pour un nom de domaine donné pour une location
  ProjetCorbaDNS.RegistrarClass[] DomainNameRentingRequest (String DomainName);
} // interface DelegataireForProprietaireOperations
