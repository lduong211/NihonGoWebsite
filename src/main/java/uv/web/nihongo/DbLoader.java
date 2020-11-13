// package uv.web.nihongo;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;

// import uv.web.nihongo.entities.*;
// import uv.web.nihongo.repositories.*;

// @Service
// public class DbLoader implements CommandLineRunner{

//     @Autowired
//     private AdminRepo adRepo;

//     @Override
//     public void run(String... args) throws Exception {
//         adRepo.save(new Admin(1, "Nhan", new BCryptPasswordEncoder().encode("123"), "Nhan", "ADMIN"));

//     }

// }