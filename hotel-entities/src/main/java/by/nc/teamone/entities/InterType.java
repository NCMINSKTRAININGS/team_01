package by.nc.teamone.entities;

import javax.persistence.*;

/**
 * Created by Valeria on 04.12.2016.
 */

@Entity
@Table(name="type")
public class InterType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="type_en")
    private String status_en;

    @Column(name="type_ru")
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterType interType = (InterType) o;

        if (id != interType.id) return false;
        if (status_en != null ? !status_en.equals(interType.status_en) : interType.status_en != null) return false;
        return status_ru != null ? status_ru.equals(interType.status_ru) : interType.status_ru == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status_en != null ? status_en.hashCode() : 0);
        result = 31 * result + (status_ru != null ? status_ru.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InterType{" +
                "id=" + id +
                ", status_en='" + status_en + '\'' +
                ", status_ru='" + status_ru + '\'' +
                '}';
    }
}
