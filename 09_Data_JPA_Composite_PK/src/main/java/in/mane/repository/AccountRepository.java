package in.mane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mane.entity.Account;
import in.mane.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
