package immutable;

public class Responsibility {
    private String role;
    private Long idRole;

    public Responsibility(String role, Long idRole) {
        this.role = role;
        this.idRole = idRole;
    }

    public Responsibility(Responsibility resposibility){
        this.role = resposibility.role;
        this.idRole = resposibility.idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }
}
