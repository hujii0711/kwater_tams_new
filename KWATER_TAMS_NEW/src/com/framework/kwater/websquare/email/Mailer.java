package com.framework.kwater.websquare.email;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class Mailer {
	
	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private JavaMailSender sender;

	@Autowired
	private VelocityEngine velocityEngine;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public void sendMail(Mail mail, String password) {
		
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(mail.getMailFrom());
		message.setTo(mail.getMailTo());
		message.setSubject(mail.getMailSubject());

		Template template = velocityEngine.getTemplate("./src/main/webapp/resources/templates/" + mail.getTemplateName());

		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("TEMP_PWD", password);

		StringWriter stringWriter = new StringWriter();
		template.merge(velocityContext, stringWriter);

		message.setText(stringWriter.toString());
		mailSender.send(message);
	}
}
