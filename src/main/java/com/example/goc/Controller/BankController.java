package com.example.goc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.goc.Entity.Request;
import com.example.goc.Service.BankService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class BankController {

    @Autowired
    private BankService _bankService;
    public BankController(BankService bankService) {
    	this._bankService=bankService;
    }

    @PostMapping("/banka-bilgileri")
    public ResponseEntity<Object> receiveBankInfo(@RequestBody Request requestData) {
    	System.out.println("banka bilgileri geldi");
    	System.out.println("dfkghjkfgdhgk" + requestData.getBankIban()+ requestData.getBankName());
    	_bankService.processBankInfo(requestData);
        return new ResponseEntity<>("Banka bilgileri başarıyla alındı.", HttpStatus.OK);
    }
}
