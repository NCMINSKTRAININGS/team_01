package by.nc.teamone.entities;

import javax.persistence.*;

/**
 * Created by Valeria on 04.12.2016.
 */

@Entity
@Table(name="status")
public class Status {
    public Status() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="status_en")
    private String status_en;

    @Column(name="status_ru")
    private String status_ru;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus_en() {
        return status_en;
    }

    public void setStatus_en(String status_en) {
        this.status_en = status_en;
    }

    public String getStatus_ru() {
        return status_ru;
    }

    public void setStatus_ru(String status_ru) {
        this.status_ru = status_ru;
    }


    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", status_en='" + status_en + '\'' +
                ", status_ru='" + status_ru + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Status status = (Status) o;

        if (id != status.id) return false;
        if (status_en != null ? !status_en.equals(status.status_en) : status.status_en != null) return false;
        return status_ru != null ? status_ru.equals(status.status_ru) : status.status_ru == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status_en != null ? status_en.hashCode() : 0);
        result = 31 * result + (status_ru != null ? status_ru.hashCode() : 0);
        return result;
    }
}
