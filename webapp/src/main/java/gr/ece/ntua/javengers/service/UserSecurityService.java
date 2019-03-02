package gr.ece.ntua.javengers.service;

import gr.ece.ntua.javengers.entity.User;
import gr.ece.ntua.javengers.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class UserSecurityService implements UserDetailsService {

    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userRepository.getUserByUserName(username);

        if (!user.isPresent()) {
            LOG.warn("Username {} not found", username);
            throw new UsernameNotFoundException("Username" + username + "not found");

        }

        return user.get();
    }

}
