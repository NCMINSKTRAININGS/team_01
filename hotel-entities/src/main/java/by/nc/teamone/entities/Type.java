package by.nc.teamone.entities;

import javax.persistence.*;

@Entity
@Table(name="type")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="type_id")
    private long id;

    @Column(name="type_en")
    private String typeEn;

    @Column(name="type_ru")
    private String typeRu;

    @OneToOne(mappedBy = "type")
    private Room room;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public void setTypeRu(String typeRu) {
        this.typeRu = typeRu;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Type type = (Type) o;

        if (id != type.id) return false;
        if (typeEn != null ? !typeEn.equals(type.typeEn) : type.typeEn != null) return false;
        if (typeRu != null ? !typeRu.equals(type.typeRu) : type.typeRu != null) return false;
        return room != null ? room.equals(type.room) : type.room == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (typeEn != null ? typeEn.hashCode() : 0);
        result = 31 * result + (typeRu != null ? typeRu.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", typeEn='" + typeEn + '\'' +
                ", typeRu='" + typeRu + '\'' +
                ", room=" + room +
                '}';
    }
}