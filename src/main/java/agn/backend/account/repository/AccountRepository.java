package agn.backend.account.repository;

import agn.backend.account.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Profile, String> {
    Optional<Profile> findByGender(String gender);
}
