package by.nc.teamone.entities;

import javax.persistence.*;

/**
 * Created by Valeria on 04.12.2016.
 */

@Entity
@Table(name="type")
public class InterType {

    public InterType() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="type_en")
    private String typeEn;

    @Column(name="type_ru")
    private String typeRu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeEn() {
        return typeEn;
    }

    public void setTypeEn(String typeEn) {
        this.typeEn = typeEn;
    }

    public String getTypeRu() {
        return typeRu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterType interType = (InterType) o;

        if (id != interType.id) return false;
        if (typeEn != null ? !typeEn.equals(interType.typeEn) : interType.typeEn != null) return false;
        return typeRu != null ? typeRu.equals(interType.typeRu) : interType.typeRu == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (typeEn != null ? typeEn.hashCode() : 0);
        result = 31 * result + (typeRu != null ? typeRu.hashCode() : 0);
        return result;
    }

    public void setTypeRu(String typeRu) {
        this.typeRu = typeRu;

    }

    @Override
    public String toString() {
        return "InterType{" +
                "id=" + id +
                ", typeEn='" + typeEn + '\'' +
                ", typeRu='" + typeRu + '\'' +
                '}';
    }
}
