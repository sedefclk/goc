package com.example.goc.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.goc.Entity.Users;
import com.example.goc.Repository.UserRepository;

@Service
public class UserService {

	private UserRepository _userRepository;
	@Autowired
    private EmailService _emailService;

    public UserService(UserRepository userRepository,EmailService emailService) {
        this._userRepository = userRepository;
        this._emailService=emailService;
    }
    public List<Users> findAllUsers() {
        return _userRepository.findAll();
    }


    public Optional<Users> findUserById(Long id) {
        return _userRepository.findById(id);
    }

    public void saveUser(Users user) {
    	_userRepository.save(user);
    	String subject = "Yeni Başvuru";
        String messageText = "Yeni Başvuru Alındı!,\n\n" +
                             "Yeni bir kullanıcı başvurusu alındı. Aşağıda kullanıcı detayları bulunmaktadır:\n\n" +
                             "Adı: " + user.getAdi() + "\n" +
                             "Soyadı: " + user.getSoyadi() + "\n" +
                             "Doğum Tarihi: " + user.getDogumTarihi() + "\n" +
                             "Cinsiyet: " + user.getCinsiyet() + "\n" +
                             "E-posta: " + user.getEmail() + "\n" +
                             "Telefon: " + user.getTelefon() + "\n" +
                             "Uyruk: " + user.getUyruk() + "\n" +
                             "Başvuru Sebebi: " + user.getBasvuruSebebi() + "\n" +
                             "Başvuru Şekli: " + user.getBasvuruSekli() + "\n" +
                             "Başvuru Yapılan İl: " + user.getBasvuruYapilanIl() + "\n" +
                             "Kimlik No: " + user.getKimlikNo() + "\n\n" +
                             "İyi günler.";
    	_emailService.sendFirstMail("info@gocrandevu.com", subject, messageText);

    }

    public void deleteUser(Long id) {
    	_userRepository.deleteById(id);
    }
}

