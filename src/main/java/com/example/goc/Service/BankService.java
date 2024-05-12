package com.example.goc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.goc.Entity.Request;


@Service
public class BankService {


	@Autowired
	private EmailService _emailService;

	public BankService(EmailService emailService) {
		this._emailService=emailService;
	}

    public void processBankInfo(Request requestData) {

    	String subject = "Göç Randevu Banka Bilgileri";
        String messageText = "Sayın" + " " + requestData.getAdi()+ " "+ requestData.getSoyadi()+" " + "başvurunuz alınmıştır!,\n\n" +
    	"İlgili Banka Bilgilerini Aşağıda Bulabilirsiniz:" + " \n" + "Göç Randevu Dan.Ltd.Şti" + "\n " + requestData.getBankIban();
         System.out.print(messageText);
    	_emailService.sendSecondMail(requestData.getEmail(), subject, messageText);

    }
}
