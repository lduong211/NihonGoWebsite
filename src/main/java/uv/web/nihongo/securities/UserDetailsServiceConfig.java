package uv.web.nihongo.securities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uv.web.nihongo.entities.Admin;
import uv.web.nihongo.repositories.AdminRepo;

@Service
public class UserDetailsServiceConfig implements UserDetailsService {

    @Autowired
    private AdminRepo adRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adRepo.findByUsername(username);
        if (admin == null)
            throw new UsernameNotFoundException("Không tìm thấy!");
        return User.builder().username(username).password(admin.getPassword()).roles(admin.getRoles()).build();
    }

}