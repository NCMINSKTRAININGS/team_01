package by.nc.teamone.entities;

import javax.persistence.*;

@Entity
@Table(name="status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="status_id")
    private long id;

    @Column(name="status_en")
    private String statusEn;

    @Column(name="status_ru")
    private String statusRu;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatusEn() {
        return statusEn;
    }

    public void setStatusEn(String statusEn) {
        this.statusEn = statusEn;
    }

    public String getStatusRu() {
        return statusRu;
    }

    public void setStatusRu(String statusRu) {
        this.statusRu = statusRu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Status status = (Status) o;

        if (id != status.id) return false;
        if (statusEn != null ? !statusEn.equals(status.statusEn) : status.statusEn != null) return false;
        if (statusRu != null ? !statusRu.equals(status.statusRu) : status.statusRu != null) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (statusEn != null ? statusEn.hashCode() : 0);
        result = 31 * result + (statusRu != null ? statusRu.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", statusEn='" + statusEn + '\'' +
                ", statusRu='" + statusRu + '\'' +
                '}';
    }
}