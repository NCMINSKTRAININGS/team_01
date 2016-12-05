package by.nc.teamone.entities;

import javax.persistence.*;

/**
<<<<<<< HEAD
 * Created by Valeria on 04.12.2016.
 */

=======
 * Created by Asus on 05.12.2016.
 */
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
@Entity
@Table(name="status")
public class Status {
    public Status() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

<<<<<<< HEAD
    @Column(name="status_en")
    private String statusEn;

    @Column(name="status_ru")
=======
    @Column(name="statusEn")
    private String statusEn;

    @Column(name="statusRu")
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
    private String statusRu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", statusEn='" + statusEn + '\'' +
                ", statusRu='" + statusRu + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Status status = (Status) o;

        if (id != status.id) return false;
        if (statusEn != null ? !statusEn.equals(status.statusEn) : status.statusEn != null) return false;
        return statusRu != null ? statusRu.equals(status.statusRu) : status.statusRu == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (statusEn != null ? statusEn.hashCode() : 0);
        result = 31 * result + (statusRu != null ? statusRu.hashCode() : 0);
        return result;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
