
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edu
 */
public class Email {
    public void sendEmail() throws EmailException {
    
       SimpleEmail email = new SimpleEmail();
   //Utilize o hostname do seu provedor de email
   System.out.println("alterando hostname...");
   email.setHostName("smtp.gmail.com");
   //Quando a porta utilizada não é a padrão (gmail = 465)
   email.setSmtpPort(465);
   //Adicione os destinatários
   email.addTo("testesalineedu@gmail.com", "Aline");
   //Configure o seu email do qual enviará
   email.setFrom("testeslineedu@gamilcom", "Aline");
   //Adicione um assunto
   email.setSubject("Test message teste de email para projeto");
   //Adicione a mensagem do email
   email.setMsg("This is a simple test of commons-email");
   //Para autenticar no servidor é necessário chamar os dois métodos abaixo
   System.out.println("autenticando...");
   email.setSSL(true);
   email.setAuthentication("testesalineedu@gmail.com", "82748542");
   System.out.println("enviando...");
   email.send();
   System.out.println("Email enviado!");
}
}

