package cogent.infotech.com;

import cogent.infotech.com.entity.Admin;
import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.AdminRepository;
import cogent.infotech.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringbootSecurityAppApplication {
	@Autowired
	UserRepository userRepository;
	@Autowired
	AdminRepository adminRepository;

	@PostConstruct
	public void initUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(101, "gyanendra", "gyanendra123", "gyanendra@gmail.com"));
		users.add(new User(102, "dipendra", "dipendra123", "dipendra@gmail.com"));
		users.add(new User(103, "birendra", "birendra123", "birendra@gmail.com"));
		userRepository.saveAll(users);

		adminRepository.save(new Admin(101, "musa", "musa123", "musa@gmail.com"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityAppApplication.class, args);
	}



}
