package agn.backend.account.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "login_info", schema = "anginhi")
public class LoginInfo {
    @Id
    private String id;
    private String loginName;
    private String password;
    private Boolean activeStatus;
    private String profileId;

    @Basic
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login_name")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "active_status")
    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Basic
    @Column(name = "profile_id")
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginInfo loginInfo = (LoginInfo) o;
        return Objects.equals(id, loginInfo.id) &&
                Objects.equals(loginName, loginInfo.loginName) &&
                Objects.equals(password, loginInfo.password) &&
                Objects.equals(activeStatus, loginInfo.activeStatus) &&
                Objects.equals(profileId, loginInfo.profileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loginName, password, activeStatus, profileId);
    }
}
