

/**
 *  StorageUnit.java
 * Author Ruvimbo Ndoro 220128871
 * Date 10June 2023
 */

package za.ac.cput.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class StorageUnit implements Serializable {

    @Id
    private String unitId;
    private String unitSizeDescription;
//    private String status;
    @Embedded
    private StorageUnitType storageUnitType;


    public StorageUnit() {
    }

    private StorageUnit(Builder builder) {
        this.unitId = builder.unitId;
        this.unitSizeDescription = builder.unitSizeDescription;
        this.storageUnitType = builder.storageUnitType;
//        this.status = builder.status;
    }
    public String getUnitId() {
        return unitId;
    }

    public String getUnitSizeDescription() {
        return unitSizeDescription;
    }
    public StorageUnitType getStorageUnitType(){
        return storageUnitType;
    }

//    public String getStatus() {
//        return status;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageUnit that = (StorageUnit) o;
        return Objects.equals(unitId, that.unitId) && Objects.equals(unitSizeDescription, that.unitSizeDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitId, unitSizeDescription);
    }

    @Override
    public String toString() {
        return "StorageUnit{" +
                "unitId='" + unitId + '\'' +
                ", description='" + unitSizeDescription + '\'' +

                '}';
    }

    public static class Builder {
        private String unitId;
        private String unitSizeDescription;
        private StorageUnitType storageUnitType;
//        private String status;

        public Builder setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }

        public Builder setUnitSizeDescription(String unitSizeDescription) {
            this.unitSizeDescription = unitSizeDescription;
            return this;
        }

//        public Builder setStatus(String status) {
//            this.status = status;
//            return this;
//        }

        public Builder copy(StorageUnit storageUnit) {
            this.unitId = storageUnit.unitId;
            this.unitSizeDescription = storageUnit.unitSizeDescription;
            this.storageUnitType = storageUnit.storageUnitType;
//            this.status = storageUnit.status;
            return this;

        }

        public Builder setStorageUnitType(StorageUnitType storageUnitType) {
            this.storageUnitType = storageUnitType;
            return this;
        }

        public StorageUnit build() {
            return new StorageUnit(this);
        }

    }
}