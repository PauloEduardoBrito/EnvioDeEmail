
import org.apache.commons.mail.EmailException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edu
 */
public class TesteAplicacao {
    public static void main (String[] args) throws EmailException{
        Email mail = new Email();
        
        mail.sendEmail();
    }
    
}
